/**
* Ejercicio11 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Kb a Mb ");
    System.out.print("Dame el numero de Kb: ");
    double Kb = Double.parseDouble(System.console().readLine());
    double Mb = 0.001;
    
    double Total = Mb * Kb ;
   
    System.out.println(Kb + " Kb son: "+ Total + " Mb");
        
    }
}
