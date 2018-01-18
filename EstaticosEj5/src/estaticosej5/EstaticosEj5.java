
package estaticosej5;

import java.util.Scanner;

/**
 *
 * @author JaimeKata
 * Calcular el maximo comun divisor de dos numeros 
 * 
 */
public class EstaticosEj5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0; 
        System.out.println("Digame un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digame un segundo numero: ");
        numero2 = entrada.nextInt();
        maximoComunDiv(numero1);
        maximoComunDiv(numero2);
    }//main 
    
    public static void maximoComunDiv(int numero1){
        float resto = 0;
        float division = 0;
        int numeroDivisores = 0; 
        System.out.println("MAXIMO COMUN DIVISOR DE: "+numero1);
        for(int i = 1; i<=9; i++){
           resto = numero1%i;
           division = numero1/i;
           if(resto == 0){
               numeroDivisores ++;
               System.out.println(numero1+"/"+i+" = "+division+" con resto 0, por lo que es divisior de "+numero1);
           }
        }
        System.out.println("El numero de divisores es: "+numeroDivisores);
    }//maximoComunDiv
}
