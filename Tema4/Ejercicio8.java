/**
* Ejercicio8 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Dame 3 notas para hacer la media");
    
    double n1 = Double.parseDouble(System.console().readLine());
    double n2 = Double.parseDouble(System.console().readLine());
    double n3 = Double.parseDouble(System.console().readLine());
    
    double total = (n1+n2+n3)/3;
    
    System.out.println("La media de las 3 notas es de " + total);
    
    if ((total >= 0) && (total < 5)) {
      System.out.println("Tu nota es Insuficiente");
    }
    
    if ((total >= 5) && (total < 6)) {
      System.out.println("Tu nota es suficiente");
    }
    
    if ((total >= 6) && (total < 7)) {
      System.out.println("Tu nota es Bien");
    }
    
    if ((total >= 7) && (total < 9)) {
      System.out.println("Tu nota es Notable");
    }
    
    if ((total >= 9) && (total < 11)) {
      System.out.println("Tu nota es Sobresaliente");
    }
  }
}

