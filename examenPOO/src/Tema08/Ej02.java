package tema08;
import matematicas.tratamientoArrays;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej20-28 / T8
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    //Genera un array de tamaño n, y de rango [minimo,maximo]
    int[] miArray = tratamientoArrays.generaArrayInt(10, 0, 3);
    System.out.print("ARRAY ORIGINAL: ");
    print(miArray);

    //Saca el minimo del array
    System.out.println("Mínimo: " + tratamientoArrays.minimoArrayInt(miArray));

    //Saca el maximo del array
    System.out.println("Máximo: " + tratamientoArrays.maximoArrayInt(miArray));

    //Saca la media del array
    System.out.println("Media: " + tratamientoArrays.mediaArrayInt(miArray));

    //Dice si un numero está en un array
    System.out.println("Está presente el 5: " + tratamientoArrays.estaEnArrayInt(miArray, 5));

    //Voltea array
    System.out.print("Voltea: ");
    print(tratamientoArrays.volteaArrayInt(miArray));

    //Rota a la derecha n veces un array
    System.out.print("Rota 2 veces a la derecha: ");
    print(tratamientoArrays.rotaDerechaArrayInt(miArray, 2));

    //Rota a la izquierda n veces una array
    System.out.print("Rota 2 veces a la izquierda: ");
    print(tratamientoArrays.rotaIzquierdaArrayInt(miArray, 2));
  }

  public static void print(int array[]) {
    System.out.print("[");
    for (int n : array) {
      System.out.print(n + " ");
    }
    System.out.print("]\n");
  }
}
