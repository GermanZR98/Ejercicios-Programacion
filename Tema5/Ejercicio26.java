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
      int numero2 = 0;
      int posicion = 0;
      //Volteo el número
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        numero2 = volteado%10;
        volteado = volteado/10;
        posicion++;
        
        if (numero2 == digito) {
         System.out.print("La posicion es: "+posicion);
        }
      }
    }
  }

