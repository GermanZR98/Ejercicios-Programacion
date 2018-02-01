package matematicas;

import java.util.Scanner;

import matematicas.FuncionesEjercicios1a14;

/**
 *
 * @author German
 */
public class Ejercicios1a14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //VOLTEAR UN NUMERO
    System.out.print("Dime un número y lo volteare: ");
    int n = s.nextInt();
    System.out.println("Su número volteado es: " + FuncionesEjercicios1a14.voltea(n));

    //PRIMO
    System.out.print("Dime un número y te dire si es primo: ");
    int n1 = s.nextInt();
    if (FuncionesEjercicios1a14.primo(n1) == true) {
      System.out.println("Su número es primo");
    } else {
      System.out.println("El número no es primo");
    }

    //CAPICUA
    System.out.print("Dime un número y te dire si es capicua: ");
    int n2 = s.nextInt();
    if (FuncionesEjercicios1a14.capicua(n2) == true) {
      System.out.println("Su número es capicua");
    } else {
      System.out.println("El número no es capicua");
    }

    //SIGUIENTE PRIMO 
    System.out.print("Dime un número y te dire su siguiente primo: ");
    int n3 = s.nextInt();
    System.out.println("El siguiente numero primo es: " + FuncionesEjercicios1a14.siguientePrimo(n3));

    //POTENCIA
    System.out.print("Dame una base:");
    int base = s.nextInt();
    System.out.print("Dame un exponente:");
    int exponente = s.nextInt();
    System.out.println("Su potencia será: "+FuncionesEjercicios1a14.potencia(base, exponente));
    
    //CUENTA DIGITOS 
    System.out.println("Numero y te dire cuantos digitos tiene: ");
    int n4 = s.nextInt();
    System.out.println("El número de digitos que tiene es: "+FuncionesEjercicios1a14.digitos(n4));
    
    //DIGITO QUE ESTA EN LA POSICION QUE SE LE MARCA
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int copia = numero;
    System.out.print("Introduce la posición del dígito: ");
    int posicion = s.nextInt();
    System.out.println("Su dígito es: " + FuncionesEjercicios1a14.digitoN(numero, posicion));
    
    //QUITAR UN NUMERO DE DIGITOS POR DETRAS
    System.out.print("Introduce un número: ");
    int n5 = s.nextInt();
    System.out.println("Introduce el numero de digitos que le quieres quitar: ");
    int porDetras = s.nextInt();
    System.out.println("El numero quedaria asi: "+FuncionesEjercicios1a14.quitaPorDetras(n5, porDetras));
    
    //QUITAR UN NUMERO DE DIGITOS POR DELANTE 
    System.out.print("Introduce un número: ");
    int n6 = s.nextInt();
    System.out.println("Introduce el numero de digitos que le quieres quitar: ");
    int porDelante = s.nextInt();
    System.out.println("El numero quedaria asi: "+FuncionesEjercicios1a14.quitaPorDetras(n6, porDelante));
    
    //PEGA UN NÚMERO POR DETRÁS 
    System.out.print("Introduce un número: ");
    int n7 = s.nextInt();
    System.out.print("Dime el dígito que quieres pegar: ");
    int digitoDetras = s.nextInt();
    System.out.println("El numero quedaria asi: "+FuncionesEjercicios1a14.pegaPorDetras(n7, digitoDetras));
    
    //PEGA UN NÚMERO POR DELANTE
    System.out.print("Introduce un número: ");
    int n8 = s.nextInt();
    System.out.print("Dime el dígito que quieres pegar: ");
    int digitoDelante = s.nextInt();
    System.out.println("El numero quedaria asi: "+FuncionesEjercicios1a14.pegaPorDetras(n8, digitoDelante));
  } //class
}
