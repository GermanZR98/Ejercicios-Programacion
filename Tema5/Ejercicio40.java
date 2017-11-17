/**
* Ejercicio40 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio40 {
    public static void main(String[] args) {
      System.out.print("Dime la altura de la pirámide: ");
      int alturaInt = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime el carácter de la pirámide: ");
      String c = System.console().readLine();
      
      int altura = 1;
      int espacios = altura2;
      
      while (altura <= (alturaInt-1)/2) {
      
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
      } //while
        
        
      //Seunda parte
      
      int altura2 = (alturaInt-1)/2;
      int espacios2 = 1;
      
      while (altura2 <= (alturaInt/2)-3) {
      
        //Espacios 
        for (int i = 3; i >= espacios2; espacios2++) {
          System.out.print(" ");
        }
     
        //Linea
        for (int i = 2; i < alturaInt; i++) {
          System.out.print(c);
        }
      
        System.out.println();
        altura2++;
        espacios2 -= 3;
      }
      }
    }

