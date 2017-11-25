/**
* Ejercicio40 Tema5
*
* @author German Zambrana Ruiz
*/
  public class VueltaNumero {
    public static void main(String[] args) {
      System.out.print("Dime un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      int volteado = 0;
      int digito = 0;
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        digito = digito * 10 + volteado%10;
        volteado /= 10;
      
        if (digito % 2 == 0) {
            digito++;
            
        } else {
            digito--;
          }
            
      } //while
      
      System.out.print("El numero cambiado es: "+digito);
  }
    }
    
      
