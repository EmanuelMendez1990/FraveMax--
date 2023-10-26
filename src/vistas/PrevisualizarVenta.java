/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import datos.DetalleData;
import datos.ProductoData;
import datos.VentaData;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Usuario;
import entidades.Venta;
import java.util.HashMap;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class PrevisualizarVenta extends javax.swing.JInternalFrame {

    private static HashMap<Integer, Integer> compra;
    private static Usuario cliente;
    private static Usuario vendedor;
    private static VentaData ventadata = new VentaData();
    private static DetalleData detalledata = new DetalleData();
    private static ProductoData pd = new ProductoData();

    private DefaultTableModel md2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public PrevisualizarVenta() {
        initComponents();
        crearColumnas2();
    }

    public PrevisualizarVenta(HashMap<Integer, Integer> compra, Usuario cliente, Usuario vendedor) {
        initComponents();
        crearColumnas2();
        this.compra = compra;
        this.cliente = cliente;
        this.vendedor = vendedor;
        jlNombre.setText(cliente.getNombre() + " " + cliente.getApellido());
        jlDni.setText(cliente.getDni() + "");
        jlNombreVendedor.setText(vendedor.getNombre() + " " + vendedor.getApellido());

        cargarTabla();

    }

    private void crearColumnas2() {
        md2.addColumn("ID");
        md2.addColumn("Nombre");
        md2.addColumn("Precio");
        md2.addColumn("Cantidad");
        md2.addColumn("Total");

        jtVenta.setModel(md2);
    }

    private void cargarTabla() {
        double total = 0;
        double totalfinal = 0;
        for (HashMap.Entry<Integer, Integer> set : compra.entrySet()) {
            Producto prod = pd.listarProducto(set.getKey());
            double descuento = prod.getEnOferta();
            total = prod.getPrecio() * (1 - descuento / 100);
            md2.addRow(new Object[]{set.getKey(),
                prod.getNombre(),
                prod.getPrecio(),
                set.getValue(),
                total * set.getValue()

            });
            totalfinal += (prod.getPrecio() * (1 - descuento / 100)) * set.getValue();
        }
        jlTotal.setText(totalfinal + "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVenta = new javax.swing.JTable();
        jlNombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlNombreVendedor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Datos de la Venta.");

        jLabel2.setText("Nombre:");

        jLabel6.setText("Dni:");

        jlDni.setText("jLabel7");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Datos del Cliente");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Productos ");

        jtVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVentaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtVenta);

        jlNombre.setText("jLabel9");

        jLabel7.setText("Vendedor:");

        jlNombreVendedor.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Total: ");

        jlTotal.setText("jLabel10");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Imprimir Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jlNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(40, 40, 40)
                                        .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jlDni)
                    .addComponent(jlNombre))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlNombreVendedor)
                    .addComponent(jLabel9)
                    .addComponent(jlTotal))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVentaMouseClicked
        int fila = jtVenta.getSelectedRow();
        System.out.println("Fila elegida " + fila);
        if (jtVenta.getSelectedRow() >= 0) {
//            jbBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtVentaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JDesktopPane desktopPane = getDesktopPane();
        NuevaVenta f1 = new NuevaVenta(compra);

        desktopPane.add(f1);//add f1 to desktop pane
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearVenta();

        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void crearVenta() {
        try {
            double total = Double.parseDouble(jlTotal.getText());
            java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
            Venta venta = new Venta(vendedor.getIdUsuario(), date, total, cliente.getIdUsuario());
            Venta ventaConId = ventadata.IngresarVenta(venta);
            System.out.println("Venta Exitosa.ID: " + ventaConId.getIdVenta());
            if (ventaConId.getIdVenta() != 0) {
                for (HashMap.Entry<Integer, Integer> set : compra.entrySet()) {
                    Producto p = pd.listarProducto(set.getKey());

                    total = p.getPrecio() * set.getValue();

                    DetalleVenta detalleVenta = new DetalleVenta(
                            ventaConId.getIdVenta(),
                            p.getIdProducto(),
                            set.getValue(),
                            total,
                            true,
                            "Venta"
                    );
                    detalledata.agregarDetalle(detalleVenta);
                    p.setStock(p.getStock() - set.getValue());
                    pd.modificarProducto(p);
                }
            }
        } catch (Exception ex) {
//            Logger.getLogger(FraveMax.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" Error: " + ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreVendedor;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTable jtVenta;
    // End of variables declaration//GEN-END:variables
}
