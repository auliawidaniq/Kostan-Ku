/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostan.ku;

/**
 *
 * @author Aulia
 */
public class KostDreamNew extends javax.swing.JFrame {

    /**
     * Creates new form KostDreamNew
     */
    public KostDreamNew() {
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

        panelAtas = new javax.swing.JPanel();
        judulKost = new javax.swing.JLabel();
        roomlist = new javax.swing.JLabel();
        panelBawah = new javax.swing.JPanel();
        angka1 = new javax.swing.JLabel();
        angka2 = new javax.swing.JLabel();
        angka3 = new javax.swing.JLabel();
        labelWM = new javax.swing.JLabel();
        btnEternal = new javax.swing.JButton();
        btnCastle = new javax.swing.JButton();
        btnLake = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAtas.setBackground(new java.awt.Color(226, 252, 226));

        judulKost.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        judulKost.setForeground(new java.awt.Color(153, 153, 255));
        judulKost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulKost.setText("Kost Dream Kost");

        roomlist.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        roomlist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomlist.setText("Room List");

        panelBawah.setBackground(new java.awt.Color(235, 235, 254));

        angka1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        angka1.setForeground(new java.awt.Color(153, 153, 255));
        angka1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        angka1.setText("1.");

        angka2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        angka2.setForeground(new java.awt.Color(153, 153, 255));
        angka2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        angka2.setText("2.");

        angka3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        angka3.setForeground(new java.awt.Color(153, 153, 255));
        angka3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        angka3.setText("3.");

        labelWM.setFont(new java.awt.Font("Serif", 3, 11)); // NOI18N
        labelWM.setForeground(new java.awt.Color(153, 153, 255));
        labelWM.setText("Kostan-Ku : Kukusan UI");

        btnEternal.setBackground(new java.awt.Color(204, 255, 255));
        btnEternal.setFont(new java.awt.Font("Segoe UI Semibold", 2, 11)); // NOI18N
        btnEternal.setForeground(new java.awt.Color(51, 51, 255));
        btnEternal.setText("Eternal Room");
        btnEternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEternalActionPerformed(evt);
            }
        });

        btnCastle.setBackground(new java.awt.Color(204, 255, 255));
        btnCastle.setFont(new java.awt.Font("Segoe UI Semibold", 2, 11)); // NOI18N
        btnCastle.setForeground(new java.awt.Color(51, 102, 255));
        btnCastle.setText("Castle Room");
        btnCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastleActionPerformed(evt);
            }
        });

        btnLake.setBackground(new java.awt.Color(204, 255, 255));
        btnLake.setFont(new java.awt.Font("Segoe UI Semibold", 2, 11)); // NOI18N
        btnLake.setForeground(new java.awt.Color(51, 51, 255));
        btnLake.setText("Lake Room");
        btnLake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLakeActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBawahLayout = new javax.swing.GroupLayout(panelBawah);
        panelBawah.setLayout(panelBawahLayout);
        panelBawahLayout.setHorizontalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBawahLayout.createSequentialGroup()
                        .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelBawahLayout.createSequentialGroup()
                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLake, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBawahLayout.createSequentialGroup()
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCastle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBawahLayout.createSequentialGroup()
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnEternal)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBawahLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelWM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        panelBawahLayout.setVerticalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBawahLayout.createSequentialGroup()
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEternal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka1))
                .addGap(18, 18, 18)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCastle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2))
                .addGap(29, 29, 29)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLake, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3))
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(labelWM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAtasLayout = new javax.swing.GroupLayout(panelAtas);
        panelAtas.setLayout(panelAtasLayout);
        panelAtasLayout.setHorizontalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulKost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addComponent(roomlist, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
            .addComponent(panelBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAtasLayout.setVerticalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulKost, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomlist, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEternalActionPerformed
        // TODO add your handling code here:
        EternalRoomNew eternal = new EternalRoomNew ();
        eternal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEternalActionPerformed

    private void btnCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastleActionPerformed
        // TODO add your handling code here:
        CastleRoomNew castle = new CastleRoomNew ();
        castle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCastleActionPerformed

    private void btnLakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLakeActionPerformed
        // TODO add your handling code here:
        LakeRoomNew Lake = new LakeRoomNew ();
        Lake.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLakeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ListKostan kostan = new ListKostan();
        kostan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(KostDreamNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KostDreamNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KostDreamNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KostDreamNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KostDreamNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angka1;
    private javax.swing.JLabel angka2;
    private javax.swing.JLabel angka3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCastle;
    private javax.swing.JButton btnEternal;
    private javax.swing.JButton btnLake;
    private javax.swing.JLabel judulKost;
    private javax.swing.JLabel labelWM;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JPanel panelBawah;
    private javax.swing.JLabel roomlist;
    // End of variables declaration//GEN-END:variables
}
