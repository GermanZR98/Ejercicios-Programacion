/*
 * Ejercicio 4 del examen
 * 
 * @author German Zambrana Ruiz
 * 16/11/2017
 * 2º Turno 
 */
  public class Ex31gzr4 {
    public static void main(String[] args) {
      System.out.print("Introduzca un número entero positivo: ");
      int numero = Integer.parseInt(System.console().readLine());
      System.out.println();
      
      System.out.println("A continuación los dígitos se transformarán en churros:");
      
      int volteado = 0;
      int digito = 0;
    
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        digito = volteado%10;
        volteado /= 10;
    
      for (int i = 1; i<=digito; i++) {
        System.out.print("O");  
      }
      System.out.println();
      
      
      
      
      } //while
    } //Class
  } //Static

