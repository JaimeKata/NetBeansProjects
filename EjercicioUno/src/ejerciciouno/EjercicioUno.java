/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaime-kata
 */
public class EjercicioUno {

 
    public static void main(String[] args) throws IOException {
        String palabra = null; 
        int numeroCaracteres = 0; 
        String palabraImpresa = "";
        int lineas = 0; 
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame una palabra: ");
        palabra = entrada.readLine();
        numeroCaracteres = palabra.length();
        while(lineas < numeroCaracteres){
            palabraImpresa = palabraImpresa + palabra.charAt(lineas);//CharArt se queda con el caracter 
            System.out.println(palabraImpresa);
            lineas ++;
        }
    }
    
}
