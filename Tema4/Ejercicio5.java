/**
* Ejercicio5 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Dame x para hacer una ecuacion de 1º grado");
    
    int x = Integer.parseInt(System.console().readLine());
    
    if (x == 0) {
        System.out.println("El resultado es b = 0");
      }
      
    if (x > 0) {
    
        System.out.println(x +"=-b/a");
    }
    
    if (x < 0) {
    
        System.out.println(x +"=b/a");
    }
}
}

    
