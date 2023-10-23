package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import java.util.HashMap;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class ElegirCliente extends javax.swing.JInternalFrame {

    private static UsuarioData ud = new UsuarioData();
    private static HashMap<Integer, Integer> compra;
    private static Usuario cliente;

    public ElegirCliente() {
        initComponents();
        jbFacturar.setEnabled(false);
        jbBuscar.setEnabled(false);
    }

    public ElegirCliente(HashMap<Integer, Integer> compra) {
        initComponents();
        jbFacturar.setEnabled(false);
        jbBuscar.setEnabled(false);
        this.compra = compra;
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
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtTel = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jbFacturar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Elegir Cliente");

        jLabel2.setText("Dni / Cuit");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Tel");

        jLabel6.setText("Domicilio");

        jLabel7.setText("Email");

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDniKeyReleased(evt);
            }
        });

        jtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelKeyReleased(evt);
            }
        });

        jbFacturar.setText("Facturar");
        jbFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFacturarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo Cliente");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("O...");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(34, 34, 34)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre)
                                            .addComponent(jtDni)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(34, 34, 34)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbFacturar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbBuscar)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(34, 34, 34)
                                                .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbBuscar)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addComponent(jbFacturar)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jbNuevo))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFacturarActionPerformed
        ProductoData pd = new ProductoData();
        VentaData ventadata = new VentaData();
        DetalleData detalledata = new DetalleData();
        Double total = 0.0;
        if (validacion()) {
            System.out.println("Facturado");
            for (HashMap.Entry<Integer, Integer> set
                    : compra.entrySet()) {
                Producto p = pd.listarProducto(set.getKey());
                System.out.println(" Nombre:  " + p.getNombre() + "  Cantidad:  "
                        + set.getValue());
                total += p.getPrecio() * set.getValue();
            }
            System.out.println(" Total Compra:  " + total);
            System.out.println("Quien esta comprando: " + cliente.getNombre());

            int vendedorid = MenuPrincipal.idVendedor;
            Usuario vendedor = ud.listarUsuarioPorId(vendedorid);

//            int cliente = cliente.getIdUsuario();
            HashMap<Usuario, Usuario> clientes = new HashMap<Usuario, Usuario>();
            clientes.put(cliente, vendedor);

            JDesktopPane desktopPane = getDesktopPane();
            PrevisualizarVenta f1 = new PrevisualizarVenta(compra, cliente, vendedor);

            desktopPane.add(f1);//add f1 to desktop pane
            f1.setVisible(true);
            this.dispose();
//           

        } else {
            JOptionPane.showMessageDialog(rootPane, "Faltan completar datos");
        }
    }//GEN-LAST:event_jbFacturarActionPerformed
    private boolean validacion() {
        boolean valido = false;
        if (!jtDni.getText().isEmpty()
                && !jtNombre.getText().isEmpty()
                && !jtApellido.getText().isEmpty()
                && !jtTel.getText().isEmpty()
                && !jtDomicilio.getText().isEmpty()
                && !jtEmail.getText().isEmpty()) {
            valido = true;
        }
        return valido;
    }
    private void jtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)//Evaluamos los numeros del teclado
                && (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)//aca del numerico
                && (evt.getKeyCode() != 8)) {//aca el borrar hacia atras
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtDni.setText("");
        }
        if (!jtDni.getText().isEmpty())
            jbBuscar.setEnabled(true);
    }//GEN-LAST:event_jtDniKeyReleased

    private void jtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)//Evaluamos los numeros del teclado
                && (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)//aca del numerico
                && (evt.getKeyCode() != 8)) {//aca el borrar hacia atras
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtDni.setText("");
        }
    }//GEN-LAST:event_jtTelKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        cliente = ud.listarUsuario(Integer.parseInt(jtDni.getText()));
        if (cliente.getDni() != 0) {
            jtDni.setText(cliente.getDni() + "");
            jtNombre.setText(cliente.getNombre() + "");
            jtApellido.setText(cliente.getApellido() + "");
            jtTel.setText(cliente.getTel() + "");
            jtDomicilio.setText(cliente.getDomicilio() + "");
            jtEmail.setText(cliente.getEmail() + "");
            jbFacturar.setEnabled(true);
        } else {
            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtTel.setText("");
            jtDomicilio.setText("");
            jtEmail.setText("");
            JOptionPane.showMessageDialog(rootPane, "No se encontro el cliente");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        JDesktopPane desktopPane = getDesktopPane();
        AgregarCliente ac = new AgregarCliente();
        desktopPane.add(ac);//add f1 to desktop pane
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDesktopPane desktopPane = getDesktopPane();
        NuevaVenta f1 = new NuevaVenta(compra);

        desktopPane.add(f1);//add f1 to desktop pane
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void editarUsuario() {
        String dni, nombre, apellido, tel, domicilio, email, cliente, pass, salt;
        int clientebuscado = Integer.parseInt(jtDni.getText());
        Usuario u = ud.listarUsuario(clientebuscado);
        int idUsuario = u.getIdUsuario();
        Rol rol = Rol.CLIENTE;
        dni = jtDni.getText();
        nombre = jtNombre.getText();
        apellido = jtApellido.getText();
        tel = jtTel.getText();
        domicilio = jtDomicilio.getText();
        email = jtEmail.getText();
        cliente = dni;
        pass = dni;
//    public Usuario(Rol rol, int dni, String nombre, String apellido, Date fechaIngreso, String cliente, String pass, String salt, String tel, String domicilio, String email) {

        salt = PassEnc.getSaltvalue(30);
        pass = PassEnc.generateSecurePassword(pass, salt);

        try {
            LocalDate date = LocalDate.now();
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date.toString());

            Usuario nuevo = new Usuario(idUsuario, rol, Integer.parseInt(dni), nombre, apellido, date2, cliente, pass, salt, tel, domicilio, email);
            ud.modificarUsuario(nuevo);

//            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date.toString());
//                  java.sql.Date sqlDate2 = new java.sql.Date(date2.getDate());
//        System.out.println(sqlDate2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbFacturar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
}
