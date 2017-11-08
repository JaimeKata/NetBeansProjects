package vectoresej7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata MATRIZ DE 5X5, INTERCAMBIAR DOS FILAS
 */
public class VectoresEJ7 {

    final static int matriz[][] = new int[5][5];
    final static int vectorAuxUno[] = new int[5];
    final static int vectorAuxDos[] = new int[5];
    final static int Max = 5;
    static int numero = 0;
    final static int numeroMinimo = -10;
    final static int numeroMaximo = 10;
    static int numeroFilaUno = 0;
    static int numeroFilaDos = 0;

    public static void llenarMatriz() {
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
                matriz[i][j] = numero;
            }
        }
    }

    public static void guardarFilas() throws IOException {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Que fila quiere cambiar de posicion?: ");
        numeroFilaUno = entrada.read();
        numeroFilaUno = numeroFilaUno -1;
        System.out.println("¿Por qué fila la quieres cambiar?: ");
        entrada.read();
        numeroFilaDos = entrada.read();
        numeroFilaDos = numeroFilaDos -1;

        for (int j = 0; j < Max; j++) {
            numero = matriz[numeroFilaUno][j];
            vectorAuxUno[j] = numero;
        }
        for (int j = 0; j < Max; j++) {
            numero = matriz[numeroFilaDos][j];
            vectorAuxDos[j] = numero;
            
        }

    }
    public static void cambiarFilas(){
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                if(i == numeroFilaUno){
                    for (int h = 0; h < Max; h++) {
                        matriz[numeroFilaUno][h] = vectorAuxUno[h];// es lo mismo de antes pero con mas vuelta
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        llenarMatriz();
        guardarFilas();
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
               System.out.print(matriz[i][j]); 
            }
        }
        cambiarFilas();
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
               System.out.print(matriz[i][j]); 
            }
        }
        
    }

}
/*/int numero;
        for (int j = 0; j < Max; j++) {
            numero = vectorAuxUno[j];
            matriz[numeroFilaUno][j] = numero;
        }
        for (int j = 0; j < Max; j++) {
            numero = vectorAuxDos[j];
            matriz[numeroFilaDos][j] = numero;
        }
/*/