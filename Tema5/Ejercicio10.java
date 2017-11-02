/**
* Ejercicio10 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio10 {
    public static void main(String[] args) {
      System.out.println("Dame numeros positivos y te diré la media de ellos");
      System.out.println("Para parar el programa introduce un nº negativo");
      
      double media = 0;
      double numeros = 0;
      double suma = 0;
      
      while (numeros >= 0) {
        System.out.print("Introduce el número: ");
        numeros = Integer.parseInt(System.console().readLine());
        if (numeros >= 0) {
        suma = numeros + suma;
        media++;
      }
    }
      System.out.print("La media de los números es: " +suma/media);
     }
    }
    
