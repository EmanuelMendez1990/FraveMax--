package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import javax.swing.JOptionPane;

public class AgregarProducto extends javax.swing.JInternalFrame {

    private static ProductoData pd = new ProductoData();

    public AgregarProducto() {
        initComponents();
        cargarCategorias();
    }

    private void cargarCategorias() {
        for (Categoria c : Categoria.values()) {
            jcbCategoria.addItem(c.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtDescuento = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcheckActivo = new javax.swing.JCheckBox();

        jtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelKeyReleased(evt);
            }
        });

        jLabel8.setText("Activo");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Stock");

        jLabel5.setText("Categoria");

        jLabel6.setText("Precio");

        jLabel7.setText("Descuento");

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtStockActionPerformed(evt);
            }
        });
        jtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtStockKeyReleased(evt);
            }
        });

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioKeyReleased(evt);
            }
        });

        jtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDescuentoKeyReleased(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jcheckActivo.setText("Activo");
        jcheckActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jbAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jcheckActivo)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcheckActivo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        if (validacion()) {
            agregarProducto();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Faltan completar datos");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed
    private boolean validacion() {
        boolean valido = false;
        if (!jtNombre.getText().isEmpty()
                && !jtNombre.getText().equals("0")
                && !jtDescripcion.getText().isEmpty()
                && !jtStock.getText().isEmpty()
                && !jtPrecio.getText().isEmpty()
                && !jtDescuento.getText().isEmpty()) {
            valido = true;
        }
        return valido;
    }
    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased

    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)//Evaluamos los numeros del teclado
                && (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)//aca del numerico
                && (evt.getKeyCode() != 8)) {//aca el borrar hacia atras
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtTelKeyReleased

    private void jtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jcheckActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckActivoActionPerformed

    private void jtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
                && //solo aceptamos numeros
                (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)
                && //los del teclaod numerico
                (evt.getKeyCode() != 8)
                && //la tecla de borrar
                (evt.getKeyCode() != 46)) { //el .
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtPrecio.setText("");
        }
    }//GEN-LAST:event_jtPrecioKeyReleased

    private void jtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
                && //solo aceptamos numeros
                (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)
                && //los del teclaod numerico
                (evt.getKeyCode() != 8)) {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtStock.setText("");
        }
    }//GEN-LAST:event_jtStockKeyReleased

    private void jtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescuentoKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
                && //solo aceptamos numeros
                (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)
                && //los del teclaod numerico
                (evt.getKeyCode() != 8)) {
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtDescuento.setText("");
        }
    }//GEN-LAST:event_jtDescuentoKeyReleased
    private void agregarProducto() {
//        public Producto(int stock, String nombre, String descripcion, Categoria categoria, double precio, int enOferta, boolean estado) {
        String nombre, descripcion, precioString, enOfertaString, stockString;
        Categoria cat;
        Double precio;
        int stock, enOferta;
        boolean estado = jcheckActivo.isSelected();
        cat = Categoria.valueOf(jcbCategoria.getSelectedItem() + "");
        nombre = jtNombre.getText();
        descripcion = jtDescripcion.getText();
        precioString = jtPrecio.getText();
        precio = Double.parseDouble(precioString);
        enOfertaString = jtDescuento.getText();
        enOferta = Integer.parseInt(enOfertaString);
        stockString = jtStock.getText();
        stock = Integer.parseInt(stockString);
        Producto nuevo = new Producto(stock, nombre, descripcion, cat, precio, enOferta, estado);

        pd.agregarProducto(nuevo);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JCheckBox jcheckActivo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtDescuento;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
}
