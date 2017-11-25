/**
* Ejercicio14 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio14 {
    public static void main(String[] args) {
      
      int numero = 0;
      int mayor = 0;
      int menor = 0;
      
      numero = (int)(Math.random()*100);
      System.out.println("El numero que estas pensando es el? "+numero);
      
      int respuesta = 0;
      int intentos = 5;
      int opciones = 0;
      
      while (intentos > 1) {
        System.out.print("El numero es 1)mayor 2)menor 3)solucion: ");
        opciones = Integer.parseInt(System.console().readLine());
        
        switch (opciones) {
          case 1:
          mayor = ((int)(Math.random()*100) + numero);
          System.out.println("El numero que estas pensando es el? "+mayor);
          intentos--;    
          break;
          
          case 2:
          menor = (int)(Math.random()*100);
          System.out.println("El numero que estas pensando es el? "+menor);
          intentos--;
          break;
          
          case 3:
          System.out.println("Enhorabuena, has acertado"); 
          intentos = 0;
          break;
        }//switch
      }//while
    }
  }

