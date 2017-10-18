/**
* Ejercicio9 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Dame el valor de a,b y c");
    
    double a = Double.parseDouble(System.console().readLine());
    double b = Double.parseDouble(System.console().readLine());
    double c = Double.parseDouble(System.console().readLine());

    //Si a = 0 b = 0 c = 0
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("No tiene solución");
      }
      
    //Si a = 0 b = 0
    if ((a == 0) && (b == 0)) {
      System.out.println("El resultado es c = 0");
      } 
      
    //Si a = 0 c = 0
    if ((a == 0) && (c == 0)) {
      System.out.println("El resultado es: " + b + "x=0");
      } 
          
    //Si b = 0 c = 0
    if ((c == 0) && (b == 0)) {
      System.out.println("El resultado es: " + a + "x²=0");
      } 
          
    //Si a = 0 
    if (a == 0) {
      System.out.println("El resultado es: " + b + "x+" + c + "=0");
      } 
          
    //Si b = 0 
    if (b == 0) {
      System.out.println("El resultado es: " + a + "x²+" + c + "=0");
      } 
            
    //Si c = 0
    if (c == 0) {
      System.out.println("El resultado es: " + a + "x²+" + b + "x=0");
      } 
              
      }
    }
  
