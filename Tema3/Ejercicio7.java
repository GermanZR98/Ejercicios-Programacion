/**
* Ejercicio7 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.print("Art.1: ");
    double Precio1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Art.2: ");
    double Precio2 = Double.parseDouble(System.console().readLine());
    
    double Base = Precio1 + Precio2;
    System.out.println("Base sin iva: " + Base);
    
    
    System.out.println("Iva: 0.21 ");
    double Iva = 1.21;
    
    double Total = Base * Iva;
    
    System.out.println("El precio total es: " + Total + "€");

    
    
    }
}
