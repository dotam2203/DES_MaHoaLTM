package GiaoDien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JFrame {

    Socket client;
    DataInputStream din;
    DataOutputStream dout;

    public DangNhap(Socket client) {
        this.setTitle("Đăng nhập vào CSDL");
        this.client = client;
        initComponents();
        setup();
        this.setLocationRelativeTo(null);
    }

    public void setup() {
        jLabel_Ten.setText(" ");
        jLabel_Cong.setText(" ");
        jLabel_Username.setText(" ");
        jLabel_Password.setText(" ");
        jTextField_Ten.setText("");
        jTextField_Cong.setText("");
        jTextField_Username.setText("");
        jPasswordField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Ten = new javax.swing.JTextField();
        jLabel_Ten = new javax.swing.JLabel();
        jTextField_Cong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Cong = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_DangNhap = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tên CSDL:");

        jLabel_Ten.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Ten.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cổng:");

        jLabel_Cong.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Cong.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Username:");

        jLabel_Username.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Username.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Password:");

        jLabel_Password.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Password.setText("jLabel2");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ĐĂNG NHẬP");

        jButton_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_DangNhap.setText("ĐĂNG NHẬP");
        jButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jLabel_Cong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Cong, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jLabel_Ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Ten, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jPasswordField))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Ten)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Cong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Cong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Username)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Password)
                .addGap(45, 45, 45)
                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangNhapActionPerformed
        String dataName = jTextField_Ten.getText();
        String port = jTextField_Cong.getText();
        String userName = jTextField_Username.getText();
        char[] t = jPasswordField.getPassword();
        String password = String.valueOf(t);
        boolean kt = true;
        if (dataName.equals("")) {
            jLabel_Ten.setText("Tên không được bỏ trống!");
            kt = false;
        }
        if (port.equals("")) {
            jLabel_Cong.setText("Cổng không được bỏ trống!");
            kt = false;
        }
        if (userName.equals("")) {
            jLabel_Username.setText("Username không được bỏ trống!");
            kt = false;
        }
        if (password.equals("")) {
            jLabel_Password.setText("Password không được bỏ trống!");
            kt = false;
        }
        if (kt == true) {
            try {
                //client = new Socket("127.0.0.1", 9999);
                din = new DataInputStream(client.getInputStream());
                dout = new DataOutputStream(client.getOutputStream());
                dout.writeUTF(port);
                dout.writeUTF(dataName);
                dout.writeUTF(userName);
                dout.writeUTF(password);
                kt = din.readBoolean();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Kết nối cơ sở dữ liệu thất bại! " + e);
                setup();
                return;
            }
        }
        if (kt == true) {
            ThongTin tt = new ThongTin(client);
            tt.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Kết nối cơ sở dữ liệu thất bại!");
            setup();
        }
    }//GEN-LAST:event_jButton_DangNhapActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Cong;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Ten;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Cong;
    private javax.swing.JTextField jTextField_Ten;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
