/**
* Ejercicio22 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Dime un dia de la semana y te diré cuanto falta para el finde: ");
    String dia = System.console().readLine();
    
    int numerodia = 0;
    
    if (dia.equals("lunes")) {
      numerodia = 0;
      }
    if (dia.equals("martes")) {
      numerodia = 1;
      }
    if (dia.equals("miercoles")) {
      numerodia = 2;
      }
    if (dia.equals("jueves")) {
      numerodia = 3;
      }
    if (dia.equals("viernes")) {
      numerodia = 4;
      }
      
    System.out.println("Primero dime la hora");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Ahora dime los minutos");
    int minutos = Integer.parseInt(System.console().readLine());
      
    int totalAct = (numerodia * 24 * 60) + (hora * 60) + minutos;
    int finde = (4 * 24 * 60) + (15 * 60);
    
    System.out.println("Para el fin de semana faltan " + (finde - totalAct) + " minutos");
  }
}

