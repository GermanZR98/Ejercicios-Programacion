/**
* Ejercicio321 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio321 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      long numero2 = 0;
      long division = numero;
      long digitos = 0;
      long suma = 0;
      System.out.print("Los numeros primos son:");
      
      while (numero > 0) {
        division/=10;
        digitos++;
        numero2 = numero%10;
        numero = numero/10; //El numero se reduce 
        if (numero2 % 2 == 0) {
          System.out.print(" "+numero2);
          suma += numero2;
        }
      }
      System.out.println(" ");
      System.out.print("La suma es: "+suma);
    }
  }
  
