
package EmpresaFerroviaria;

/**
 *
 * @author JaimeKata
 */
public class Administrativo extends Empleado {
    private String estudios; 
    private int numeroOrdenador; 
    
    public Administrativo(){
        super();
        this.estudios = null; 
        this.numeroOrdenador = 0; 
    }
    public Administrativo(String nombre, double sueldo, int edad, String estudios, int numeroOrdenador){
        super(nombre, sueldo, edad);
        this.estudios = estudios;
        this.numeroOrdenador = numeroOrdenador; 
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getNumeroOrdenador() {
        return numeroOrdenador;
    }

    public void setNumeroOrdenador(int numeroOrdenador) {
        this.numeroOrdenador = numeroOrdenador;
    }
    
    public String cadenaAdministrativo(){
        return "estudios: "+estudios+" ,numero de ordenador: "+numeroOrdenador;
    }
}
