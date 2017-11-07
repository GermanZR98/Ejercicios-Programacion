/**
* Ejercicio27 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio27 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      int contMult = 1;
      int cont = 0;
      int suma = 0;
      
      while (contMult < numero) {
        if (contMult % 3 == 0) {
          System.out.println(contMult);
          cont++;
          suma += contMult;
        }
        contMult++;
      }
      System.out.println("-------------------------");
      System.out.println("Hay " +cont +" números");
      System.out.println("La suma total es: "+suma);
    }
  }
  
