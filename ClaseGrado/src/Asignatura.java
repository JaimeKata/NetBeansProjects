/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public class Asignatura {
    private String nombre; 
    private String codigo; 
    private String creditos; 
    private String clase; 
    private String tutor;
    
    
    public Asignatura(){
        this.nombre = null; 
        this.codigo = null; 
        this.creditos = null; 
        this.clase = null; 
        this.tutor = null; 
        
    }
    public Asignatura(String nombre, String codigo, String creditos, String clase, String tutor){
        this.nombre = nombre;
        this.codigo = codigo; 
        this.creditos = creditos; 
        this.clase = clase; 
        this.tutor = tutor;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

   
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos + ", clase=" + clase + ", tutor=" + tutor;
    }
    

    
    
}
