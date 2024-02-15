
package ec.edu.espe.icecreamdeve.view;
import ec.edu.espe.icecreamdeve.controller.ClientController;
import ec.edu.espe.icecreamdeve.controller.ProductController;
import ec.edu.espe.icecreamdeve.controller.SaleNoteController;
import ec.edu.espe.icecreamdeve.model.Client;
import ec.edu.espe.icecreamdeve.model.Product;
import ec.edu.espe.icecreamdeve.model.SaleNote;
import static ec.edu.espe.icecreamdeve.utils.MDBManage.updateProductQuantity;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class FrmAddSaleNote extends javax.swing.JFrame {

    private ArrayList<Product> productsList = new ArrayList<>();
    public FrmAddSaleNote() {
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

        btnSalir3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnNewinvoice = new javax.swing.JButton();
        cmbProduct = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        lbClient = new javax.swing.JLabel();
        cmbClients = new javax.swing.JComboBox<>();
        btnMenu = new javax.swing.JButton();
        pnlAccion5 = new javax.swing.JPanel();
        btnProducts5 = new javax.swing.JButton();
        btnClient3 = new javax.swing.JButton();
        btnInvoice3 = new javax.swing.JButton();
        btnSaleNote3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir3.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir3.setFont(new java.awt.Font("Californian FB", 0, 12)); // NOI18N
        btnSalir3.setText("SALIR");
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(525, 233));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel30.setText("Crear Factura");

        btnNewinvoice.setText("Añadir factura");
        btnNewinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewinvoiceActionPerformed(evt);
            }
        });

        cmbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Press to show products" }));
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad a vender");

        jLabel1.setText("Selecciona el producto");

        lbDate.setText("Fecha de la vente");

        btnAddProduct.setText("Añadir un nuevo Producto");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        lbClient.setText("Selecciona el cliente");

        cmbClients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presione para mostrar los clientes" }));
        cmbClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDate)
                                    .addComponent(lbClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbProduct, 0, 364, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addComponent(cmbClients, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnNewinvoice)
                        .addGap(112, 112, 112)
                        .addComponent(btnAddProduct)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel30)
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClient)
                    .addComponent(cmbClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewinvoice)
                    .addComponent(btnAddProduct))
                .addGap(88, 88, 88))
        );

        btnMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnMenu.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        btnMenu.setText("Return Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        pnlAccion5.setBackground(new java.awt.Color(51, 51, 51));
        pnlAccion5.setForeground(new java.awt.Color(102, 102, 102));

        btnProducts5.setBackground(new java.awt.Color(51, 51, 51));
        btnProducts5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnProducts5.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts5.setText("Productos");
        btnProducts5.setBorder(null);
        btnProducts5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProducts5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducts5ActionPerformed(evt);
            }
        });

        btnClient3.setBackground(new java.awt.Color(51, 51, 51));
        btnClient3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnClient3.setForeground(new java.awt.Color(255, 255, 255));
        btnClient3.setText("Clientes");
        btnClient3.setBorder(null);
        btnClient3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClient3ActionPerformed(evt);
            }
        });

        btnInvoice3.setBackground(new java.awt.Color(51, 51, 51));
        btnInvoice3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInvoice3.setForeground(new java.awt.Color(255, 255, 255));
        btnInvoice3.setText("Facturas");
        btnInvoice3.setBorder(null);
        btnInvoice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoice3ActionPerformed(evt);
            }
        });

        btnSaleNote3.setBackground(new java.awt.Color(51, 51, 51));
        btnSaleNote3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSaleNote3.setForeground(new java.awt.Color(255, 255, 255));
        btnSaleNote3.setText("Notas de Venta");
        btnSaleNote3.setBorder(null);
        btnSaleNote3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleNote3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAccion5Layout = new javax.swing.GroupLayout(pnlAccion5);
        pnlAccion5.setLayout(pnlAccion5Layout);
        pnlAccion5Layout.setHorizontalGroup(
            pnlAccion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAccion5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnlAccion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaleNote3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoice3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAccion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnProducts5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClient3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        pnlAccion5Layout.setVerticalGroup(
            pnlAccion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccion5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnProducts5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClient3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInvoice3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaleNote3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlAccion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenu)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAccion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir3)
                    .addComponent(btnMenu))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        this.setVisible(false);
        this.dispose();
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnNewinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewinvoiceActionPerformed
        addSaleNote();
        JOptionPane.showMessageDialog(this, "New invoice added successfully.");
    }//GEN-LAST:event_btnNewinvoiceActionPerformed

    private void cmbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductActionPerformed
        ProductController controller=new ProductController();
        ArrayList<Product> products = controller.findAllProducts();
        for (Product product : products) {
            cmbProduct.addItem(product);
        }
    }//GEN-LAST:event_cmbProductActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        registerProduct();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FrmProductsMenu frmProductmenu = new FrmProductsMenu();
        this.setVisible(false);
        frmProductmenu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnProducts5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducts5ActionPerformed
        FrmProductsMenu productMenu = new FrmProductsMenu();
        this.setVisible(false);
        productMenu.setVisible(true);
    }//GEN-LAST:event_btnProducts5ActionPerformed

    private void btnClient3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClient3ActionPerformed
        FrmMenuClient clientMenu=new FrmMenuClient();
        this.setVisible(false);
        clientMenu.setVisible(true);
    }//GEN-LAST:event_btnClient3ActionPerformed

    private void btnInvoice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoice3ActionPerformed
        FrmMenuInvoices invoiceMenu = new FrmMenuInvoices();
        this.setVisible(false);
        invoiceMenu.setVisible(true);
    }//GEN-LAST:event_btnInvoice3ActionPerformed

    private void btnSaleNote3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleNote3ActionPerformed
        FrmMenuSaleNote saleNote=new FrmMenuSaleNote();
        this.setVisible(false);
        saleNote.setVisible(true);
    }//GEN-LAST:event_btnSaleNote3ActionPerformed

    private void cmbClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientsActionPerformed
        ClientController controller=new ClientController();
        ArrayList<Client> clients=controller.findAllClients();
        for(Client auxClient:clients){
            cmbClients.addItem(auxClient);
        }
    }//GEN-LAST:event_cmbClientsActionPerformed
    
    private ArrayList<Product> registerProduct(){
        Product selectedProduct = (Product) cmbProduct.getSelectedItem();
        int amount = Integer.parseInt(txtAmount.getText());
        
        Product productAux = new Product(selectedProduct.getId(), amount, selectedProduct.getName(),selectedProduct.getCost());
        productsList.add(productAux);
        cmbProduct.setSelectedIndex(-1);
        txtDate.setVisible(false);
        lbDate.setVisible(false);
        lbClient.setVisible(false);
        cmbClients.setVisible(false);
        return productsList;
    } 
    private void addSaleNote() {
        SaleNoteController controller = new SaleNoteController();
        int id = SaleNoteController.getActualId(controller.findAllInvoices());
        Date date = new Date(txtDate.getText());
        Client selectedClient=(Client)cmbClients.getSelectedItem();
        float totalValue=0;
        for(Product auxProduct:productsList){
            totalValue+=auxProduct.getAmount()*auxProduct.getCost();
             updateProductQuantity(auxProduct.getName(), auxProduct.getAmount());
        }

        SaleNote newSaleNote = new SaleNote(id, selectedClient, date, productsList, totalValue);
        controller.register(newSaleNote);
        FrmMenuSaleNote menuSaleNotes=new FrmMenuSaleNote();
        this.setVisible(false);
        menuSaleNotes.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(FrmAddSaleNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddSaleNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddSaleNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddSaleNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddSaleNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnClient3;
    private javax.swing.JButton btnInvoice3;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNewinvoice;
    private javax.swing.JButton btnProducts5;
    private javax.swing.JButton btnSaleNote3;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JComboBox<Object> cmbClients;
    private javax.swing.JComboBox<Object> cmbProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbClient;
    private javax.swing.JLabel lbDate;
    private javax.swing.JPanel pnlAccion5;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
