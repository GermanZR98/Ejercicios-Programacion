/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

/*
 * Ejercicio 4 del examen
 * 
 * @author German Zambrana Ruiz
 * 12/12/2017
 * 1º Turno 
 */
import java.util.Scanner;

public class Ex31gzr4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el día de la semana(Introduce los dias de la semana sin tilde y en minuscula Ejemplo: miercoles): ");
    
    String Semana = s.nextLine();
    int entrenamiento = (int) (Math.random() * 3);
    String entrenamientoFinal = "";
    int muscGrande = (int) (Math.random() * 3);
    String muscGrandeFinal = "";
    int muscPeq = (int) (Math.random() * 3);
    String muscPeqFinal = "";
    int finaliza = 0;
    String finalizaFinal = "";

    while (finaliza == entrenamiento) {
      finaliza = (int) (Math.random() * 4);
    }

    switch (finaliza) {
      case 0:
        finalizaFinal = "bicicleta";
        break;
      case 1:
        finalizaFinal = "elíptica";
        break;
      case 2:
        finalizaFinal = "cinta";
        break;
      case 3:
        finalizaFinal = "abdominales";
        break;
    }

    switch (entrenamiento) {
      case 0:
        entrenamientoFinal = "bicicleta";
        break;
      case 1:
        entrenamientoFinal = "elíptica";
        break;
      case 2:
        entrenamientoFinal = "cinta";
        break;
    }

    switch (muscGrande) {
      case 0:
        muscGrandeFinal = "espalda";
        break;
      case 1:
        muscGrandeFinal = "pecho";
        break;
      case 2:
        muscGrandeFinal = "piernas";
        break;
    }

    switch (muscPeq) {
      case 0:
        muscPeqFinal = "Bíceps";
        break;
      case 1:
        muscPeqFinal = "Tríceps";
        break;
      case 2:
        muscPeqFinal = "Hombros";
        break;
    }

    if (Semana.equals("miercoles")) {
      System.out.print("Hoy es día de descanso");
    }
    if (Semana.equals("domingo")) {
      System.out.print("Hoy es día de descanso");
    }
    if (Semana.equals("lunes")) {
      System.out.print("Su entrenamiento de hoy es el siguiente: " + entrenamientoFinal + ", " + muscGrandeFinal + ", " + muscPeqFinal + ", " + finalizaFinal);
    }
    if (Semana.equals("martes")) {
      System.out.print("Su entrenamiento de hoy es el siguiente: " + entrenamientoFinal + ", " + muscGrandeFinal + ", " + muscPeqFinal + ", " + finalizaFinal);
    }
    if (Semana.equals("jueves")) {
      System.out.print("Su entrenamiento de hoy es el siguiente: " + entrenamientoFinal + ", " + muscGrandeFinal + ", " + muscPeqFinal + ", " + finalizaFinal);
    }
    if (Semana.equals("viernes")) {
      System.out.print("Su entrenamiento de hoy es el siguiente: " + entrenamientoFinal + ", " + muscGrandeFinal + ", " + muscPeqFinal + ", " + finalizaFinal);
    }
    if (Semana.equals("sabado")) {
      System.out.print("Su entrenamiento de hoy es el siguiente: " + entrenamientoFinal + ", " + muscGrandeFinal + ", " + muscPeqFinal + ", " + finalizaFinal);
    }


} //Class
} //Static
