/*
 * Ejercicio 1 del examen
 * Introducir numeros positivos hasta un primo
 * @author German Zambrana Ruiz
 * 16/11/2017
 * 2º Turno 
 */
  public class Ejerciciodam1 {
    public static void main(String[] args) {
      
    boolean esPrimo = true;
    int numero = 0;
    int contNoPrimo = 0;
    
    System.out.print("Por favor, vaya introduciendo números enteros positivos. Para terminar,introduzca un número primo: ");
    System.out.println();
    while (esPrimo) {
      numero = Integer.parseInt(System.console().readLine());

      
      int cont = 2;
      while (cont < numero) {
        if ((numero % cont) == 0) {
          esPrimo = false;
        }
        cont++;
      } //Cierra el while 
      
    
      if (esPrimo) {
      esPrimo = false;  
      } else {
      esPrimo = true;  
      }
    }
      
    } //Class
  } //Static
