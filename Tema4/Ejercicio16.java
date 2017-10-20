/**
* Ejercicio16 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Test para saber como esta la relación con tu pareja");
    System.out.println("Responde Verdadero (V) o Falso (F)");
    
    int puntuacion = 0;
    String respuesta;
    
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
      
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
      
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("V)");
    System.out.println("F)");
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
      
      
    System.out.println(" Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
      
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    
    System.out.println("Has notado que últimamente se perfuma más");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    
    System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("V)");
    System.out.println("F)");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("V")) {
      puntuacion = puntuacion + 3;
      }
    
    if ((puntuacion >= 0) && (puntuacion <= 10)) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
      }
      
    if ((puntuacion >= 11) && (puntuacion <= 22)) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      }
      
    if ((puntuacion >= 22) && (puntuacion <= 30)) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
      
    }
}
