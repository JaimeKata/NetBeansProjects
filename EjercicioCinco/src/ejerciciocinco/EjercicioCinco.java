/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaime-kata
 */
public class EjercicioCinco {

    public static void main(String[] args) throws IOException {
        String frase = null;
        String frasePar = "";
        String fraseImpar = "";
        char caracter;
        String caracterS = "";
        int numeroCaracteres = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digame una frase: ");
        frase = entrada.readLine();
        numeroCaracteres = frase.length();
        frase = frase.replace(" ", "");
        for (int i = 0; i <= numeroCaracteres; i++) {
            if (i == 0) {
                caracter = frase.charAt(i);
                caracterS = caracterS.valueOf(caracter);
                frasePar = frasePar + caracterS;
            }
            if (i == 1) {
                caracter = frase.charAt(i);
                caracterS = caracterS.valueOf(caracter);
                fraseImpar = fraseImpar + caracterS;
            }
            if (i > 1 && i % 2 != 0) {
                caracter = frase.charAt(i);
                caracterS = caracterS.valueOf(caracter);
                fraseImpar = fraseImpar + caracterS;
            } else {
                caracter = frase.charAt(i);
                caracterS = caracterS.valueOf(caracter);
                frasePar = frasePar + caracterS;
            }
        }
        System.out.println("Frase de las posiciones pares: " + frasePar);
        System.out.println("Frase de las posiciones impares: " + fraseImpar);
    }

}
