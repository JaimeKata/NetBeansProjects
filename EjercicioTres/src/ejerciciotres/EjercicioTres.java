/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaime-kata
 */
public class EjercicioTres {

    public static void main(String[] args) throws IOException {
        String frase = null;
        String palabra = null;
        int contador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digame una frase: ");
        frase = entrada.readLine();
        System.out.println("Digame la palabra que quiere buscar en la frase: ");
        palabra = entrada.readLine();
        while (frase.indexOf(palabra) > -1) {
            frase = frase.substring(frase.indexOf(palabra) + palabra.length(), frase.length());
            contador++;
        }
        System.out.println("La palabra "+palabra+" esta en la frase "+contador+" veces");
    }

}
