package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import java.util.HashMap;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NuevaVenta extends javax.swing.JInternalFrame {

    private static ProductoData pd = new ProductoData();
    private DefaultTableModel md = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel md2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public NuevaVenta() {
        initComponents();
        crearColumnas();
        crearColumnas2();
        jbBorrar.setEnabled(false);
        jbAgregar.setEnabled(false);
        jbFacturar.setEnabled(false);

    }

    public NuevaVenta(HashMap<Integer, Integer> compra) {
        initComponents();
        crearColumnas();
        crearColumnas2();
        jbBorrar.setEnabled(false);
        jbAgregar.setEnabled(false);
        restaurar(compra);
    }

    private void crearColumnas() {
        md.addColumn("ID");
        md.addColumn("Nombre");
        md.addColumn("Descripcion");
        md.addColumn("Precio");
        md.addColumn("Stock");
        md.addColumn("Descuento");
        md.addColumn("Estado");
        md.addColumn("Categoria");
        jtProductos.setModel(md);
    }

    private void crearColumnas2() {
        md2.addColumn("ID");
        md2.addColumn("Nombre");
        md2.addColumn("Precio");
        md2.addColumn("Cantidad");
        md2.addColumn("Total");
        jtVenta.setModel(md2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVenta = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbFacturar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();

        jtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelKeyReleased(evt);
            }
        });

        jLabel8.setText("Activo");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nueva Venta");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtDescripcion.setEditable(false);
        jtDescripcion.setColumns(20);
        jtDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtDescripcion);

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

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbFacturar.setText("Siguiente");
        jbFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFacturarActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel5.setText("Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(29, 29, 29)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAgregar)
                .addGap(29, 29, 29)
                .addComponent(jbBorrar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbFacturar)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbBorrar)
                            .addComponent(jbFacturar)
                            .addComponent(jLabel5)
                            .addComponent(jlTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased

    }//GEN-LAST:event_jtNombreKeyReleased
    private void restaurar(HashMap<Integer, Integer> compra) {
        for (HashMap.Entry<Integer, Integer> set
                : compra.entrySet()) {
            Producto p = pd.listarProducto(set.getKey());
            double total = set.getValue() * p.getPrecio();
            md2.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), set.getValue(), total});

        }

        double tot = 0.0;
        int f = jtVenta.getRowCount() - 1;
        System.out.println(f);
        for (; f >= 0; f--) {
            tot += Double.parseDouble(jtVenta.getValueAt(f, 4) + "");

        }
        jlTotal.setText(tot + "");

    }

    private void jtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)//Evaluamos los numeros del teclado
                && (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)//aca del numerico
                && (evt.getKeyCode() != 8)) {//aca el borrar hacia atras
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtTelKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        List<Producto> lista = pd.buscarProductos(jtNombre.getText());

        if (lista != null) {
            borrarFilas();

            for (Producto a : lista) {
                md.addRow(new Object[]{a.getIdProducto(), a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getStock(), a.getEnOferta(), a.isEstado(), a.getCategoria()});
            }
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int id = jtProductos.getSelectedRow();
        int stock = Integer.parseInt(jtProductos.getValueAt(id, 4) + "");
        jtNombre.setText(jtProductos.getValueAt(id, 1) + "");
        jtDescripcion.setText(jtProductos.getValueAt(id, 2) + "");
        if (id >= 0 && stock > 0) {
            jbAgregar.setEnabled(true);

        } else {
            jbAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jtVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVentaMouseClicked
        int fila = jtVenta.getSelectedRow();
        System.out.println("Fila elegida " + fila);
        if (jtVenta.getSelectedRow() >= 0) {
            jbBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtVentaMouseClicked

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad");

        int cant = 0;
        int id = jtProductos.getSelectedRow();
        int stock = Integer.parseInt(jtProductos.getValueAt(id, 4) + "");
        Double precio, total;
        try {
            cant = Integer.parseInt(cantidad);
            if (cant > stock) {
                JOptionPane.showMessageDialog(null, "Stock insuficiente");
                return;
            }
        } catch (Exception ex) {
            cantidad = JOptionPane.showInputDialog("Error. Solo puede ingresar numeros");
            return;

        }
        precio = Double.parseDouble(jtProductos.getValueAt(jtProductos.getSelectedRow(), 3) + "");
        total = cant * precio;
  Producto p = pd.listarProducto(Integer.parseInt(jtProductos.getValueAt(jtProductos.getSelectedRow(), 0) + ""));
           double descuento = p.getEnOferta();
        total=total * (1- descuento / 100);
  
        md2.addRow(new Object[]{jtProductos.getValueAt(jtProductos.getSelectedRow(), 0),
            jtProductos.getValueAt(jtProductos.getSelectedRow(), 1),
            jtProductos.getValueAt(jtProductos.getSelectedRow(), 3),
            cant,
            total

        });
        jbAgregar.setEnabled(false);
        jbFacturar.setEnabled(true);
        double tot = 0.0;
//        int descuento = 0;

        int f = jtVenta.getRowCount() - 1;
        System.out.println(f);
        for (; f >= 0; f--) {
            tot += Double.parseDouble(jtVenta.getValueAt(f, 4) + "");
          
//            System.out.println(descuento);
//            tot = cant * precio * (1 - descuento / 100);
        }
        jlTotal.setText(tot + "");
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int fila = jtVenta.getSelectedRow();
        System.out.println("Fila elegida " + fila);
        md2.removeRow(fila);
        jbBorrar.setEnabled(false);
        if (jtVenta.getRowCount() == 0) {
            jbFacturar.setEnabled(false);
        }
        //volvemos a calcular el total:
        double tot = 0.0;
        int f = jtVenta.getRowCount() - 1;
        System.out.println(f);
        for (; f >= 0; f--) {
            tot += Double.parseDouble(jtVenta.getValueAt(f, 4) + "");
        }
        jlTotal.setText(tot + "");
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFacturarActionPerformed
        //id y cantidad pasamos a la otra ventana      
        HashMap<Integer, Integer> lista = new HashMap<>();
        int f = jtVenta.getRowCount() - 1;
        for (; f >= 0; f--) {
            int id = Integer.parseInt(jtVenta.getValueAt(f, 0) + "");
            int cantidad = Integer.parseInt(jtVenta.getValueAt(f, 3) + "");
            lista.put(id, cantidad);
        }

        JDesktopPane desktopPane = getDesktopPane();
        ElegirCliente f1 = new ElegirCliente(lista);
        desktopPane.add(f1);//add f1 to desktop pane
        f1.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jbFacturarActionPerformed
    private void borrarFilas() {
        int f = jtProductos.getRowCount() - 1;
        for (; f >= 0; f--) {
            md.removeRow(f);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbFacturar;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTel;
    private javax.swing.JTable jtVenta;
    // End of variables declaration//GEN-END:variables
}
