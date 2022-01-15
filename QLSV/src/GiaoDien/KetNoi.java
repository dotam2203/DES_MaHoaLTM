package GiaoDien;

import java.net.Socket;
import javax.swing.JOptionPane;

public class KetNoi extends javax.swing.JFrame {

    Socket client;

    public KetNoi() {
        this.setTitle("Kết nối với Server");
        initComponents();
        setup();
        this.setLocationRelativeTo(null);
    }

    public void setup() {
        jLabel_CongKetNoi.setText(" ");
        jLabel_TenDiaChi.setText(" ");
        jTextField_CongKetNoi.setText("");
        jTextField_TenDiaChi.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_TenDiaChi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CongKetNoi = new javax.swing.JTextField();
        jLabel_CongKetNoi = new javax.swing.JLabel();
        jLabel_TenDiaChi = new javax.swing.JLabel();
        jButton_KetNoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tên địa chỉ:");

        jTextField_TenDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenDiaChiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cổng kết nối");

        jLabel_CongKetNoi.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_CongKetNoi.setText("jLabel3");

        jLabel_TenDiaChi.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_TenDiaChi.setText("jLabel3");

        jButton_KetNoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_KetNoi.setText("KẾT NỐI");
        jButton_KetNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KetNoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KẾT NỐI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_KetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_CongKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_CongKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_TenDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_TenDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_TenDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_TenDiaChi))
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_CongKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CongKetNoi))
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addComponent(jButton_KetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_TenDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenDiaChiActionPerformed

    private void jButton_KetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KetNoiActionPerformed
        String ten = jTextField_TenDiaChi.getText();
        String cong = jTextField_CongKetNoi.getText();
        boolean kt = true;
        if (ten.equals("")) {
            jLabel_TenDiaChi.setText("Tên địa chỉ không được bỏ trống!");
            kt = false;
        }
        if (cong.equals("")) {
            jLabel_CongKetNoi.setText("Cổng kết nối không được bỏ trống!");
            kt = false;
        }
        if (kt == true) {
            try {
                client = new Socket(ten, Integer.parseInt(cong));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Kết nối không thành công: " + e);
                setup();
                return;
            }
        }
        if (kt == true) {
            DangNhap dn = new DangNhap(client);
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_KetNoiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KetNoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_KetNoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_CongKetNoi;
    private javax.swing.JLabel jLabel_TenDiaChi;
    private javax.swing.JTextField jTextField_CongKetNoi;
    private javax.swing.JTextField jTextField_TenDiaChi;
    // End of variables declaration//GEN-END:variables
}
