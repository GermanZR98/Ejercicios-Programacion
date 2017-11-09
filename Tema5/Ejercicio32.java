/**
* Ejercicio32 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio32 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      long numero2 = 0;
      long suma = 0;
      long volteado = 0;
      System.out.print("Los numeros pares son:");
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        numero2 = volteado%10;
        volteado = volteado/10; //El numero se reduce 
        
        if (numero2 % 2 == 0) { //Mirar si el numero es par
          System.out.print(" "+numero2);
          suma += numero2;
        }
      }
      System.out.println(" ");
      System.out.print("La suma es: "+suma);
    }
  }
