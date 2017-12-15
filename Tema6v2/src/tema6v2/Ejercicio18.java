package tema6v2;

/**
 * Ejercicio18 tema6
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int colora1 = 0;
    int colora2 = 0;
    int colora3 = 0;

    while ((colora1 == colora2) || (colora2 == colora3) || (colora1 == colora3)) {
      colora1 = (int) (Math.random() * 5);
      colora2 = (int) (Math.random() * 5);
      colora3 = (int) (Math.random() * 5);
    }
    String color1 = "";

    switch (colora1) {
      case 0:
        color1 = "rojo";
        break;
      case 1:
        color1 = "azul";
        break;
      case 2:
        color1 = "verde";
        break;
      case 3:
        color1 = "amarillo";
        break;
      case 4:
        color1 = "violeta";
        break;
      case 5:
        color1 = "naranja";
        break;
      default:
    }

    String color2 = "";

    switch (colora2) {
      case 0:
        color2 = "rojo";
        break;
      case 1:
        color2 = "azul";
        break;
      case 2:
        color2 = "verde";
        break;
      case 3:
        color2 = "amarillo";
        break;
      case 4:
        color2 = "violeta";
        break;
      case 5:
        color2 = "naranja";
        break;
      default:
    }

    String color3 = "";

    switch (colora3) {
      case 0:
        color3 = "rojo";
        break;
      case 1:
        color3 = "azul";
        break;
      case 2:
        color3 = "verde";
        break;
      case 3:
        color3 = "amarillo";
        break;
      case 4:
        color3 = "violeta";
        break;
      case 5:
        color3 = "naranja";
        break;
      default:
    }
    System.out.println(color1 + " " + color2 + " " + color3);
  }

}
