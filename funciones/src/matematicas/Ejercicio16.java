package matematicas;

/**
 *
 * @author German
 */
import matematicas.FuncionesEjercicios1a14;

public class Ejercicio16 {

  public static void main(String[] args) {

    for (int i = 1; i < 99999; i++) {
      if (FuncionesEjercicios1a14.capicua(i) == true) {
        System.out.println(i + " ");
      }
    }

  }//class
}//main
