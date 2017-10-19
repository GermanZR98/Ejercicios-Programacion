/**
* Ejercicio2 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Dime una hora y te saludare:");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias bro");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes bro");
    }
    
    if ((hora >= 21) && (hora <= 5)) {
      System.out.println("Buenas noches bro");
    }
    
    if ((hora >= 21) && (hora <= 24)) {
      System.out.println("Buenas noches bro");
    }
    
    if ((hora >= 1) && (hora <= 5)) {
      System.out.println("Buenas noches bro");
    }
    
    if (hora > 24) {
      System.out.println("Esa hora no existe");
    }
    
    
  }
}

    
    
