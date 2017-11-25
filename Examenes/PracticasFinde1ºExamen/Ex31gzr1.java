/**
* Examen Tema1
* Los numeros no primo, max min y media
* @author German Zambrana Ruiz
*/

  public class Ex31gzr1 {
    public static void main(String[] args) {
      System.out.print("Examen de programacion");
      
      System.out.println();
      boolean esPrimo = true;
      int cont = 0;
      int suma = 0;
      int numMax = 1;
      int numMin = 999999999;
      
      while (esPrimo) {
        System.out.print("Dame un numero: ");
        int n = Integer.parseInt(System.console().readLine());
        
        for (int i = 2; i < n; i++) {
          if (n % i == 0) {
            esPrimo = false;
          }
        }
        
        if (esPrimo) {
          esPrimo = false;
        } else {
        esPrimo = true;
        
        cont++;
        suma += n;
        
        if (n < numMin) {
          numMin = n;
        }
        
        if (n > numMax) {
          numMax = n;
        }
      } 
    } //While
      
      
      System.out.print("Los numeros no primos son: "+cont);
      System.out.println();
      System.out.print("El numero maximo es: "+numMax);
      System.out.println();
      System.out.print("El numero min es: "+numMin);
      System.out.println();
      System.out.print("La media es: "+suma/cont); 
    
  } 
}
