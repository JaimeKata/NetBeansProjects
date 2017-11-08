package vectoresej6;

/**
 *
 * @author JaimeKata MATRIZ 10x10 DE NUMEROS FLOAT. IMPRIMIR LA SUMA DE SUS
 * FILAS Y COLUMNAS
 */
public class VectoresEJ6 {

    final static float matriz[][] = new float[10][10];
    final static int Max = 10;
    static float numero = 0;
    final static float numeroMinimo = -5;
    final static float numeroMaximo = 5;
    static float suma = 0;

    public static void llenarMatriz() {
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                numero = (float) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
                matriz[i][j] = numero;
            }
        }
    }

    public static void sumarMatriz() {
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                suma = suma + matriz[i][j];
            }
        }
    }

    public static void main(String[] args) {
        llenarMatriz();
        sumarMatriz();
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                System.out.println(matriz[i][j]);
            }
        }
       System.out.println("El resultado de sumar la matriz es: "+suma);
        
    }

}
