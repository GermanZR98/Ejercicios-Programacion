/**
* Practica Tema5
* introducir capicuas hasta un numero normal
* @author German Zambrana Ruiz
*/
  public class Practica1Modi {
    public static void main(String[] args) {
      int numero = 0;
      int aux = 0;
      double cont = 0;
      int volteado = 0;
      double suma = 0;
      double media = 0;
      boolean esCapicua = true;
      
      for (int i = 1; i<=10; i++) {
        
        System.out.print("Dime un número: ");
        numero = Integer.parseInt(System.console().readLine());
        
        //Comprobar si es capicua
        if (numero >= 0) {
          aux = numero;
          volteado = 0;   //resetea volteado para que no sume
          
          while (aux > 0) {
           volteado = (volteado * 10) + (aux % 10);
           aux /= 10;
          
          
            if (volteado == numero) {
             cont++;
             suma += numero;
             
            }
            
            
          } //while 2º
        }
        
        if (volteado != numero) {
             esCapicua = false;
            }
        
        media = suma / cont;
        
      } //While
      if (!esCapicua) {
      System.out.print("La media de los capicúa es: "+media);
      }
      
    }
  }
