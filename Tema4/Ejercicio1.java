/**
* Ejercicio1 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio1 {
  public static void main(String[] args) {

    System.out.println("Dime un dia de la semana y te diré que asignatura tienes");
   
    String Dia = System.console().readLine();
    
    switch (Dia) {
      case "lunes":
        System.out.println("Tienes Programación");
        break;
      
      case "martes":
        System.out.println("Tienes entorno");
        break;
      
      case "miercoles":
        System.out.println("Tienes base de datos");
        break;
      
      case "jueves":
        System.out.println("Tienes sistemas");
        break;
      
      case "viernes":
        System.out.println("Tienes fol");
        break;
      
      default:
        System.out.println("Ese dia no existe bro");
    }
}
}



