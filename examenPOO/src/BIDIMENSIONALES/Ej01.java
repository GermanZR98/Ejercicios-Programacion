
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej01 / T7
 *
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla
 *
 */
public class Ej01 {

  public static void main(String[] args) {

    int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    for (int i = -1; i < 3; i++) {
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
}
