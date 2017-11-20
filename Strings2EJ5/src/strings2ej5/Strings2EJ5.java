package strings2ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata PEDIR UNA PALABRA POR TECLADO E INTERCAMBIAR LA PRIMERA POR
 * LA ULTIMA LETRA
 */
public class Strings2EJ5 {

    static String palabra;
    static char primerCaracter;
    static char ultimoCaracter;
    static char caracterAux;
    static int size = 0;

    public static void cambiarCaracterPosicion() {
        size = palabra.length();
        primerCaracter = palabra.charAt(0);
        ultimoCaracter = palabra.charAt(size-1);
        palabra = ultimoCaracter + palabra.substring(1,size-1)+primerCaracter;
        System.out.println(palabra);
    }

    public static void main(String[] args) throws IOException {
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame una palabra: ");
        palabra = entrada.readLine();
        cambiarCaracterPosicion();
    }

}
