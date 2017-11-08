/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresejuno;

/**
 *
 * @author jaime-kata
 */
public class VectoresEjUno {

    final static int Max = 20;
    static int numeros[] = new int[20];
    static float media = 0;
    static int numero = 0;
    final static int numeroMaximo = 11;
    final static int numeroMinimo = -11;
    static int numerosMayores = 0;
    static int numerosIguales = 0;
    static int numerosMenores = 0;

    public static void llenarArray() {
        for (int i = 0; i < Max; i++) {
            numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
            numeros[i] = numero;
        }
    }

    public static void calcularMedia() {
        for (int i = 0; i < Max; i++) {
            media = media + numeros[i];
        }
        media = media / Max;
        System.out.println("La media de numeros es: " + media);
        for (int i = 0; i < Max; i++) {

        }
    }

    public static void comprobarNumeros() {
        for (int i = 0; i < Max; i++) {
            if(media < i){
                numerosMenores ++;
            }
            if(media == i){
                numerosIguales ++;
            }
            if(media > i){
                numerosMayores ++;
            }
        }
        System.out.println("Los numeros superiores a la media son: " + numerosMayores);
        System.out.println("Los numeros iguales a la media son: " + numerosIguales);
        System.out.println("Los numeros menores a la media son: " + numerosMenores);
        
    }

    public static void main(String[] args) {
        llenarArray();
        calcularMedia();
        comprobarNumeros();

    }

}
