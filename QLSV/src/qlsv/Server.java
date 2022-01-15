package qlsv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.util.Base64;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class Server {

    static boolean kt = false;
    static Connection kn = null;
    static String hoten = "", masv = "";

    public static Connection layKetNoi(String port, String databaseName, String userName, String password) {
        Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + databaseName;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(uRL, userName, password);
            System.out.println("Kết nối CSDL thành công!");
            kt = true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Kết nối CSDL thất bại");
            kt = false;
        }
        return ketNoi;
    }

    public static String maHoa(String original) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        String SECRET_KEY = "12345678";
        SecretKeySpec skeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] byteEncrypted = cipher.doFinal(original.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
        return encrypted;
    }

    public static String giaiMa(String maHoa) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        String line;
        String SECRET_KEY = "12345678";
        SecretKeySpec skeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
        byte[] decoded = Base64.getDecoder().decode(maHoa);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] byteDecrypted = cipher.doFinal(decoded);
        line = new String(byteDecrypted);
        System.out.println(line);
        return line;
    }

    public static Double tinhDiemTB(String hoTen, String maSV, double diemToan, double diemVan, double diemAnh) {
        String dToan = "", dVan = "", dAnh = "";
        kt = true;
        try {
            hoTen = maHoa(hoTen);
            maSV = maHoa(maSV);
            dToan = maHoa(diemToan + "");
            dVan = maHoa(diemVan + "");
            dAnh = maHoa(diemAnh + "");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            PreparedStatement ps = kn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?)");
            ps.setString(1, maSV);
            ps.setString(2, hoTen);
            ps.setString(3, dToan);
            ps.setString(4, dVan);
            ps.setString(5, dAnh);
            ps.executeUpdate();
            System.out.println("Đã thêm vào cơ sơ dữ liệu thành công!");
        } catch (Exception e) {
            kt = false;
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
        }
        if (kt == true) {
            try {
                PreparedStatement ps = kn.prepareStatement("SELECT * FROM STUDENT WHERE MASV = '" + maSV + "'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    masv = rs.getString("MASV");
                    hoten = rs.getString("HOTEN");
                    dToan = rs.getString("DIEMTOAN");
                    dVan = rs.getString("DIEMVAN");
                    dAnh = rs.getString("DIEMANH");
                    System.out.println("Đã lấy dữ liệu thành công!");
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                kt = false;
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                masv = giaiMa(masv);
                hoten = giaiMa(hoten);
                diemToan = Double.parseDouble(giaiMa(dToan));
                diemVan = Double.parseDouble(giaiMa(dVan));
                diemAnh = Double.parseDouble(giaiMa(dAnh));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (kt == false) {
            return -5.0;
        } else {
            return (double) Math.ceil(((diemToan + diemVan + diemAnh) / 3) * 100) / 100;
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket sver = new ServerSocket(9999);
            System.out.println("server đã chạy!!!");

            Socket client = sver.accept();
            DataInputStream din = new DataInputStream(client.getInputStream());
            DataOutputStream dout = new DataOutputStream(client.getOutputStream());
            System.out.println("server đã kết nối với client!!!");
            while (kt == false) {
                kn = layKetNoi(din.readUTF(), din.readUTF(), din.readUTF(), din.readUTF());
                dout.writeBoolean(kt);
            }
            while (true) {
                dout.writeDouble(tinhDiemTB(din.readUTF(), din.readUTF(), din.readDouble(), din.readDouble(), din.readDouble()));
                dout.writeUTF(hoten);
                dout.writeUTF(masv.toUpperCase());
            }

        }
    }
}
