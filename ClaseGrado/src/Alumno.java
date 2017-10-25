


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public class Alumno extends Persona{
    private String tutor;
    private String curso;

    
    public Alumno(){
        super();
        this.tutor = null;
        this.curso = null;
        
    }
    public Alumno(String dni, String nombre, String apellido, int edad, String direccion, int telefonoContacto, String correoElectronico, String tutor, String curso){
        super(dni, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico);
        this.tutor = tutor;
        this.curso = curso;
       
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "tutor=" + tutor + ", curso=" + curso;
    }

    
}
