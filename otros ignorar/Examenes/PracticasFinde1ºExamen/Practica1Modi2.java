/**
* Practica Tema5
* introducir numero hasta un numero capicua
* @author German Zambrana Ruiz
*/
  public class Practica1Modi2 {
    public static void main(String[] args) {
      int numero = 0;
      int aux = 0;
      int cont = 0;
      int volteado = 0;
      boolean esCapicua = false;
      
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
             esCapicua = true;
            }
            
            
          } //while 2º
        }
        
        if (volteado != numero) {
             cont++;
             esCapicua = false;
            }
            
      } //for
      if (esCapicua) {
      System.out.print(cont+" Numeros no Capicua");
      }
      
    }
  }
