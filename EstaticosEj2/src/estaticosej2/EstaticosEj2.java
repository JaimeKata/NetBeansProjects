package estaticosej2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JaimeKata
 */
public class EstaticosEj2 {

    public static void main(String[] args) throws IOException {
        
        int numero1 = 0;
        int numero2 = 0;

        numero1 = pedirNumMayorCero("Digame un numero para calcular su numero de divisores: ");
        numero2 = pedirNumMayorCero("Digame un numero para calcular su numero de divisores: ");
        System.out.println(numero1);
        System.out.println(numero2);
        nDivisores(numero1, numero2);

    }//main

    public static void nDivisores(int numero1, int numero2) {
        int contadorDivisores1 = 0;
        int contadorDivisores2 = 0;
        float resto = 0;

        for (int i = 1; i <= numero1; i++) {
            resto = numero1 % i;
            if (resto == 0.0) {
                contadorDivisores1++;
            }
        }
        for (int i = 1; i <= numero2; i++) {
            resto = numero2 % i;
            if (resto == 0.0) {
                contadorDivisores2++;
            }
        }
        if (contadorDivisores1 > contadorDivisores2) {
            System.out.println("El numero: " + numero1 + " tiene mas divisores que el numero: " + numero2);
        } else {
            System.out.println("El numero: " + numero2 + " tiene mas divisores que el numero: " + numero1);
        }
    }//nDivisores

    public static int pedirNumMayorCero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.println(mensaje);
            numero = entrada.nextInt();
        } while (numero <= 0);
        return numero;
    }//pedirNumMayorCero 

}
