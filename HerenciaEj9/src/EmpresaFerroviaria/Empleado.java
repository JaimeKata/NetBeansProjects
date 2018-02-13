
package EmpresaFerroviaria;

/**
 *
 * @author JaimeKata
 */
public class Empleado {
    public String nombre; 
    private double sueldo; 
    public int edad = 0; 
    
    public Empleado(){
       this.nombre = null; 
       this.sueldo = 0.0; 
       this.edad = 0; 
    }
    
    public Empleado(String nombre, double sueldo, int edad){
        this.nombre = nombre; 
        this.sueldo = sueldo; 
        this.edad = edad; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String cadenaEmpleado(){
        return "Empleado[ Nombre: "+nombre+" ,sueldo: "+sueldo+" ,edad: "+edad+"]";
    }
}
