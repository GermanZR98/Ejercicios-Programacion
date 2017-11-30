/**
* Ejercicio7 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio7 {
    public static void main(String[] args) {
      System.out.println("Vamos a hacer una quiniela");
      
      int columnas = 3;
      int filas;
      
      for (filas = 1; filas <= 15; filas++) {
       System.out.println(" "+filas+". ");
      
      
        if (filas == 15) {
         columnas = 1;  
        }
        
        for (int i = 1; i <= columnas; i++) {
          int apuestas = (int)(Math.random()*3);
          
          switch (apuestas) {
            case 0: 
            System.out.print("1  |"); 
            break;
            case 1: 
            System.out.print(" X |"); 
            break;
            case 2: 
            System.out.print("  2|"); 
            break;
            }//switch
        }//for
      }
    }
  }
  
