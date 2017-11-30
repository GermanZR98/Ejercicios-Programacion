/**
* Ejercicio11 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio11 {
    public static void main(String[] args) {
      
      int notable = 0;
      int bien = 0;
      int suspenso = 0;
      int suficiente = 0;
      int sobresaliente = 0;
      
      for (int i = 1; i <= 20; i++) {
        int notas = (int)(Math.random()*5);
        
        switch (notas) {
           case 0:
            System.out.println("suspenso");
            suspenso++;
            break;
            case 1:
            System.out.println("suficiente");
            suficiente++;
            break;
            case 2:
            System.out.println("bien");
            bien++;
            break;
            case 3:
            System.out.println("notable");
            notable++;
            break;
            case 4:
            System.out.println("sobresaliente");
            sobresaliente++;
            break;
        }//switch
        
      }//for de las 20 lineas 
      System.out.println();
      System.out.println("suspenso "+suspenso);
      System.out.println("suficiente "+suficiente);
      System.out.println("bien "+bien);
      System.out.println("notable "+notable);
      System.out.println("sobresaliente "+sobresaliente);
    }
  }
