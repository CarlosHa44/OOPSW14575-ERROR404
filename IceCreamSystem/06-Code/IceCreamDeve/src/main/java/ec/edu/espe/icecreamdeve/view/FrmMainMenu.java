
package ec.edu.espe.icecreamdeve.view;

/**
 *
 * @author Carlos Hernandez, Mateo Iza, Juan Granda, Josue Guayasamin
 */
public class FrmMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmLoggin
     */
    public FrmMainMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBienvenidoGlacial = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnlAccion = new javax.swing.JPanel();
        btnProducts = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnInvoice = new javax.swing.JButton();
        btnSaleNote = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        lbBienvenidoGlacial.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        jButton2.setText("Clientes");

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Facturas");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAccion.setBackground(new java.awt.Color(51, 51, 51));
        pnlAccion.setForeground(new java.awt.Color(102, 102, 102));

        btnProducts.setBackground(new java.awt.Color(51, 51, 51));
        btnProducts.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts.setText("Productos");
        btnProducts.setBorder(null);
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });

        btnClient.setBackground(new java.awt.Color(51, 51, 51));
        btnClient.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnClient.setForeground(new java.awt.Color(255, 255, 255));
        btnClient.setText("Clientes");
        btnClient.setBorder(null);
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnInvoice.setBackground(new java.awt.Color(51, 51, 51));
        btnInvoice.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnInvoice.setText("Facturas");
        btnInvoice.setBorder(null);
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        btnSaleNote.setBackground(new java.awt.Color(51, 51, 51));
        btnSaleNote.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSaleNote.setForeground(new java.awt.Color(255, 255, 255));
        btnSaleNote.setText("Notas de Venta");
        btnSaleNote.setBorder(null);
        btnSaleNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAccionLayout = new javax.swing.GroupLayout(pnlAccion);
        pnlAccion.setLayout(pnlAccionLayout);
        pnlAccionLayout.setHorizontalGroup(
            pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAccionLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaleNote, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        pnlAccionLayout.setVerticalGroup(
            pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccionLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaleNote, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 233));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Quienes Somos");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N

        jLabel3.setText("Glacial es una empresa líder dedicada a la distribución de helado pre-fabricado");

        jLabel4.setText("ofreciendo una amplia variedad de sabores y productos de alta calidad. Con una");

        jLabel5.setText("pasión por llevar momentos dulces y refrescantes a sus clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Californian FB", 0, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
// TODO add your handling code here:

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        FrmProductsMenu productMenu=new FrmProductsMenu();
        this.setVisible(false);
        productMenu.setVisible(true);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        FrmMenuClient clientMenu=new FrmMenuClient();
        this.setVisible(false);
        clientMenu.setVisible(true);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        FrmMenuInvoices invoiceMenu=new FrmMenuInvoices();
        this.setVisible(false);
        invoiceMenu.setVisible(true);
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnSaleNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleNoteActionPerformed
        FrmMenuSaleNote saleNote=new FrmMenuSaleNote();
        this.setVisible(false);
        saleNote.setVisible(true);
    }//GEN-LAST:event_btnSaleNoteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnSaleNote;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBienvenidoGlacial;
    private javax.swing.JPanel pnlAccion;
    // End of variables declaration//GEN-END:variables
}
