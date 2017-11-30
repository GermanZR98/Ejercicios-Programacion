package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int[] ArrayNumero = new int[20];
  int[] ArrayCuadrado = new int[20];
  int[] ArrayCubo = new int[20];
  
  int numero = 0;
  
  for (int i = 0; i <= 19; i++) {
  numero = (int)(Math.random()*100);
  
  ArrayNumero[i] = numero; 
  ArrayCuadrado[i] = numero*numero;
  ArrayCubo[i] = numero*numero*numero;
  
  System.out.print("numero: "+ArrayNumero[i] + " ");
  System.out.print("cuadrado: "+ArrayCuadrado[i] + " ");
  System.out.println("cubo: "+ArrayCubo[i] + " ");
  }//for












  }
}