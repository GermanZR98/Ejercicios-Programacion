/**
* Ejercicio7 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio7 {
    public static void main(String[] args) {
      System.out.println("Adivina el código para abrirme ");
      System.out.print("Tienes 4 intentos: ");
      
      int cod;
      int codigo = 6619;
      int fallos = 0;
      
      cod = Integer.parseInt(System.console().readLine());;
      
      while (fallos < 3) {
        if (cod == codigo) {
          System.out.print("Enhorabuena, me has abierto");
          fallos = 4;
          } else {
        
          System.out.print("Intentalo de nuevo: ");
          cod = Integer.parseInt(System.console().readLine());;
          fallos ++;
          }
        }
      }
    }
    
  
