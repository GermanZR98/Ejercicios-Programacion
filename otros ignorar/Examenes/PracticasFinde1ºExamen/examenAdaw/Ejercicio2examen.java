
/*
* @author German Zambrana Ruiz
*/
  public class Ejercicio2examen {
    public static void main(String[] args) {
      double numero = 0;
      double contPrimo = 0;
      double cont = 2;
      double suma = 0;
      double media = 0;
      boolean esPrimo = true;
      
      for (int i = 0; i < 10; i++) {
        esPrimo = true;
        
        System.out.print("Dame un número: ");
        numero = Integer.parseInt(System.console().readLine());
        //COmprobar si es primo
        cont = 2;
        
        while (cont < numero) {
          if ((numero % cont) == 0) {
            esPrimo = false;
          }
          cont++;
        } //Cierra el while 
      
        if (esPrimo) {
        contPrimo++;
        suma += numero;
        }
        
      } //CIerra el for 
      media = suma / contPrimo;
      System.out.println();
      
      if (contPrimo == 0) {
       System.out.print("No ha introducido primos");
      } else {
       System.out.print("La media de primos es: "+media); 
      }
  }
}

