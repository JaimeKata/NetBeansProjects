
package Empresa;

/**
 *
 * @author JaimeKata
 */
public class Jefe extends Empleado {
    private String titulo; 
    private String nombreDepartamento;
    
    public Jefe(){
        super();
        this.titulo = null;
        this.nombreDepartamento = null;
    }
    public Jefe(String nombre, double sueldo, String titulo, String nombreDepartamento){
        super(nombre, sueldo);
        this.titulo = titulo; 
        this.nombreDepartamento = nombreDepartamento; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public String cadenaJefe(){
        return "Jafe[ Nombre: "+nombre+" ,sueldo: "+sueldo+" ,titulo:"+titulo+" ,nombre del departamento: "+nombreDepartamento+"]";
    }
}
