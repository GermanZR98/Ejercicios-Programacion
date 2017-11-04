/**
* Ejercicio20 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio20 {
    public static void main(String[] args) {
      System.out.print("Dime la altura de la pirámide: ");
      int alturaInt = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime el carácter de la pirámide: ");
      String c = System.console().readLine();
      
      int espacios = alturaInt - 1;
      int j = 1; 
      
      //Control de todo
      while (j <= alturaInt) {
      
      //Espacios 
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      System.out.print(c); 
      
      //Relleno
      for (int i = 3; i <= j * 2; i++) {
        System.out.print(" ");
      }
      
      System.out.print(c); 
      System.out.println();
      espacios--;
      j++;
      }
      //Base
      for (int i = 1; i < j * 2; i++) {
        System.out.print(c);
      }
    }
  }

