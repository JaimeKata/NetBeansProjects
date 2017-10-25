/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public class Profesor extends Persona{
    private String despacho; 
    private String tutoria; 
    
    public Profesor(){
        super();
        this.despacho = null;
        this.tutoria = null; 
    }
    public Profesor(String DNI, String nombre, String apellido, int edad, String direccion, int telefonoContacto, String correoElectronico, String despacho, String tutoria){
        super(DNI, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico);
        this.despacho = despacho;
        this.tutoria = tutoria; 
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getTutoria() {
        return tutoria;
    }

    public void setTutoria(String tutoria) {
        this.tutoria = tutoria;
    }

    @Override
    public String toString() {
        return "Despacho=" + despacho + ", tutoria=" + tutoria;
    }
    
}
