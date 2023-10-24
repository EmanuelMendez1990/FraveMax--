package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaVentaProducto extends javax.swing.JInternalFrame {
private static DetalleData dd = new DetalleData();
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

    public ConsultaVentaProducto() {
        initComponents();
        crearColumnas();
        crearColumnas2();

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
        md2.addColumn("Apellido");
        md2.addColumn("Dni");

        jtCliente.setModel(md2);
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
        jtCliente = new javax.swing.JTable();

        jtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelKeyReleased(evt);
            }
        });

        jLabel8.setText("Activo");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consultar Producto");

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

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        int indice = jtProductos.getSelectedRow();
        int id=Integer.parseInt(jtProductos.getValueAt(indice, 0)+"");
        System.out.println("id "+id);
        
        ArrayList<Usuario> lista = new ArrayList<>();
        lista=dd.buscarDetallePorProducto(id);
        if(jtCliente.getRowCount()>0){
             borrarFilasClientes();
        }   
        for (Usuario u:lista) {
            md2.addRow(new Object[]{u.getIdUsuario(),u.getNombre(),u.getApellido(),u.getDni()});
        }
        

    }//GEN-LAST:event_jtProductosMouseClicked
    private void borrarFilas() {
        int f = jtProductos.getRowCount() - 1;
        for (; f >= 0; f--) {
            md.removeRow(f);
        }
    }
 private void borrarFilasClientes() {
        int f = jtCliente.getRowCount() - 1;
        for (; f >= 0; f--) {
            md2.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
}
