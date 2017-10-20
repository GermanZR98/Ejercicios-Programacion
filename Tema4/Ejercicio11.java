/**
* Ejercicio11 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Dime una hora y te diré cuanto falta para la medianoche");
    System.out.println("Dime la hora");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime los minutos");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int hora2 = hora * 3600;
    int minutos2 = minutos * 60;
    
    int total = hora2 + minutos2 ;
    
    int medianoche = 86400;
    
    if ((hora >= 1) && (hora <= 24) && (minutos >= 0) && (minutos <= 60)) {
    System.out.println("Para medianoche quedan " + (medianoche - total) + "s");
  } else {
    System.out.println("Ese tramo horario no existe");
    }
  }
}

