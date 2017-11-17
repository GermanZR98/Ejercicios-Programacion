/**
* Practica Tema5
*
* @author German Zambrana Ruiz
*/
  public class Practica1 {
    public static void main(String[] args) {
      int numero = 0;
      int aux = 0;
      int cont = 0;
      int cont2 = 0;
      int volteado = 0;
      
      while (numero >= 0) {
        System.out.print("Dime un número: ");
        numero = Integer.parseInt(System.console().readLine());
        
        //Comprobar si es capicua
        if (numero >= 0) {
          aux = numero;
          volteado = 0;   //resetea volteado para que no sume
          
          while (aux > 0) {
           volteado = (volteado * 10) + (aux % 10);
           aux /= 10;
          
          } //while 2º
          
          if (volteado == numero) {
             cont++;
            } else {
             cont2++;
            }
        }
      
      } //While
      
      System.out.println();
      System.out.print("Numero capicua: "+cont);
      System.out.println();
      System.out.print("Numero no capicua: "+cont2);
      
    }
  }
      
      

  
