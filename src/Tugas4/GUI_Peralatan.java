/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas4;

/**
 *
 * @author Prakoso
 */
public class GUI_Peralatan extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Peralatan
     */
    public GUI_Peralatan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jwarna = new javax.swing.JTextField();
        jlusin = new javax.swing.JTextField();
        jjumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jharga = new javax.swing.JTextField();
        jproses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jmemo = new javax.swing.JTextArea();
        cbx1 = new javax.swing.JCheckBox();
        jdiskon = new javax.swing.JTextField();
        jjenis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MEMO PENJUALAN PERALATAN RUMAH TANGGA");

        jLabel2.setText("Jenis Barang");

        jLabel3.setText("Warna");

        jLabel5.setText("Jumlah Lusin");

        jLabel6.setText("Jumlah Barang");

        jLabel7.setText("Diskon");

        jLabel8.setText("Harga Barang");

        jproses.setText("Proses");
        jproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprosesActionPerformed(evt);
            }
        });

        jmemo.setColumns(20);
        jmemo.setRows(5);
        jScrollPane1.setViewportView(jmemo);

        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jproses))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(75, 75, 75))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbx1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jharga)
                                    .addComponent(jwarna)
                                    .addComponent(jlusin)
                                    .addComponent(jjumlah)
                                    .addComponent(jdiskon)
                                    .addComponent(jjenis, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlusin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7))
                            .addComponent(jdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addComponent(jproses))
                    .addComponent(jScrollPane1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprosesActionPerformed
        // TODO add your handling code here:
        jmemo.setText("");
        Peralatan_dapur Barang = new Peralatan_dapur();
        Barang.jenis = jjenis.getText();
        Barang.setpenjualan(Integer.parseInt(jjumlah.getText()));
        Barang.warna = jwarna.getText();
        Barang.a = Integer.parseInt(jlusin.getText());
        Barang.setharga(Integer.parseInt(jharga.getText()));
        Barang.setpenjualan( Integer.parseInt(jjumlah.getText()));
        if(cbx1.isSelected()){
           jmemo.append("Jenis                                   :   "+Barang.jenis + "\n\n");
           jmemo.append("Warna                                 :   "+ Barang.warna + "\n\n");
           jmemo.append("Harga                                  :   "+ "Rp. " +Barang.getharga()+ "\n\n");
           jmemo.append("Jumlah Pembelian           :   " + Barang.getpenjualan() +" Buah" + "\n\n");
           jmemo.append("Total Harga Satuan           :   " +"Rp. "+ Barang.tampilsatuan()+ "\n\n");
           jmemo.append("Jumlah Lusin                     :   "+ Barang.a +" Lusin "+ "\n\n");
           jmemo.append("Total Harga Lusin             :   " + "Rp. " +Barang.tampillusin()+ "\n\n");
           jmemo.append("Total harga Lusin( + Diskon)     :   " + "Rp. "+ Barang.gettotaldis(Barang.getharga())+ "\n\n");     
       }
            else{
           jmemo.append("Jenis                                   :   "+Barang.jenis + "\n\n");
           jmemo.append("Warna                                 :   "+ Barang.warna + "\n\n");
           jmemo.append("Harga                                  :   "+ "Rp. " +Barang.getharga()+ "\n\n");
           jmemo.append("Jumlah Pembelian           :   " + Barang.getpenjualan() +" Buah" + "\n\n");
           jmemo.append("Total Harga Satuan           :   " +"Rp. "+ Barang.tampilsatuan()+ "\n\n");
           jmemo.append("Jumlah Lusin                     :   "+ Barang.a +" Lusin "+ "\n\n");
           jmemo.append("Total Harga Lusin             :   " + "Rp. " +Barang.tampillusin()+ "\n\n");
            }
    }//GEN-LAST:event_jprosesActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        // TODO add your handling code here:
        if(cbx1.isSelected()){
            jdiskon.setEnabled(true);
        }
        else{
            jdiskon.setEnabled(false);
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Peralatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Peralatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Peralatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Peralatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Peralatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbx1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jdiskon;
    private javax.swing.JTextField jharga;
    private javax.swing.JTextField jjenis;
    private javax.swing.JTextField jjumlah;
    private javax.swing.JTextField jlusin;
    private javax.swing.JTextArea jmemo;
    private javax.swing.JButton jproses;
    private javax.swing.JTextField jwarna;
    // End of variables declaration//GEN-END:variables
}
