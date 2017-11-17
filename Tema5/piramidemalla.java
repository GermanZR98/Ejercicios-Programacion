/**
* piramidemalla Tema5
*
* @author German Zambrana Ruiz
*/
  public class piramidemalla {
    public static void main(String[] args) {
      System.out.print("Dime la altura de la pirámide: ");
      int alturaIntroducida = Integer.parseInt(System.console().readLine());
      
      int altura = 1;
      int espacios = alturaIntroducida - 1;
      int asteriscosLinea = 6;
      int asteriscos = 2;
      int espaciosInternos = 4;
      
      while (altura <= alturaIntroducida) {
        
        for (int i = 1; i <= espacios; i++) {
          
          System.out.print(" ");
        }
        for (int i = 1; i <= asteriscosLinea; i++) {
          System.out.print("*");
          }
          
          altura++;
          System.out.println();
          espacios--;
          asteriscosLinea += 4;
          
          if (altura <= alturaIntroducida) {
          
            for (int i = 1; i <= espacios; i++) {
              System.out.print(" ");
            }
            
            for (int i = 1; i <= asteriscos; i++) {
              System.out.print("*");
            }
            
            for (int i = 1; i <= espaciosInternos; i++) {
              System.out.print(" ");
            }
            
            for (int i = 1; i <= asteriscos; i++) {
              System.out.print("*");
            }
            
            altura++;
            System.out.println();
            espacios--;
            asteriscos += 2;
          }
      }
   
   
    }
  }
  
