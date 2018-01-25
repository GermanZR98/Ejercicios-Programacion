package ejercicios014;

import java.util.Scanner;

import matematicas.funcionesmatematicas;

/**
 *
 * @author German
 */
public class Ejercicios {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //VOLTEAR UN NUMERO
    System.out.print("Dime un número y lo volteare: ");
    int n = s.nextInt();
    System.out.println("Su número volteado es: " + funcionesmatematicas.voltea(n));

    //PRIMO
    System.out.print("Dime un número y te dire si es primo: ");
    int n1 = s.nextInt();
    if (funcionesmatematicas.primo(n1) == true) {
      System.out.println("Su número es primo");
    } else {
      System.out.println("El número no es primo");
    }

    //CAPICUA
    System.out.print("Dime un número y te dire si es capicua: ");
    int n2 = s.nextInt();
    if (funcionesmatematicas.capicua(n2) == true) {
      System.out.println("Su número es capicua");
    } else {
      System.out.println("El número no es capicua");
    }

    //SIGUIENTE PRIMO 
    System.out.print("Dime un número y te dire su siguiente primo: ");
    int n3 = s.nextInt();
    System.out.println("El siguiente numero primo es: " + funcionesmatematicas.siguientePrimo(n3));

    //POTENCIA
    System.out.print("Dame una base:");
    int base = s.nextInt();
    System.out.print("Dame un exponente:");
    int exponente = s.nextInt();
    System.out.println("Su potencia será: "+funcionesmatematicas.potencia(base, exponente));
    
    //CUENTA DIGITOS 
    System.out.println("Numero y te dire cuantos digitos tiene: ");
    int n4 = s.nextInt();
    System.out.println("El número de digitos que tiene es: "+funcionesmatematicas.digitos(n4));
    
    //DIGITO QUE ESTA EN LA POSICION QUE SE LE MARCA
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int copia = numero;
    System.out.print("Introduce la posición del dígito: ");
    int posicion = s.nextInt();
    System.out.println("Su dígito es: " + funcionesmatematicas.digitoN(numero, posicion));
    
    //QUITAR UN NUMERO DE DIGITOS POR DETRAS
    System.out.print("Introduce un número: ");
    int n5 = s.nextInt();
    System.out.println("Introduce el numero de digitos que le quieres quitar: ");
    int porDetras = s.nextInt();
    System.out.println("El numero quedaria asi: "+funcionesmatematicas.quitaPorDetras(n5, porDetras));
    
    //QUITAR UN NUMERO DE DIGITOS POR DELANTE ///NO SALE TAMPOCO
    System.out.print("Introduce un número: ");
    int n6 = s.nextInt();
    System.out.println("Introduce el numero de digitos que le quieres quitar: ");
    int porDelante = s.nextInt();
    System.out.println("El numero quedaria asi: "+funcionesmatematicas.quitaPorDetras(n6, porDelante));
    
  } //class
}
