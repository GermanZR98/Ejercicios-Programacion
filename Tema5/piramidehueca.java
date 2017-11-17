/**
* piramidehueca Tema5
*
* @author German Zambrana Ruiz
*/
  public class piramidehueca {
    public static void main(String[] args) {
      System.out.print("Dime la altura de la pirámide: ");
      int alturaIntroducida = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime el carácter de la pirámide: ");
      String caracter = System.console().readLine();
      
      int espacios = alturaIntroducida - 1;
      int espacioInternos = 1;
      int altura = 1;
      int base = 1;
      
      for (int i = 1; i <= espacios; i++) {
      System.out.print("-");  
      }
      
      System.out.print(caracter);
      
      altura++;      
      System.out.println();
      espacios--;
      base += 2;
      
      while (altura < alturaIntroducida) {
      
        for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }
      
      System.out.print(caracter); //primer caracter
      
        for (int i = 1; i <= espacioInternos; i++) {
          System.out.print(" ");
        }
      
      System.out.print(caracter);
      altura++;
      System.out.println();
      espacioInternos += 2;
      espacios--;
      base += 2;
      
      }
      
      for (int i = 1; i <= base; i++) {
        System.out.print(caracter);
      }
  }
}
  
