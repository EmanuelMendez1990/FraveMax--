package entidades;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String rol;
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaIngreso;
    private String usuario;
    private String pass;

    public Usuario() {
    }

    public Usuario(String rol, int dni, String nombre, String apellido, Date fechaIngreso, String usuario, String pass) {
        this.rol = rol;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
        this.pass = pass;
    }

    public Usuario(int idUsuario, String rol, int dni, String nombre, String apellido, Date fechaIngreso, String usuario, String pass) {
        this.idUsuario = idUsuario;
        this.rol = rol;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
        this.pass = pass;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
            
}
