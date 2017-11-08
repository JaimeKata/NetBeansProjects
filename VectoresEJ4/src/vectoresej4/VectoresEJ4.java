package vectoresej4;

/**
 *
 * @author JaimeKata 
 * GENERAR UNA MATRIZ 5X5 E IMPRIMIR EL MAYOR Y MENOR NUMERO
 * JUNTO CON SU POSICION
 */
public class VectoresEJ4 {

    final static int matriz[][] = new int[5][5];
    final static int Max = 5;
    static int numero = 0;
    static int numeroDos = 0;
    final static int numeroMinimo = -100;
    final static int numeroMaximo = 100;
    static int numeroMayor = matriz[0][0];
    static int numeroMenor = matriz[0][0];
    static int posicionMaxFila = 0;
    static int posicionMinFila = 0;
    static int posicionMaxColum = 0;
    static int posicionMinColum = 0;

    public static void llenarMatriz() {
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
                matriz[i][j] = numero;
            }
        }
    }

    public static void busquedaMaxMin() {
        int valor = 0;
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                valor = matriz[i][j];
                if (valor <= numeroMenor) {
                    numeroMenor = valor;
                    posicionMinFila = i + 1;
                    posicionMinColum = j + 1;
                }
                if (valor >= numeroMayor) {
                    numeroMayor = valor;
                    posicionMaxFila = i + 1;
                    posicionMaxColum = j + 1;
                }
            }

        }
    }

    public static void main(String[] args) {
        llenarMatriz();
        busquedaMaxMin();
        System.out.println("El numero maximo es: "+numeroMayor+" y se encuentra en la posición: Fila: "+posicionMaxFila+" Columna: "+posicionMinColum);
        System.out.println("El numero minimo es: "+numeroMenor+" y se encuentra en la posición: Fila: "+posicionMinFila+" Columna: "+posicionMinColum);

    }

}
