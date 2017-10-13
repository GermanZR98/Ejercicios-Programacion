/**
* Ejercicio10 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Mb a Kb ");
    System.out.print("Dame el numero de Megas: ");
    double Mb = Double.parseDouble(System.console().readLine());
    double Kb = 1000;
    
    double Total = Mb * Kb ;
   
    System.out.println(Mb + " Megas son: "+ Total + " Kb");
        
    }
}
