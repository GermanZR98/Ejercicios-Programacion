
/*
* @author German Zambrana Ruiz
*/
  public class Ejercicio3examen {
    public static void main(String[] args) {
      
      System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
      int longitud = Integer.parseInt(System.console().readLine());
      
      
      for (int altura = 1; altura <= longitud; altura++) {
      System.out.print("*");
      } //Cierra el for principal
     
      System.out.println();
      
      for (int altura = 1; altura <= longitud; altura++) {
      System.out.print("*");
      }
      System.out.println();
      
      
      ////////////////////////////////huecos
      
      for (int medio = 1; medio <= longitud-4; medio++) {
      for (int i = 1; i <= 2; i++) {
      System.out.print("*");  
      }
      
      for (int i = 1; i <= longitud-4; i++) {
      System.out.print(" ");  
      }
      
      for (int i = 1; i <= 2; i++) {
      System.out.print("*");  
      }
      System.out.println();
      }//Cierra el for
      /////////////////////////////////base de abajo
      for (int altura = 1; altura <= longitud; altura++) {
      System.out.print("*");
      } 
     
      System.out.println();
      
      for (int altura = 1; altura <= longitud; altura++) {
      System.out.print("*");
      }
      
    } //class
  } //static
