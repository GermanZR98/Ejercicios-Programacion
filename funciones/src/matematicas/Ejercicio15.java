package matematicas;

/**
 *
 * @author German
 */
import matematicas.FuncionesEjercicios1a14;

public class Ejercicio15 {

  public static void main(String[] args) {

    for (int i = 1; i < 1000; i++) {
      if (FuncionesEjercicios1a14.primo(i) == true) {
      System.out.println(i + " ");
      }
    }
  }
}
