
package strings2ej4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata PEDIR DOS NOMBRES CON SU APELLIDO E INTERCAMBIAR LOS APELLIDOS
 */
public class Strings2EJ4 {
    static String nombreApellido1 = "";
    static String nombreApellido2 = "";
    static String[] persona1;
    static String[] persona2;
    
    public static void separarNombreApellido(){
        persona1 = nombreApellido1.split(" ");
        persona2 = nombreApellido2.split(" ");
        System.out.println(persona1[0]+" "+persona2[1]);
        System.out.println(persona2[0]+" "+persona1[1]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digame nombre y apellido de la persona uno: ");
        nombreApellido1 = entrada.readLine();
        System.out.println("Digame nombre y apellido de la persona dos: ");
        nombreApellido2 = entrada.readLine();
        separarNombreApellido();
    }
    
}
