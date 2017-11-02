/**
* Ejercicio11 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio11 {
    public static void main(String[] args) {
      System.out.print("Dime un nº y te diré su cuadrado y el cubo y el de los 5 siguientes: ");
      
      int num = Integer.parseInt(System.console().readLine());
      
      System.out.println("-----Cuadrado-----");
      for (int opera = num; opera < num+6; opera++) {
        System.out.println(opera + "*" + opera + "=" + opera*opera);
        }
        
      System.out.println("-----Cubo-----");
      for (int opera = num; opera < num+6; opera++) {
        System.out.println(opera + "*" + opera + "*" + opera + "=" + opera*opera*opera);
        }
      }
    }
  
