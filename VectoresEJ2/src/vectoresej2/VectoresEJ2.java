package vectoresej2;

/**
 *
 * @author JaimeKata
 * LLENAR UN TERCER VECTOR CON LA SUMA DE LOS OTROS DOS
 */
public class VectoresEJ2 {

    final static int vectorUno[] = new int[10];
    final static int vectorDos[] = new int[10];
    final static int vectorFinal[] = new int[10];
    final static int Max = 10;
    static int numero = 0;
    static int numeroDos = 0;
    final static int numeroMinimo = 0;
    final static int numeroMaximo = 20;

    public static void llenarArray() {
        for (int i = 0; i < Max; i++) {
            numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            numeroDos = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            vectorUno[i] = numero;
            vectorDos[i] = numeroDos;
        }
    }
    public static void sumarVectores(){
        int suma = 0; 
        for (int i = 0; i < Max; i++){
            suma = vectorUno[i] + vectorDos[i];
            vectorFinal[i] = suma;
        }
    }

    public static void main(String[] args) {
        llenarArray();
        sumarVectores();
        System.out.println("Resultado de la suma de ambos vectores:");
        for (int i = 0; i < Max; i++){
            System.out.println(vectorFinal[i]);
        }
    }

}
