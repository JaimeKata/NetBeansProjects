
package Empresa;

/**
 *
 * @author JaimeKata
 */
public class Empleado {
    protected String nombre; 
    protected double sueldo;
    
    public Empleado(){
        this.nombre = null; 
        this.sueldo = 0.0;
    }
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre; 
        this.sueldo = sueldo; 
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String cadenaEmpleado(){
        return "Empleado[ Nombre: "+nombre+" ,sueldo: "+sueldo+"]";
    }
}
