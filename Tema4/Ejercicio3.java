/**
* Ejercicio3 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Dame un número del 1-7 y te daré un día de la semana");
    
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
    case 1:
      System.out.println("Lunes");
      break;
      
    case 2:
      System.out.println("Martes");
      break;
      
    case 3:
      System.out.println("Miercoles");
      break;
    
    case 4:
      System.out.println("Jueves");
      break;
    
    case 5:
      System.out.println("Viernes");
      break;
      
    case 6:
      System.out.println("Sabado");
      break;
      
    case 7:
      System.out.println("Domingo");
      break;
    
    default:
      System.out.println("El numero tiene que ser del 1-7");
      
    }
}
}

      
      
      
    
