/**
* Ejercicio6 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, dame la base: ");
    double Base = Double.parseDouble(System.console().readLine());
    
    
    System.out.print("Por favor, dame la altura: ");
    double Alt = Double.parseDouble(System.console().readLine());
    
    double Operacion1 = Base * Alt;
    double Operacion2 = Operacion1 / 2;
    
    System.out.println("El área del triángulo es: " + Operacion2);

    
    
    }
}
