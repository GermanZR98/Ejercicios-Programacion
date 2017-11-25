/**
* Practica Tema5
* introducir numero hasta uno negativo y decir cuantos capicuas
* @author German Zambrana Ruiz
*/
  public class Practica1 {
    public static void main(String[] args) {
      int numero = 0;
      int aux = 0;
      int cont = 0;
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
          
          
            if (volteado == numero) {
             cont++;
            }  
          } //while 2º
          
        }
      } //While
      System.out.print(cont+" Numeros Capicua");
    }
  }
      
      

  
