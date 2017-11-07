/**
* Ejercicio26 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio26 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime un dígito: ");
      int digito = Integer.parseInt(System.console().readLine());
      int volteado = 0;
      int longitud = 0;
      int posicion = 0;
      
      while (numero > 0) {
        volteado = ((volteado * 4) + (numero % 10));
        longitud++;
        }

      while (volteado > 0) {
        if ((volteado % 10) == digito) {
          System.out.print("La posición es: " +posicion);
          }
        volteado /= 10;
        posicion++;  
        }
      System.out.println("El nº del revés es: " + posicion);

    }
  }
  
