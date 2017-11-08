
package javaapplication7;

/**
 *numero = (int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
 * @author JaimeKata
 * ALMACENAR 10 ALUMNOS CON LA NOTA DE 10 ASIGNATURAS. PODER CALCULAR MEDIA DE UN ALUMNO O DE UNA ASIGNATURA
 */
public class VectorEJ8 {
    final static int colegio[][] = new int[10][10];
    final static int Max = 10;
    static int numero = 0;
    final static int numeroMinimo = 0;
    final static int numeroMaximo = 10;
    
    public static void llenarMatriz() {
        for (int i = 0; i < Max; i++) {
            colegio[0][0]= 1;
            colegio[1][0]= 2;
            colegio[2][0]= 3;
            colegio[3][0]= 4;
            colegio[4][0]= 5;
            colegio[5][0]= 6;
            colegio[6][0]= 7;
            colegio[7][0]= 8;
            colegio[8][0]= 9;
            colegio[9][0]= 10;
            
        }
    }
   
    public static void main(String[] args) {
        llenarMatriz();
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                System.out.print(colegio[i][j]);
            }
        }
    }
    
}
