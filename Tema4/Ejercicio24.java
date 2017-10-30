/**
* Ejercicio24 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo de empleado (1-3):");
    int empleo = Integer.parseInt(System.console().readLine());
    
    double sueldo = 0;
    
    switch (empleo) {
      case 1: 
       sueldo = 950;
      break;
      case 2: 
       sueldo = 1200;
      break;
      case 3: 
       sueldo = 1600;
      break;
    default:
     System.out.println("Por favor introduzca los datos bien");
   }
   
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int viajes = Integer.parseInt(System.console().readLine());
    double sueldo2 = 0; 
    
   if (viajes > 0) {
     sueldo2 = 30;
     }
    
    double viajes2 = viajes * 30;
    double totalt = sueldo + viajes2;
    
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estado = Integer.parseInt(System.console().readLine());
    double irpf = 0;
    
    switch (estado) {
      case 1:
       irpf = (totalt * 25)/100;
      break;
      case 2:
       irpf = (totalt * 20)/100;
      break;
  }
    
    System.out.println("-----------------------------------");
    System.out.print("Sueldo base        " + sueldo +"-\n");
    System.out.print("Dietas (" + viajes + ")         " + viajes2 +"\n");
    System.out.println("-----------------------------------");
    System.out.print("Sueldo bruto        "+ (sueldo + viajes2) +"\n");
    System.out.println("Retencion IRPF         " + irpf);
    System.out.println("-----------------------------------");
    System.out.println("Sueldo neto        " + (totalt ));
    System.out.println("-----------------------------------");
    
}
}


