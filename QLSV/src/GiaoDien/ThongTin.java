package GiaoDien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ThongTin extends javax.swing.JFrame {

    Socket client;
    DataInputStream din;
    DataOutputStream dout;

    public ThongTin(Socket client) {
        this.setTitle("Nhập thông tin sinh viên");
        this.client = client;
        initComponents();
        setup();
        this.setLocationRelativeTo(null);
    }

    public void setup() {
        jTextField_Diemanh.setText("");
        jTextField_Diemtoan.setText("");
        jTextField_Diemvan.setText("");
        jTextField_Hovaten.setText("");
        jTextField_Masinhvien.setText("");
        jLabel_Diemanh.setText(" ");
        jLabel_Diemtoan.setText(" ");
        jLabel_Diemvan.setText(" ");
        jLabel_Hovaten.setText(" ");
        jLabel_Masinhvien.setText(" ");
        jLabel_HT.setText(" ");
        jLabel_MASV.setText(" ");
        jLabel_DTB.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Hovaten = new javax.swing.JTextField();
        jLabel_Hovaten = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Masinhvien = new javax.swing.JLabel();
        jTextField_Masinhvien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Diemtoan = new javax.swing.JLabel();
        jTextField_Diemtoan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Diemvan = new javax.swing.JLabel();
        jTextField_Diemvan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Diemanh = new javax.swing.JLabel();
        jTextField_Diemanh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_HT = new javax.swing.JLabel();
        jLabel_MASV = new javax.swing.JLabel();
        jLabel_DTB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Họ và tên:");

        jLabel_Hovaten.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Hovaten.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mã sinh viên:");

        jLabel_Masinhvien.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Masinhvien.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Điểm toán:");

        jLabel_Diemtoan.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Diemtoan.setText("jLabel3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Điểm văn:");

        jLabel_Diemvan.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Diemvan.setText("jLabel3");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Điểm anh:");

        jLabel_Diemanh.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Diemanh.setText("jLabel3");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("NHẬP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_HT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_HT.setText("jLabel3");

        jLabel_MASV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_MASV.setText("jLabel3");

        jLabel_DTB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_DTB.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_MASV, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_HT, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_DTB, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel_Masinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Diemtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Diemvan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Diemanh, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 25, Short.MAX_VALUE))
                                        .addComponent(jTextField_Hovaten)
                                        .addComponent(jTextField_Masinhvien)
                                        .addComponent(jTextField_Diemtoan)
                                        .addComponent(jTextField_Diemvan)
                                        .addComponent(jTextField_Diemanh)))))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Hovaten)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Masinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Masinhvien)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Diemtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Diemtoan)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Diemvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Diemvan)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Diemanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Diemanh)))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel_HT)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MASV)
                .addGap(18, 18, 18)
                .addComponent(jLabel_DTB)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean ktDiem(String diem) {
        double d = 0;
        try {
            d = Double.parseDouble(diem);
        } catch (Exception e) {
            return false;
        }
        if (d < 0 || d > 10) {
            return false;
        }
        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String hoTen = jTextField_Hovaten.getText();
        String maSV = jTextField_Masinhvien.getText();
        String diemToan = jTextField_Diemtoan.getText();
        String diemVan = jTextField_Diemvan.getText();
        String diemAnh = jTextField_Diemanh.getText();
        boolean kt = true;
        if (hoTen.equals("")) {
            jLabel_Hovaten.setText("Họ và tên không được bỏ trống!");
            kt = false;
        } else {
            jLabel_Hovaten.setText(" ");
        }
        if (maSV.equals("")) {
            jLabel_Masinhvien.setText("Mã sinh viên không được bỏ trống!");
            kt = false;
        } else {
            jLabel_Masinhvien.setText(" ");
        }
        if (diemToan.equals("")) {
            jLabel_Diemtoan.setText("Điểm toán không được bỏ trống!");
            kt = false;
        } else if (ktDiem(diemToan) == false) {
            jLabel_Diemtoan.setText("Điểm toán không đúng!");
            kt = false;
        } else {
            jLabel_Diemtoan.setText(" ");
        }
        if (diemVan.equals("")) {
            jLabel_Diemvan.setText("Điểm văn không được bỏ trống!");
            kt = false;
        } else if (ktDiem(diemVan) == false) {
            jLabel_Diemvan.setText("Điểm văn không đúng!");
            kt = false;
        } else {
            jLabel_Diemvan.setText(" ");
        }
        if (diemAnh.equals("")) {
            jLabel_Diemanh.setText("Điểm anh không được bỏ trống!");
            kt = false;
        } else if (ktDiem(diemAnh) == false) {
            jLabel_Diemanh.setText("Điểm anh không đúng!");
            kt = false;
        } else {
            jLabel_Diemanh.setText(" ");
        }
        if (kt == true) {
            try {
                din = new DataInputStream(client.getInputStream());
                dout = new DataOutputStream(client.getOutputStream());
                dout.writeUTF(hoTen);
                dout.writeUTF(maSV);
                dout.writeDouble(Double.parseDouble(diemToan));
                dout.writeDouble(Double.parseDouble(diemVan));
                dout.writeDouble(Double.parseDouble(diemAnh));
                setup();
                double temp = din.readDouble();
                if (temp >= 0) {
                    jLabel_DTB.setText("Điểm trung bình: " + temp);
                    jLabel_HT.setText("Họ và tên: " + din.readUTF());
                    jLabel_MASV.setText("Mã sinh viên: " + din.readUTF());
                } else {
                    jLabel_HT.setText("Thêm sinh viên không thành công!");
                    din.readUTF();
                    din.readUTF();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi " + e);
                setup();
                return;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_DTB;
    private javax.swing.JLabel jLabel_Diemanh;
    private javax.swing.JLabel jLabel_Diemtoan;
    private javax.swing.JLabel jLabel_Diemvan;
    private javax.swing.JLabel jLabel_HT;
    private javax.swing.JLabel jLabel_Hovaten;
    private javax.swing.JLabel jLabel_MASV;
    private javax.swing.JLabel jLabel_Masinhvien;
    private javax.swing.JTextField jTextField_Diemanh;
    private javax.swing.JTextField jTextField_Diemtoan;
    private javax.swing.JTextField jTextField_Diemvan;
    private javax.swing.JTextField jTextField_Hovaten;
    private javax.swing.JTextField jTextField_Masinhvien;
    // End of variables declaration//GEN-END:variables
}
