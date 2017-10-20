/**
* Ejercicio12 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Vamos a realizar un test de 10 preguntas");
    System.out.println("Responde todo minuscula");
    System.out.println("¿Si o no?");
    
    int puntuacion = 0;
    String respuesta = (System.console().readLine());
    
    System.out.println("¿Qué asignatura da Luis?");
    System.out.println("A) Programacion");
    System.out.println("B) Fol");
    System.out.println("C) Empresa");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("a")) {
      puntuacion  ++;
      }
      
    System.out.println("¿Que lenguaje de programación usamos?");
    System.out.println("A) C++");
    System.out.println("B) Java");
    System.out.println("C) Phyton");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("b")) {
      puntuacion  ++;
      }
      
    System.out.println("¿System.out.print se cierra con ;");
    System.out.println("A) A veces");
    System.out.println("B) no");
    System.out.println("C) Siempre");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("c")) {
      puntuacion  ++;
      }
      
      
    System.out.println("¿Cuántas horas tenemos a la semana?");
    System.out.println("A) 30");
    System.out.println("B) 20");
    System.out.println("C) 25");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("A")) {
      puntuacion  ++;
      }
    
    System.out.println("¿Como se llama el profesor de sistemas?");
    System.out.println("A) Juan Carlos");
    System.out.println("B) Jesus");
    System.out.println("C) Luis");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("A")) {
      puntuacion  ++;
      }
    
    System.out.println("¿Como se llama la profesora de fol?");
    System.out.println("A) Juan Carlos");
    System.out.println("B) Isabel");
    System.out.println("C) Maria");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("b")) {
      puntuacion  ++;
      }
    
    System.out.println("¿Qué SO usamos?");
    System.out.println("A) IOS");
    System.out.println("B) Windows");
    System.out.println("C) Linux");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("c")) {
      puntuacion  ++;
      }
      
    System.out.println("¿Eva explica bien?;");
    
    System.out.println("A) No");
    System.out.println("B) Si");
    System.out.println("C) A veces");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("A")) {
      puntuacion  ++;
      }
    
    System.out.println("¿Cada cuanto tiempo hacemos un descanso?");
    
    System.out.println("A) 1h");
    System.out.println("B) 15min");
    System.out.println("C) 3h");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("A")) {
      puntuacion  ++;
      }
    
    System.out.println("¿A que hora terminan las clases?");
    
    System.out.println("A) 2:30");
    System.out.println("B) 4:00");
    System.out.println("C) 2:20");
    
    respuesta = (System.console().readLine());
    
    if (respuesta.equals("c")) {
      puntuacion  ++;
      }
    
    System.out.println("El resultado es: " + puntuacion);
  }
}

