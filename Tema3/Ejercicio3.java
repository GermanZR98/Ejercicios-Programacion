/**
* Ejercicio3 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, dame el numero de pesetas: ");
    double pesetas = Double.parseDouble(System.console().readLine());
    
    
    int euros = (int)(pesetas * 0.58);
    System.out.println(pesetas + " pesetas son: " + euros + " euros");
    
    
    }
}
