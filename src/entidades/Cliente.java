package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Cliente {
    private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String email; 

    public Cliente() {
    }

    public Cliente(int dni, String apellido, String nombre, String domicilio, String email) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
    }

    public Cliente(int idCliente, int dni, String apellido, String nombre, String domicilio, String email) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + '}';
    }
    
    
    
    
}
