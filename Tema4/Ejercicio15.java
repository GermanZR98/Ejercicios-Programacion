/**
* Ejercicio15 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Vamos a hacer una pirámide");
    System.out.println("Dime tambien para que dirección quieres que vaya:");
    System.out.println("arriba,abajo,izquierda o derecha:");
    
    String direccion = (System.console().readLine());
    
    System.out.println("Muy bien ahora dime el carácter");
    
    String c = (System.console().readLine());
    
    System.out.println("-----------------------------------------");
    
    if (direccion.equals("arriba")) {
      System.out.println("  "+c  );
      System.out.println(" "+c+c+c );
      System.out.println(c+c+c+c+c);
      }
      
    if (direccion.equals("abajo")) {
      System.out.println(c+c+c+c+c);
      System.out.println(" "+c+c+c );
      System.out.println("  "+c  );
      
      }
      
    if (direccion.equals("derecha")) {
      System.out.println(c);
      System.out.println(c+c );
      System.out.println(c+c+c );
      System.out.println(c+c);
      System.out.println(c);
      }
      
    if (direccion.equals("izquierda")) {
      System.out.println("  "+c);
      System.out.println(" "+c+c);
      System.out.println(c+c+c);
      System.out.println(" "+c+c);
      System.out.println("  "+c);
      }
    
  }
}

