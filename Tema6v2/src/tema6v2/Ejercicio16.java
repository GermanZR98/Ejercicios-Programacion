
package tema6v2;
/**
* Ejercicio15 Tema 6
*
* @author German Zambrana Ruiz
*/
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
  System.out.println("Tirada de la suerte: ");
   
int tirada; 
int tirada1 = 0;
int tirada2 = 0;
int tirada3 = 0;
  
  for (int i = 1; i <= 3; i++) {
    tirada = (int)(Math.random()*5);
    switch (tirada) {
      case 0: 
        System.out.println("corazon");
        break;
      case 1: 
        System.out.println("diamante");
        break;
      case 2: 
        System.out.println("herradura");
        break;
      case 3: 
        System.out.println("campana");
        break;
      case 4: 
        System.out.println("limon");
        break;
    } ///switch
    
    switch (i) {
      case 1:
        tirada1 = tirada;
        break;
      case 2:
        tirada2 = tirada;
        break;
      case 3:
        tirada3 = tirada;
        break;
    }
   }//for
  
  if ((tirada1 != tirada2) && (tirada2 != tirada3) && (tirada1 != tirada2)) {
   System.out.println("Lo siento, ha perdido");
  }
  if ((tirada1 == tirada2) && (tirada2 == tirada3) && (tirada1 == tirada2)) {
   System.out.println("Has ganado 10 monedas");
  }
  if ((tirada1 == tirada2) || (tirada2 == tirada3) || (tirada1 == tirada2)) {
   System.out.println("Ha recuperado su moneda");
  }
  
    
  }//static
}//class
