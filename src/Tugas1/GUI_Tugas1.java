/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Prakoso
 */
public class GUI_Tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Tugas1
     */
    public GUI_Tugas1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jmerk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alat = new javax.swing.JTextArea();
        btnmulai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jwarna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnpiring = new javax.swing.JRadioButton();
        btngelas = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jsupply = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA PENJUALAN");

        jLabel2.setText("MERK");

        alat.setColumns(20);
        alat.setRows(5);
        jScrollPane1.setViewportView(alat);

        btnmulai.setText("MULAI");
        btnmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulaiActionPerformed(evt);
            }
        });

        jLabel3.setText("WARNA");

        jLabel5.setText("JENIS");

        buttonGroup1.add(btnpiring);
        btnpiring.setText("PIRING");
        btnpiring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiringActionPerformed(evt);
            }
        });

        buttonGroup1.add(btngelas);
        btngelas.setText("GELAS");
        btngelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngelasActionPerformed(evt);
            }
        });

        jLabel6.setText("HARGA");

        jharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhargaActionPerformed(evt);
            }
        });

        jLabel7.setText("SUPPLY");

        jsupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsupplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsupply, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmerk, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jwarna, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpiring)
                            .addComponent(btngelas)
                            .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnmulai)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jmerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jsupply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnpiring))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btngelas)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnmulai)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jhargaActionPerformed

    private void btngelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngelasActionPerformed

    private void btnpiringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpiringActionPerformed

    private void jsupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsupplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsupplyActionPerformed

    private void btnmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulaiActionPerformed
        // TODO add your handling code here:
        alat.setText("");
 Peralatan barang= new Peralatan();
 barang.setnama(jmerk.getText());
 barang.setwarna(jwarna.getText());
 barang.setsupply(jsupply.getText());
 barang.setharga(jharga.getText());
 
 barang.setharga(jharga.getText());
 if (btnpiring.isSelected()){
 barang.setjenis(btnpiring.getText());
 }else{
 barang.setjenis(btngelas.getText());
 }

 alat.append("DATA BARANG" + "\n");
 alat.append( "\n");
 alat.append( "\n");
 alat.append("Merk   : " + barang.getnama()+ "\n");
 alat.append("Warna  : " + barang.getWarna()+ "\n");
 alat.append("Supply : " + barang.getsupply()+ "\n");
 alat.append("Jenis  : " + barang.getjenis()+ "\n");
 alat.append("Harga  : " + barang.getHarga()+ "\n");
    }//GEN-LAST:event_btnmulaiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alat;
    private javax.swing.JRadioButton btngelas;
    private javax.swing.JButton btnmulai;
    private javax.swing.JRadioButton btnpiring;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jharga;
    private javax.swing.JTextField jmerk;
    private javax.swing.JTextField jsupply;
    private javax.swing.JTextField jwarna;
    // End of variables declaration//GEN-END:variables
}
