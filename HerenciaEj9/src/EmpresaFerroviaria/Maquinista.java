
package EmpresaFerroviaria;

/**
 *
 * @author JaimeKata
 */
public class Maquinista extends Empleado {
    private int numeroMaquina; 
    private int tiempoEnMaquina; 
    
    public Maquinista(){
        this.numeroMaquina = 0; 
        this.tiempoEnMaquina = 0; 
    }
    
    public Maquinista(String nombre, double sueldo, int edad, int numeroMaquina, int tiempoEnMaquina){
        super(nombre, sueldo, edad);
        this.numeroMaquina = numeroMaquina; 
        this.tiempoEnMaquina = tiempoEnMaquina;
    }

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public int getTiempoEnMaquina() {
        return tiempoEnMaquina;
    }

    public void setTiempoEnMaquina(int tiempoEnMaquina) {
        this.tiempoEnMaquina = tiempoEnMaquina;
    }
    
    public String cadenaMaquinista(){
        return "numero de maquina: "+numeroMaquina+", años en ella: "+tiempoEnMaquina;
    }

    @Override
    public String toString() {
        return super.toString() +" numero de maquina: "+numeroMaquina+", años en ella: "+tiempoEnMaquina;
    }
    
}
