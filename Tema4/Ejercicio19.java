/**
* Ejercicio19 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te daré la primera cifra");
    System.out.println("Máximo 5 cifras");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero < 10) && (numero > -10)){
      System.out.println("La primera cifra es: " + numero);
      } else {
    
    if ((numero < 100) && (numero > -100)) {
      System.out.println("La primera cifra es: " + numero/10);
      } else {
      
    if ((numero < 1000) && (numero > -1000)) {
      System.out.println("La primera cifra es: " + numero/100);
      } else {
    
    if ((numero < 10000) && (numero > -10000)) {
      System.out.println("La primera cifra es: " + numero/1000);
      } else {
      
    if ((numero > 10000) || (numero < -10000)) {
      System.out.println("Lo siento el numero tiene mas de 5 cifras :c");
      }
  }
}
}
}
}
}

