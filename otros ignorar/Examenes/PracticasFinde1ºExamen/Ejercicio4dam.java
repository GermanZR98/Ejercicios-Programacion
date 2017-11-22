/**
* Ejercicio2 examen
* gusano que se come los 0 y los 8
* @author German Zambrana Ruiz
*/
public class Ejercicio4dam {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    
    long numero = Integer.parseInt(System.console().readLine());
    long numeroAlmac = 0;
    long volteado = 0;
    boolean esComido = false;
    
    while (numero > 0) {
      
      if ((numero % 10 == 0) || (numero % 10 == 8)) {
      esComido = true;
      numero /= 10;
      } else {
      numeroAlmac += numero % 10;
      numeroAlmac *= 10;
      numero /= 10;   
      }
    } //while
    
    
    while (numeroAlmac > 0) {
        volteado = (volteado * 10) + (numeroAlmac % 10);
        numeroAlmac /= 10;
      }
    
    
    if (esComido) {
    System.out.print("EL nº comido queda asi: "+volteado);  
    } else {
    System.out.print("No se ha comido nada");  
    }
    
  } //class
} //Static
