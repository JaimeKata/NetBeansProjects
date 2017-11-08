/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaime-kata
 */
public class EjercicioCuatro {

    
     
    public static void main(String[] args) throws IOException {
        String frase = null; 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame una frase para parsarla a mayusculas: ");
        frase = entrada.readLine();
        frase = frase.toUpperCase();
        System.out.println("Tu frase en mayusculas es: "+frase);
    }
    
}
