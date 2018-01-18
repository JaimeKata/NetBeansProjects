package estaticosej6;

import java.util.Scanner;

/**
 *
 * @author JaimeKata Pedir dos numeros y calcular el minimo comun multiplo de
 * ambos
 */
public class EstaticosEj6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        System.out.println("Digame un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digame un segundo numero: ");
        numero2 = entrada.nextInt();
        int min = Math.min(numero1, numero2);
        int mcm = 0; 
        for (int i = 1; i<min; i++ ){
            if(numero1%i == 0 && numero2%i == 0){
                int mcd = i; 
                resultado = minimoComunMult(numero1, numero2)/mcd;
            }
        }
       System.out.println("El minimo comun multiplo de "+numero1+" y del numero "+numero2+" es: "+resultado);
    }//main 

    public static int minimoComunMult(int numero1, int numero2) {
        int mcm = 0;
        int maximos = 0;
        int minimos = 0; 
        maximos = Math.max(numero1, numero2);
        minimos = Math.min(numero1, numero2);
        mcm = (maximos/maximoComunDivisor(maximos, minimos)*minimos);
        return mcm; 
    } //minimoComunMult
    
    public static int maximoComunDivisor(int numero1, int numero2){
        int mComDivisor =0; 
        int maximo = Math.max(numero1, numero2);
        int minimo = Math.min(numero1, numero2);
        do{
            mComDivisor = minimo; 
            minimo = maximo%minimo; 
            maximo = mComDivisor; 
            
        }while(minimo!=0);
        return mComDivisor;
    }

}
