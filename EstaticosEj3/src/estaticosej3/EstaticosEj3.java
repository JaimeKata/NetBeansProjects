
        package estaticosej3;

import java.util.Scanner;

/**
 *
 * @author JaimeKata 
 * Calculo del factorial de un numero 
 */
public class EstaticosEj3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int factorial;
        do {
            System.out.println("Diagme un numero para calcular su factorial: ");
            numero = entrada.nextInt();
        } while (numero < 0);
        factorial = calculoFactorial(numero);
        System.out.println("El factorial es: " + factorial);

    }//main

    public static int calculoFactorial(int numero) {
        int i;
        int factorial = 1;
        for (i = numero; i > 0; i--) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
        return factorial;
    }//calculoFactorial
}
