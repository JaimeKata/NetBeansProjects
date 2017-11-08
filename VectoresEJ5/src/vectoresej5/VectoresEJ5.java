
package vectoresej5;

/**
 *
 * @author JaimeKata
 * CREAR DOS VECTORES Y COMPROBAR CUANTOS VALORES ESTAN DEL PRIMERO EN EL SEGUNDO
 */
public class VectoresEJ5 {
    final static int vectorUno[] = new int[10];
    final static int vectorDos[] = new int[10];
    final static int Max = 10;
    static int numero = 0;
    static int numeroDos = 0;
    final static int numeroMinimo = 1;
    final static int numeroMaximo = 5;
    static int contElementoUno = 0;
    static int contElementoDos = 0;
    static int contElementoTres = 0;
    static int contElementoCuatro = 0;
    static int contElementoCinco = 0;
    static int contElementoSeis = 0;
    static int contElementoSiete = 0;
    static int contElementoOcho = 0;
    static int contElementoNueve = 0;
    static int contElementoDiez = 0;

    
    public static void llenarArray() {
        for (int i = 0; i < Max; i++) {
            numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            numeroDos = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            vectorUno[i] = numero;
            vectorDos[i] = numeroDos;
        }
    }
    public static void buscarComunes(){
        int numeroV1 = 0;
        int numeroV2 = 0; 
        int posicion = 0;
        for (int i = 0; i < Max; i++){
           numeroV1 = vectorUno[i];
           numeroV2 = vectorDos[i];
           posicion = i +1; 
           if(numeroV1 == numeroV2){
               switch(posicion){
                   case 1: 
                       contElementoUno ++;
                       break;
                   case 2: 
                       contElementoDos ++;
                       break;
                   case 3:
                       contElementoTres ++;
                       break;
                   case 4: 
                       contElementoCuatro ++;
                       break;
                   case 5:
                       contElementoCinco ++;
                       break;
                   case 6:
                       contElementoSeis ++;
                       break;
                   case 7: 
                       contElementoSiete ++; 
                       break; 
                   case 8:
                       contElementoOcho ++;
                       break; 
                   case 9: 
                       contElementoNueve ++;
                       break; 
                   case 10:
                       contElementoDiez ++;
                       break;
                    
               }
           }
        }
    }
    
    public static void main(String[] args) {
        llenarArray();
        buscarComunes();
        System.out.println("El primer elemento se repite: "+contElementoUno+" veces");
        System.out.println("El segundo elemento se repite: "+contElementoDos+" veces");
        System.out.println("El tercer elemento se repite: "+contElementoTres+" veces");
        System.out.println("El cuarto elemento se repite: "+contElementoCuatro+" veces");
        System.out.println("El quinto elemento se repite: "+contElementoCinco+" veces");
        System.out.println("El sexto elemento se repite: "+contElementoSeis+" veces");
        System.out.println("El septimo elemento se repite: "+contElementoSiete+" veces");
        System.out.println("El octavo elemento se repite: "+contElementoOcho+" veces");
        System.out.println("El noveno elemento se repite: "+contElementoNueve+" veces");
        System.out.println("El decimo elemento se repite: "+contElementoDiez+" veces");
                
    }
    
}
