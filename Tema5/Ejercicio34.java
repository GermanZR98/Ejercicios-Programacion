/**
* Ejercicio34 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio34 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      System.out.print("Dime otro número: ");
      long numero2 = Long.parseLong(System.console().readLine());
      
      long cont = 1;
      long volteado = 0;
      long volteado2 = 0;
      long numero3 = 0; //Numero3 seria el numero2 del numero1
      long numero4 = 0; //Numero4 es el numero 2 del numero2
      long almacenamientoPar = 0;
      long almacenamientoPar2 = 0;
      long almacenamientoImpar = 0;
      long almacenamientoImpar2 = 0;
      //Voltear numero1
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      while (volteado > 0) {
        numero3 = volteado%10;
        volteado = volteado/10;
        
        if (numero3 % 2 == 0) {
          almacenamientoPar = almacenamientoPar * 10 + numero3;
        } else
        almacenamientoImpar = almacenamientoImpar * 10 + numero3;
      }
      //Voltear numero2
      while (numero2 > 0) {
        volteado2 = (volteado2 * 10) + (numero2 % 10);
        numero2 /= 10;
      }
      while (volteado2 > 0) {
        numero4 = volteado2%10;
        volteado2 = volteado2/10;
        
        if (numero4 % 2 == 0) {
          almacenamientoPar2 = almacenamientoPar2 * 10 + numero4;
        } else 
        almacenamientoImpar2 = almacenamientoImpar2 * 10 + numero4;
      }
      System.out.println("Los numeros pares son: "+almacenamientoPar+""+almacenamientoPar2);
      System.out.println("Los numeros impares son: "+almacenamientoImpar+""+almacenamientoImpar2);
    }
  }

  
