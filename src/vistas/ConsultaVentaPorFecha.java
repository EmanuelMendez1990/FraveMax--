package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaVentaPorFecha extends javax.swing.JInternalFrame {

    private static UsuarioData ud = new UsuarioData();
    private static HashMap<Integer, Integer> compra;
    private static Usuario cliente;
    private static VentaData vd = new VentaData();
    private static DetalleData dd = new DetalleData();
    private DefaultTableModel md2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ConsultaVentaPorFecha() {
        initComponents();
        crearColumnas2();
        try {
            String date = LocalDate.now().toString();
            java.util.Date date2;
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            jdcDesde.setDate(date2);//Definimos la fecha de hoy al iniciar JDC
            jdcHasta.setDate(date2);//Definimos la fecha de hoy al iniciar JDC
            jdcDesde.getJCalendar().getDayChooser().setAlwaysFireDayProperty(true);
            jdcHasta.getJCalendar().getDayChooser().setAlwaysFireDayProperty(true);
        } catch (ParseException ex) {

        }

    }

    private void crearColumnas2() {
        md2.addColumn("IdVenta");
        md2.addColumn("Vendedor");
        md2.addColumn("Fecha");
        md2.addColumn("Total");

        jtVenta.setModel(md2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVenta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jdcDesde = new com.toedter.calendar.JDateChooser();
        jdcHasta = new com.toedter.calendar.JDateChooser();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ventas por fecha");

        jLabel4.setText("Desde");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

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

        jLabel8.setText("Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(22, 22, 22)
                                        .addComponent(jdcHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addComponent(jbBuscar))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jdcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jdcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean validacion() {
        boolean valido = false;
        //comparamos fechas en la validacion

//        if (!jtDni.getText().isEmpty()
//                && !jtNombre.getText().isEmpty()
//                && !jtApellido.getText().isEmpty()
//                && !jtTel.getText().isEmpty()
//                && !jtDomicilio.getText().isEmpty()
//                && !jtEmail.getText().isEmpty()) {
//            valido = true;
//        }
        valido = true; // <---- BORRAR ESTA LINEA
        return valido;
    }
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try{
            Date desdedate = jdcDesde.getDate();
        Date hastadate = jdcHasta.getDate();
        java.sql.Date desde = new java.sql.Date(desdedate.getTime());

        java.sql.Date hasta = new java.sql.Date(hastadate.getTime());
        if(desdedate.after(hastadate)){
            JOptionPane.showMessageDialog(null, "Las fechas no son correctas");
            return; 
        }
        ArrayList<Venta> ventas = vd.buscarVentaPorFechas(desde, hasta);
        if(jtVenta.getRowCount()>0){
             borrarFilas();
        }   
        if (!ventas.isEmpty()) {
            for (Venta v : ventas) {
                Usuario vendedor = ud.listarUsuarioPorId(v.getIdUsuario());
                Usuario cliente = ud.listarUsuarioPorId(v.getIdCliente());
                md2.addRow(new Object[]{v.getIdVenta(), vendedor.getNombre() + " " + vendedor.getApellido(), v.getFecha(), v.getTotal()});
            }
        }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Las fechas no son correctas");
        }
        
//        cliente = ud.listarUsuario(Integer.parseInt(jtDni.getText()));
//        ArrayList<Venta> lista = new ArrayList<>();
//        if (cliente.getDni() != 0) {
//            jtDni.setText(cliente.getDni() + "");
//            jtNombre.setText(cliente.getNombre() + "");
//            jtApellido.setText(cliente.getApellido() + "");
//            jtTel.setText(cliente.getTel() + "");
//            jtDomicilio.setText(cliente.getDomicilio() + "");
//            jtEmail.setText(cliente.getEmail() + "");
//            lista = vd.buscarVentaPorCliente(cliente.getIdUsuario());
//            if (!lista.isEmpty()) {
//                for (Venta v : lista) {
//                    Usuario vendedor = ud.listarUsuarioPorId(v.getIdUsuario());
//                    Usuario cliente = ud.listarUsuarioPorId(v.getIdCliente());
//                    System.out.println("hoola: " + v.getTotal());
//                    md2.addRow(new Object[]{v.getIdVenta(), vendedor.getNombre() + " " + vendedor.getApellido(), v.getFecha(), v.getTotal()});
//                }
//            }
//
//        } else {
//            jtDni.setText("");
//            jtNombre.setText("");
//            jtApellido.setText("");
//            jtTel.setText("");
//            jtDomicilio.setText("");
//            jtEmail.setText("");
//            JOptionPane.showMessageDialog(rootPane, "No se encontro el cliente");
//        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVentaMouseClicked
        int indice = jtVenta.getSelectedRow();
        int id = Integer.parseInt(jtVenta.getValueAt(indice, 0) + "");
        System.out.println(id);
        ArrayList<DetalleVenta> lista = dd.buscarDetallePorVenta(id);
        System.out.println("lista" + lista);
        Venta venta = vd.buscarVentaPorId(id);
        int vendedorid = venta.getIdUsuario();
        Usuario vendedor = ud.listarUsuarioPorId(vendedorid);
        Usuario cliente = ud.listarUsuarioPorId(venta.getIdCliente());
        HashMap<Integer, Integer> compra = new HashMap<>();
        for (DetalleVenta dv : lista) {
            compra.put(dv.getIdProducto(), dv.getCantidad());
            System.out.println("compra" + dv.getIdProducto());
        }
        JDesktopPane desktopPane = getDesktopPane();
        VisualizarVenta f1 = new VisualizarVenta(compra, cliente, vendedor);

        desktopPane.add(f1);//add f1 to desktop pane
        f1.setVisible(true);
    }//GEN-LAST:event_jtVentaMouseClicked
    
    private void borrarFilas() {
        int f = jtVenta.getRowCount() - 1;
        for (; f >= 0; f--) {
            md2.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscar;
    private com.toedter.calendar.JDateChooser jdcDesde;
    private com.toedter.calendar.JDateChooser jdcHasta;
    private javax.swing.JTable jtVenta;
    // End of variables declaration//GEN-END:variables
}
