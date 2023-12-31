/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Prakoso
 */
import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableColumnModel;
    import javax.swing.table.DefaultTableModel;

public class GUI_Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Potongan
     */
    public GUI_Penjualan() {
        initComponents();
        //mengambil model data dari tabel dan menyimpan di dalam objek DefaultTableModel.dataModel.
        DefaultTableModel dataModel = (DefaultTableModel) tablert.getModel();
        //mendapatkan jumlah baris tang ada dalam model data saat ini
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
        // menghapus baris terakhir pada datamodel
        dataModel.removeRow(rowCount -1 );
        //memperbarui nilai rowCount setelah penghapusan baris terakhir
        rowCount = dataModel.getRowCount();
        }
    }
        public void clear() {
         jjenis.setText("");
         jwarna.setText("");
         jjual.setText("");
         jbeli.setText("");
         jhargajual.setText("");
         jstokmasuk.setText("");
         jstokkeluar.setText("");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jjenis = new javax.swing.JTextField();
        jwarna = new javax.swing.JTextField();
        jjual = new javax.swing.JTextField();
        jbeli = new javax.swing.JTextField();
        jhargajual = new javax.swing.JTextField();
        jstokmasuk = new javax.swing.JTextField();
        jstokkeluar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablert = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jenis");

        jLabel2.setText("Warna");

        jLabel3.setText("Penjualan");

        jLabel4.setText("Harga Beli");

        jLabel5.setText("Harga Jual");

        jLabel6.setText("Stok Masuk");

        jLabel7.setText("Stok Keluar");

        jjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjenisActionPerformed(evt);
            }
        });

        jLabel8.setText("DATA PENJUALAN PERALATAN RUMAH TANGGA");

        tablert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Jenis Barang", "Warna ", "Penjualan ", "Harga Beli", "Harga Jual", "Keuntungan", "Stok Masuk", "Stok Keluar", "Sisa Stok"
            }
        ));
        jScrollPane1.setViewportView(tablert);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jjenis, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jwarna)
                                    .addComponent(jjual, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbeli)
                                    .addComponent(jhargajual)
                                    .addComponent(jstokmasuk)
                                    .addComponent(jstokkeluar))))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel8)
                        .addGap(0, 417, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(simpan)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(close)
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jhargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jstokmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jstokkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(close))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jjenisActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Data Ditambahkan Ke tabel");
        DefaultTableModel dataModel = (DefaultTableModel)
        tablert.getModel();
        List list = new ArrayList<>();
        tablert.setAutoCreateColumnsFromModel(true);
        PeralatanPRT obj = new PeralatanPRT();
        obj.jenis = jjenis.getText();
        obj.warna = jwarna.getText();
        obj.penjualan = Integer.parseInt(jjual.getText());
        obj.hargabeli= Integer.parseInt(jbeli.getText());
        obj.hargajual = Integer.parseInt(jhargajual.getText());
        obj.stokmasuk = Integer.parseInt(jstokmasuk.getText());
        obj.stokkeluar = Integer.parseInt(jstokkeluar.getText());
         list.add(obj.jenis);
         list.add(obj.warna);
         list.add(obj.penjualan);
         list.add(obj.hargabeli);
         list.add(obj.hargajual);
         list.add(obj.total());
         list.add(obj.stokmasuk);
         list.add(obj.stokkeluar);
         list.add(obj.total(obj.stokmasuk, obj.stokkeluar));  
        dataModel.addRow(list.toArray());
        clear();  

    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel)tablert.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        }

    }//GEN-LAST:event_hapusActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbeli;
    private javax.swing.JTextField jhargajual;
    private javax.swing.JTextField jjenis;
    private javax.swing.JTextField jjual;
    private javax.swing.JTextField jstokkeluar;
    private javax.swing.JTextField jstokmasuk;
    private javax.swing.JTextField jwarna;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tablert;
    // End of variables declaration//GEN-END:variables
}
