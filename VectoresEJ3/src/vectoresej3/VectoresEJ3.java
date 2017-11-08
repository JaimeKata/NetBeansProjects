
package vectoresej3;

/**
 *
 * @author JaimeKata 
 * BUSCAR EN UN VECTOR EL NUMERO MAXIMO Y NUMERO MINIMO,
 * TAMBIEN LA POSCION DONDE SE ENCUENTRAN
 */
public class VectoresEJ3 {

    final static int vector[] = new int[20];
    final static int Max = 20;
    static int numero = 0;
    final static int numeroMinimo = 0;
    final static int numeroMaximo = 20;
    static int numeroMayor = vector[0];
    static int numeroMenor = vector[0];
    static int posicionMax = 0;
    static int posicionMin = 0;

    public static void llenarArray() {
        for (int i = 0; i < Max; i++) {
            numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            vector[i] = numero;
        }
    }
    public static void busquedaMaxMin(){
        int valor = 0;
        for (int i = 0; i < Max; i++){
            valor = vector[i]; 
            if(valor <= numeroMenor){
                numeroMenor = valor;
                posicionMin = i +1;
            }
            if(valor >= numeroMayor){
                numeroMayor = valor;
                posicionMax = i +1;
            }
        }
    }

    public static void main(String[] args) {
        llenarArray();
        busquedaMaxMin();
        System.out.println("El numero maximo es: "+numeroMayor+" y se encuentra en la posición: "+posicionMax);
        System.out.println("El numero minimo es: "+numeroMenor+" y se encuentra en la posición: "+posicionMin);
    }

}
