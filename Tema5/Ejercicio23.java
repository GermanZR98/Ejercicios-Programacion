/**
* Ejercicio23 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio23 {
    public static void main(String[] args) {
      System.out.println("Dime nº hasta que su suma total sea mayor de 10000");
      
      int contn = 0;
      int cont = 0;
      int n = 0;
      
      while (cont <= 10000) {
        System.out.print("Dame un número: ");
        n = Integer.parseInt(System.console().readLine());
        cont += n;
        contn++;
        }
        System.out.println("Total: " +cont);
        System.out.println("Media: " +cont/contn);
        System.out.println("Numeros Introducidos: " +contn);
        
      }
    }
    
