/**
* Ejercicio15 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio15 {
    public static void main(String[] args) {
    
    int grupos = ((int)(Math.random()*7)+4); //Selecciona las 28
    for (int j = 4; j <= grupos; j++) { //pinta 4 compases
      for (int i = 1; i <= 4; i++) { //pinta 4 notas
          int notas = (int)(Math.random()*7);
          
          switch (notas) {
            case 0: 
            System.out.print("do ");
            break;
            case 1: 
            System.out.print("re ");
            break;
            case 2: 
            System.out.print("mi ");
            break;
            case 3: 
            System.out.print("fa ");
            break;
            case 4: 
            System.out.print("sol ");
            break;
            case 5: 
            System.out.print("la ");
            break;
            case 6: 
            System.out.print("si ");
            break;
          }//switch
      }//for
      System.out.print("|");
    }
    System.out.print("|");
    }
  }
