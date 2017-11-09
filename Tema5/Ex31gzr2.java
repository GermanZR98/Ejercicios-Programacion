/**
* Ejercicio2 examen
*
* @author German Zambrana Ruiz
*/
public class Ex31gzr2 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    
    long numero = Integer.parseInt(System.console().readLine());
    long numero2 = 0;
    long volteado = 0;
    boolean comido = false;
    long montado = 0;
    
    while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
    if (volteado > 0) {
      while (volteado > 0) {
        numero2 = volteado%10;
        volteado = volteado/10;
        if ((numero2 != 8) && (numero2 != 0)) {
          comido = false;
          System.out.print(numero2);
        }
        if ((numero2 == 8) || (numero2 == 0)) {
        comido = true;  
        }
      }
    }
    
    if (!comido) {
      System.out.println(" <-- Con ese numero el gusano numérico no se ha comido ningún dígito.");
    }
    if (comido) {
      System.out.println(" <-- Así se quedó el número cuando el gusano se lo comió");
    }
  }
}

