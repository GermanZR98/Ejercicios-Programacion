/*
 * Ejercicio 3 del examen
 * 
 * @author German Zambrana Ruiz
 * 16/11/2017
 * 2º Turno 
 */
  public class Ex31gzr3 {
    public static void main(String[] args) {
      System.out.print("Introduzca el número de lineas: ");
      int lineas = Integer.parseInt(System.console().readLine());
      /////////////////////////////caso una linea
      if (lineas == 1) {
        System.out.println();
        for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        }
        System.out.println();
        
        for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        }
        System.out.println();
        
        for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        }
        System.out.println();
        
        for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        }
        System.out.println();
      }//fin if
      ////////////////////////fin caso una linea
      if (lineas != 1) {
      System.out.print("¿Cuántos espacios quiere entre cada línea? ");
      int espacios = Integer.parseInt(System.console().readLine());
      int espacioMedio = espacios;
      
      //////////////////////////////pintar las lineas 
      System.out.println();
      for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        for (int j = 1; j <= espacioMedio; j++) {
        System.out.print(" ");
        }
      }
      System.out.println();
      
      for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        for (int j = 1; j <= espacioMedio; j++) {
        System.out.print(" ");
        }
      }
      System.out.println();
      
      for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        for (int j = 1; j <= espacioMedio; j++) {
        System.out.print(" ");
        }
      }
      System.out.println();
      
      for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        for (int j = 1; j <= espacioMedio; j++) {
        System.out.print(" ");
        }
      }
      //////////////////////acaba de pintar
    
    
      } ////////cierra if
    
    } //Class
  } //Static

