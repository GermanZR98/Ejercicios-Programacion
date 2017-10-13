/**
* Ejercicio9 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular el volumen de un cono ");
    System.out.print("Dame el radio: ");
    double r = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double v = r*r*3.14*h;
    double vt = v/3;
   
    System.out.println("El volumen del cono es : " + vt + " m3");
        
    }
}
