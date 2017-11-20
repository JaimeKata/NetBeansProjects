package strings2ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata PEDIR POR TECLADO UNA FRASE Y UNA LETRA. ELIMINAR LA LETRA DE LA FRASE 
 */
public class Strings2EJ2 {

    static String frase = null;
    static String fraseFinal = "";
    static String letra = "";
    static int size = 0;
    static int contador = 0;

    public static void buscarIguales() {
        String letraAux = "";
        size = frase.length();

        for (int i = 0; i < size; i++) {
            letraAux = frase.substring(i, i + 1);

            if (letra.equalsIgnoreCase(letraAux) == false) {
                fraseFinal = fraseFinal + frase.substring(i, i + 1);

            }

        }
        System.out.println("La frase resultante es: " + fraseFinal);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame una frase: ");
        frase = entrada.readLine();
        System.out.println("Digame una letra: ");

        letra = entrada.readLine();
        buscarIguales();
    }

}
