/**
* Ejercicio5 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Dame x para hacer una ecuacion de 1º grado");
    
    int a = Integer.parseInt(System.console().readLine());
    
    if (a == 0) {
        System.out.println("No tiene solución");
      }
      
    if (a > 0) {
    
        System.out.println(a +"=-b/a");
    }
    
    if (a < 0) {
    
        System.out.println(a +"=b/a");
    }
}
}

    
