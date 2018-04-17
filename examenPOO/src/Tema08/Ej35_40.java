package tema08;
import java.util.Scanner;
import matematicas.Varias;
import matematicas.tratamientoArrays;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej35-40 / T8
 *
 */
public class Ej35_40 {

  public static void main(String[] args) {

    //35 - convierte a palotes
    System.out.print("Numero 470213 a palotes: ");
    String p = Varias.convierteEnPalotes(470213);
    System.out.print(p + "\n");

    //36 - filtra primos
    System.out.println("Array original: ");
    int[] array = tratamientoArrays.generaArrayInt(50, 0, 100);
    Varias.printArray(array);
    System.out.println("Array filtrado con los primos: ");
    Varias.printArray(Varias.filtraPrimos(array));

    //37 - Convierte en morse
    Varias v = new Varias();
    System.out.println("Numero 562 a morse: " + v.convierteEnMorse(562));

    //38 - Filtra capicuas
    System.out.println("Array filtrado con los capicúas: ");
    Varias.printArray(v.filtraCapicuas(array));

    //39 - Número a palabras
    System.out.println("El número 25084 en palabras es: " + v.convierteEnPalabras(25084));
    
    //40 - Array con números que contienen 7
    System.out.println("Array con número que contienen 7: ");
    Varias.printArray(v.filtraCon7(array));

  }

}
