/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public abstract class Persona {
    private String dni; 
    private String nombre; 
    private String apellido; 
    private int edad; 
    private String direccion; 
    private int telefonoContacto; 
    private String correoElectronico; 
    
    public Persona(){
        this.dni = null;
        this.nombre = null; 
        this.apellido = null;
        this.edad = 0; 
        this.direccion = null; 
        this.telefonoContacto = 0; 
        this.correoElectronico = null; 
    }
    
    public Persona(String dni, String nombre, String apellido, int edad, String direccion, int telefonoContacto, String correoElectronico){
        this.dni = dni;
        this.nombre = nombre; 
        this.apellido = apellido;
        this.edad = edad; 
        this.direccion = direccion; 
        this.telefonoContacto = telefonoContacto; 
        this.correoElectronico = correoElectronico;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}
