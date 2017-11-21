/**
* Ejercicio2 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio2 {
    public static void main(String[] args) {
      System.out.println("Carta aleatoria: ");
  
      int carta = (int)(Math.random()*9)+2;

      switch (carta) {
        case 2:
         System.out.println("2");
         break;
        case 3:
         System.out.println("3");
         break;
         case 4:
         System.out.println("4");
         break;
         case 5:
         System.out.println("5");
         break;
         case 6:
         System.out.println("6");
         break;
         case 7:
         System.out.println("7");
         break;
         case 8:
         System.out.println("8");
         break;
         case 9:
         System.out.println("9");
         break;
         case 10:
         System.out.println("10");
         break;
      }//switch
      
      int tipo = (int)(Math.random()*4)+1;
      
      switch (tipo) {
       case 1:
        System.out.println("Picas");
        break;
        case 2:
        System.out.println("Corazones");
        break;
        case 3:
        System.out.println("Diamantes");
        break;
        case 4:
        System.out.println("Tréboles");
        break;
        
      }
      
    } //class
  } //Static
