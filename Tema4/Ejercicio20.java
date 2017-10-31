/**
* Ejercicio20 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te diré si es capićua");
    System.out.print("Máximo 5 cifras: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10) {
      System.out.print("El nº es capicúa");
    }
    
    if ((numero >= 10) && (numero <= 100)) {
      if ((numero/10) == (numero%10))
      System.out.print("El nº es capicúa");
    }
    
    if ((numero >= 100) && (numero <= 1000)) {
      if ((numero/100) == (numero%10))
      System.out.print("El nº es capicúa");    
    }
    
    if ((numero >= 1000) && (numero <= 10000)) {
      if ((numero/1000) == (numero%10) && ((numero/100)%10) == ((numero%100)/10))
      System.out.print("El nº es capicúa");    
    }
    
    if ((numero >= 10000) && (numero <= 100000)) {
      if ((numero/10000) == (numero%10) && (((numero/1000)%10) == ((numero%100)/10)))
      System.out.print("El nº es capicúa"); 
    }
  }
 }


  
    
