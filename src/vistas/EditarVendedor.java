package vistas;

import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import datos.*;
import javax.swing.JOptionPane;

public class EditarVendedor extends javax.swing.JInternalFrame {

    private static UsuarioData ud = new UsuarioData();

    public EditarVendedor() {
        initComponents();
        cargarRol();
        jbAgregar.setEnabled(false);

    }

    private void cargarRol() {
        jcbRol.addItem(Rol.ADMINISTRADOR + "");
        jcbRol.addItem(Rol.VENDEDOR + "");
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
        jcbRol = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jtTel = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtUsuario = new javax.swing.JTextField();
        jtPass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtPass2 = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Editar Empleado");

        jLabel2.setText("Dni");

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

        jLabel8.setText("Categoria");

        jtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelKeyReleased(evt);
            }
        });

        jtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPassKeyReleased(evt);
            }
        });

        jLabel9.setText("Usuario");

        jLabel10.setText("Contraseña");

        jbAgregar.setText("Guardar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel11.setText("Repetir contraseña");

        jtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPass2KeyReleased(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregar)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jtTel)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(jtEmail)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(34, 34, 34)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(jtNombre)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(jtUsuario)
                                        .addComponent(jtPass)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbBuscar)
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAgregar)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        if (validacion()) {
            editarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Faltan completar datos");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed
    private boolean validacion() {
        boolean valido = false;
        if (!jtDni.getText().isEmpty()
                && !jtDni.getText().equals("0")
                && !jtNombre.getText().isEmpty()
                && !jtApellido.getText().isEmpty()
                && !jtTel.getText().isEmpty()
                && !jtDomicilio.getText().isEmpty()
                && !jtEmail.getText().isEmpty()
                && !jtUsuario.getText().isEmpty()
                && !jtPass.getText().isEmpty()) {
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
    }//GEN-LAST:event_jtDniKeyReleased

    private void jtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelKeyReleased
        if ((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)//Evaluamos los numeros del teclado
                && (evt.getKeyCode() < 96 || evt.getKeyCode() > 105)//aca del numerico
                && (evt.getKeyCode() != 8)) {//aca el borrar hacia atras
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            jtDni.setText("");
        }
    }//GEN-LAST:event_jtTelKeyReleased

    private void jtPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPass2KeyReleased
        if (jtPass.getText().equals(jtPass2.getText())) {
            jbAgregar.setEnabled(true);
        }else{
            jbAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_jtPass2KeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
Usuario usuario =ud.listarUsuario(Integer.parseInt(jtDni.getText()));
if (usuario.getRol()!=Rol.CLIENTE){
    jtDni.setText(usuario.getDni()+"");
    jtNombre.setText(usuario.getNombre()+"");
    jtApellido.setText(usuario.getApellido()+"");
    jtTel.setText(usuario.getTel()+"");
    jtDomicilio.setText(usuario.getDomicilio()+"");
    jtEmail.setText(usuario.getEmail()+"");
   
    jtUsuario.setText(usuario.getUsuario()+"");
    jcbRol.setSelectedItem(usuario.getRol()+"");
   jbAgregar.setEnabled(true);
}else{
    jtDni.setText("");
    jtNombre.setText("");
    jtApellido.setText("");
    jtTel.setText("");
    jtDomicilio.setText("");
    jtEmail.setText("");
    JOptionPane.showMessageDialog(rootPane, "No se encontro el usuario");
}
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPassKeyReleased
 if (jtPass.getText().equals(jtPass2.getText())) {
            jbAgregar.setEnabled(true);
        }else{
            jbAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_jtPassKeyReleased
    private void editarUsuario() {
        String dni, nombre, apellido, tel, domicilio, email, usuario, pass, salt;
         int usuariobuscado=Integer.parseInt(jtDni.getText());
        Usuario u =ud.listarUsuario(usuariobuscado);
        int idUsuario=u.getIdUsuario();
        Rol rol = Rol.valueOf(jcbRol.getSelectedItem() + "");
        dni = jtDni.getText();
        nombre = jtNombre.getText();
        apellido = jtApellido.getText();
        tel = jtTel.getText();
        domicilio = jtDomicilio.getText();
        email = jtEmail.getText();
        usuario = jtUsuario.getText();
        pass = jtPass.getText();
//    public Usuario(Rol rol, int dni, String nombre, String apellido, Date fechaIngreso, String usuario, String pass, String salt, String tel, String domicilio, String email) {

        salt = PassEnc.getSaltvalue(30);
        
        pass = PassEnc.generateSecurePassword(pass, salt);
        

        try {
            LocalDate date = LocalDate.now();
            System.out.println("date asd###"+date);
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date.toString());
            System.out.println("*****"+date2);
                              java.sql.Date sqlDate = new java.sql.Date(date2.getDate());
            Usuario nuevo = new Usuario(idUsuario,rol, Integer.parseInt(dni), nombre, apellido, sqlDate, usuario, salt, pass, tel, domicilio, email);
            ud.modificarUsuario(nuevo);
            
//            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date.toString());
//                  java.sql.Date sqlDate2 = new java.sql.Date(date2.getDate());
//        System.out.println(sqlDate2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbRol;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPass;
    private javax.swing.JTextField jtPass2;
    private javax.swing.JTextField jtTel;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
