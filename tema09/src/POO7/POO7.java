package POO7;
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej7 / T9
 *
 */
import java.util.Scanner;

public class POO7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String menu = "1. Mostrar número de entradas libres\n"
      + "2. Vender entradas\n"
      + "3. Salir";
    String menuZona = "1. Zona principal\n"
      + "2. Zona compra-venta\n"
      + "3. Zona vip";
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    int op;
    do {
      System.out.println(menu);
      op = s.nextInt();
      switch (op) {
        case 1:
          System.out.println("Entradas libres en zona principal: " + principal.getEntradasPorVender()
            + "\nEntradas libres en zona compra-venta: " + compraVenta.getEntradasPorVender()
            + "\nEntradas libres en zona VIP: " + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println(menuZona);
          int zona = s.nextInt();
          System.out.println("¿Cuántas entradas?");
          int n = s.nextInt();
          switch (zona) {
            case 1:
              principal.vender(n);
              break;
            case 2:
              compraVenta.vender(n);
              break;
            case 3:
              vip.vender(n);
              break;
            default:
              System.out.println("No es una zona válida");
          }
          break;
        case 3:
          break;
        default:
          System.out.println("No es una opción válida");
      }

    } while (op != 3);
  }
}
