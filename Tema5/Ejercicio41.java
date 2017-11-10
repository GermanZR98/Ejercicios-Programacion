/**
* Ejercicio41 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio41 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      
      long cont = 0;
      long cont2 = 0;
      long volteado = 0;
      long digito = 0; //Numero3 seria el numero2 del numero1

      //Voltear numero1
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      while (volteado > 0) {
        digito = volteado%10;
        volteado = volteado/10;
        
        if (digito % 2 == 0) {
          cont++;
        } else
        cont2++;
      }
      System.out.println("Ese número contiene "+cont+" pares y "+cont2+" impares");
    }
  }
  
