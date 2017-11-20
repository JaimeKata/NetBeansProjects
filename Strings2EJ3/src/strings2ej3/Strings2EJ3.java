
package strings2ej3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata
 * DECIR SI UNA PALABRA ES PALINDROMO O NO (SE LEE IGUAL DE IZQ A DER QUE DE DER A IZQ)
 */
public class Strings2EJ3 {
    
    
   
    public static void main(String[] args) throws IOException {
       int inicio = 0;
       String  palabra = ""; 
       int fin = 0; 
       boolean correcto = false;
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Digame una frase: ");
       palabra = entrada.readLine();
       fin = palabra.length()-1;
       
       while((inicio<fin)&&(!correcto)){
           if(palabra.charAt(inicio) == palabra.charAt(fin)){
               inicio ++;
               fin --;
           } else{
               correcto = true;
           }
       }
       if(!correcto){
           System.out.println("La palabra es palandrina");
       } else{
           System.out.println("La palabra no es palandrina");
       }
    }
    
}
 