package estaticosej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata Leer si un numero es primo o no
 */
public class EstaticosEj1 {

    /* public static void esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }*/
    public static void esPrimo(int numero) {
        boolean esPrimo = false;
        int divisor = 2;
        while (!esPrimo && divisor < numero) {
            {
                if (numero % divisor == 0) {
                    esPrimo = true;
                } else {
                    divisor++;
                }
            }
        }
        if (esPrimo) {
            System.out.println("el numero no es primo");
        } else {
            System.out.println("el numero si es primo");
        }
    }

    public static void main(String[] args) throws IOException {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame un numero para comprobar si es primo o no: ");
        numero = entrada.read();
        esPrimo(numero);

    }

}
