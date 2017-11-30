/**
* Ejercicio12 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio12 {
    public static void main(String[] args) {
     
     int j = 1;
     
        while (j == 1) {
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
    }
  }
