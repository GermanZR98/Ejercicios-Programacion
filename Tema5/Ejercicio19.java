/**
* Ejercicio19 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio19 {
    public static void main(String[] args) {
      System.out.print("Dime la altura de la pirámide: ");
      int alturaInt = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime el carácter de la pirámide: ");
      String c = System.console().readLine();
      
      int altura = 1;
      int espacios = alturaInt - 1;
      
      while (altura <= alturaInt) {
      
      //Espacios 
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
     
      //Linea
      for (int i = 1; i < altura * 2; i++) {
        System.out.print(c);
      }
      
        System.out.println();
        altura++;
        espacios--;
      }
      }
    }
