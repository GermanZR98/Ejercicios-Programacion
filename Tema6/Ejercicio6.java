/**
* Ejercicio6 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio6 {
    public static void main(String[] args) {
      
      int numero = (int)(Math.random()*100);
      
      
      System.out.println(numero);
      
      
      int intentos = 5;
      int respuesta = 0;
      System.out.print("Dime un nº a ver si lo aciertas, tienes 5 intentos: ");
      respuesta = Integer.parseInt(System.console().readLine());
      
        
        while (intentos > 1) {
        if (respuesta != numero) {
          System.out.print("Lo siento has fallado, intentalo de nuevo: ");
          respuesta = Integer.parseInt(System.console().readLine());
          intentos--;
        } 
  
        if (respuesta == numero) {
        System.out.println("Enhorabuena, has acertado");  
        intentos = 0;
        }
      } //if principal
      
      
      
      
    }
  }
