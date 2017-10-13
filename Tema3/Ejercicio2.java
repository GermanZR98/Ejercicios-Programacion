/**
* Ejercicio2 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, dame el numero de euros: ");
    double euros = Double.parseDouble(System.console().readLine());
    
    
    int pesetas = (int)(euros * 166);
    System.out.println(euros + " euros son: " + pesetas + " pesetas");
    
    
    }
}
