/**
* Ejercicio13 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Dame 3 números enteros y los ordeno");
    System.out.println("Dame el primer número");
    
    int n1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dame el segundo número");
    
    int n2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dame el tercer número");
    
    int n3 = Integer.parseInt(System.console().readLine());
    
    //N1 N2 N3
    
    if ((n1 > n2) && (n2 > n3)) {
      System.out.println("El orden es el siguiente: " + n1 + n2 + n3);
      }
      
    //N2 N1 N3
      
    if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
      System.out.println("El orden es el siguiente: " + n2 + n1 + n3);
      }
      
    //N3 N1 N2
    
    if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
      System.out.println("El orden es el siguiente: " + n2 + n1 + n3);
      }
      
    //N3 N2 N1
    
    if ((n3 > n1) && (n3 > n2) && (n2 > n1)) {
      System.out.println("El orden es el siguiente: " + n3 + n2 + n1);
      }
    
  }
}

    
