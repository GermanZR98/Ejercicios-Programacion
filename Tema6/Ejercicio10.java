/**
* Ejercicio10 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio10 {
    public static void main(String[] args) {
     
     for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 40; j++) {
         int caracter = (int)(Math.random()*6);
         
          switch (caracter) {
           case 0:
            System.out.print("*");
            break;
            case 1:
            System.out.print("-");
            break;
            case 2:
            System.out.print("=");
            break;
            case 3:
            System.out.print(".");
            break;
            case 4:
            System.out.print("|");
            break;
            case 5:
            System.out.print("@");
            break;
          }//switch
        }//for de las caracteres 
        System.out.println();
      }//for de las lineas


    }
  }
