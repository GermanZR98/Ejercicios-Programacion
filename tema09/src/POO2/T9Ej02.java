package POO2;
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej2 / T9
 *
 */
import java.util.Scanner;

public class T9Ej02 {

  public static void main(String[] args) {
    
    Coche coche = new Coche(89000);
    Bicicleta bici = new Bicicleta(20);

   String menu ="\nVEHÍCULOS\n"
      + "=========\n"
      + "1. Anda con la bicicleta\n"
      + "2. Haz el caballito con la bicicleta\n"
      + "3. Anda con el coche\n"
      + "4. Quema rueda con el coche\n"
      + "5. Ver kilometraje de la bicicleta\n"
      + "6. Ver kilometraje del coche\n"
      + "7. Ver kilometraje total\n"
      + "8. Salir\n"
      + "Elige una opción (1-8), -1 para salir:";
    Scanner s = new Scanner(System.in);
    int op;
    do {
      System.out.println(menu);
      op = s.nextInt();
      switch (op) {
        case 1:
          bici.pedalea();
          break;
        case 2:
          bici.caballito();
          break;
        case 3:
          coche.acelera();
          break;
        case 4:
          coche.quemaRueda();
          break;
        case 5:
          System.out.println(bici.getKilometrosRecorridos());
          break;
        case 6:
          System.out.println(coche.getKilometrosRecorridos());
          break;
        case 7:
          System.out.println(Vehiculo.getKilometrosTotales());
          break;
        case 8:
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("No has seleccionado una opción válida.");
      }
    } while (op != 8);

  }
}
