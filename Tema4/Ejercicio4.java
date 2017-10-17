/**
* Ejercicio4 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("¿Cuántas horas a la semana ha trabajado usted?");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora <= 40) {
      System.out.println("Vas a cobrar " + (hora * 12) + "€");
    }
    
    if (hora >= 41) {
      System.out.println("Vas a cobrar " + (hora * 16) + "€");
    }
  }
}

    
