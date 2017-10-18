/**
* Ejercicio10 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("A continuación te pediré el día y mes de tu nacimiento");
    System.out.println("para saber cual es tu horóscopo");
    System.out.println("Dime el dia en el que naciste (Número)");
    
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime el mes en el que naciste (Número)");
    
    int mes = Integer.parseInt(System.console().readLine());
    
    if ((dia >= 1) && (dia <= 30) && (mes == 1)) {
      System.out.println("Eres Aries");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 2)) {
      System.out.println("Eres Tauro");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 3)) {
      System.out.println("Eres Geminis");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 4)) {
      System.out.println("Eres Cancer");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 5)) {
      System.out.println("Eres Leo");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 6)) {
      System.out.println("Eres Virgo");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 7)) {
      System.out.println("Eres Libra");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 8)) {
      System.out.println("Eres Escorpio");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 9)) {
      System.out.println("Eres Sagitario");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 10)) {
      System.out.println("Eres Capricornio");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 11)) {
      System.out.println("Eres Acuario");
      }
      
    if ((dia >= 1) && (dia <= 30) && (mes == 12)) {
      System.out.println("Eres Piscis");
      } else {
      System.out.println("Ese número no existe monstro");
      }
      
    }
  }

    
    
