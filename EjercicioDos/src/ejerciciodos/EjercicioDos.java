/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaime-kata
 */
public class EjercicioDos {

    
   
    public static void main(String[] args) throws IOException {
        String cadena = ""; 
        int numeroMayusculas = 0; 
        int numeroMinusculas = 0;
        int numeroCaracteres = 0;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba una cadena para contar sus mayusculas y minusculas: ");
        cadena = entrada.readLine();
        numeroCaracteres = cadena.length();
        for(int i = 0; i<numeroCaracteres; i++){
            if(cadena.charAt(i)>= 65 && cadena.charAt(i)<= 90 || cadena.charAt(i)== 165){
                numeroMayusculas ++; 
            }else{
               if(cadena.charAt(i)>= 97 && cadena.charAt(i)<=122  || cadena.charAt(i)== 164){
                   numeroMinusculas ++;
               }
                   
            }
        }
        System.out.println("La cadena: "+cadena+" tiene "+numeroMayusculas+" mayusculas y "+numeroMinusculas+" minusculas");
    }
    
}
