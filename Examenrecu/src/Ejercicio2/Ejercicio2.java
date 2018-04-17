package Ejercicio2;

/**
 *
 * @author German98
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }//main
    
    public static int nEsimo(int[][] n, int posicion) {
    
    int[][] num = new int[4][6];
    for (int i = -1; i < 4; i++) {
      for (int j = -1; j < 6; j++) {
        if (i < 0 && j < 0) {
          System.out.printf("%10s", "Array num ");
        } else if (i < 0 && j >= 0) {
          System.out.printf("%15s", "Columna " + j);
        } else if (j<0) {
          System.out.print("Fila " + i);   
        } else {
           System.out.printf("%15d", num[i][j]);
        }    
      }
      System.out.println();
    }
    
}
