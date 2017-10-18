/**
* Ejercicio7 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Dame 3 notas para hacer la media");
    
    double n1 = Double.parseDouble(System.console().readLine());
    double n2 = Double.parseDouble(System.console().readLine());
    double n3 = Double.parseDouble(System.console().readLine());
    
    double total = (n1+n2+n3)/3;
    
    System.out.println("La media de las 3 notas es de " + total);
  }
}
