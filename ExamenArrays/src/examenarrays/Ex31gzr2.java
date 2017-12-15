/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

/*
 * Ejercicio 2 del examen
 * 
 * @author German Zambrana Ruiz
 * 12/12/2017
 * 1º Turno 
 */
public class Ex31gzr2 {

  public static void main(String[] args) {

    int[] arrayPrincipal = new int[20];
    int numero = 0;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;
    int cont6 = 0;
    int cont7 = 0;
    int cont8 = 0;
    int cont9 = 0;
    int cont10 = 0;

    System.out.println("Array Generado: ");

    for (int i = 0; i < 20; i++) {
      numero = (int) (Math.random() * 10) + 1;
      arrayPrincipal[i] = numero;
      System.out.print(numero + " ");
      if (arrayPrincipal[i] == 1) {
        cont1++;
      }
      if (arrayPrincipal[i] == 2) {
        cont2++;
      }
      if (arrayPrincipal[i] == 3) {
        cont3++;
      }
      if (arrayPrincipal[i] == 4) {
        cont4++;
      }
      if (arrayPrincipal[i] == 5) {
        cont5++;
      }
      if (arrayPrincipal[i] == 6) {
        cont6++;
      }
      if (arrayPrincipal[i] == 7) {
        cont7++;
      }
      if (arrayPrincipal[i] == 8) {
        cont8++;
      }
      if (arrayPrincipal[i] == 9) {
        cont9++;
      }
      if (arrayPrincipal[i] == 10) {
        cont10++;
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("Repeticiones de cada número: ");

    if (cont1 > 1) {
      System.out.println("El 1 aparece " + cont1 + " veces");
    }
    if (cont1 == 1) {
      System.out.println("El 1 aparece 1 vez");
    }
    if (cont1 == 0) {
      System.out.println("El 1 no aparece");
    }
    
    if (cont2 > 1) {
      System.out.println("El 2 aparece " + cont2 + " veces");
    }
    if (cont2 == 1) {
      System.out.println("El 2 aparece 1 vez");
    }
    if (cont2 == 0) {
      System.out.println("El 2 no aparece");
    }
    
    if (cont3 > 1) {
      System.out.println("El 3 aparece " + cont3 + " veces");
    }
    if (cont3 == 1) {
      System.out.println("El 3 aparece 1 vez");
    }
    if (cont3 == 0) {
      System.out.println("El 3 no aparece");
    }
    
    if (cont4 > 1) {
      System.out.println("El 4 aparece " + cont4 + " veces");
    }
    if (cont4 == 1) {
      System.out.println("El 4 aparece 1 vez");
    }
    if (cont4 == 0) {
      System.out.println("El 4 no aparece");
    }
    
    if (cont5 > 1) {
      System.out.println("El 5 aparece " + cont5 + " veces");
    }
    if (cont5 == 1) {
      System.out.println("El 5 aparece 1 vez");
    }
    if (cont5 == 0) {
      System.out.println("El 5 no aparece");
    }
    
    if (cont6 > 1) {
      System.out.println("El 6 aparece " + cont6 + " veces");
    }
    if (cont6 == 1) {
      System.out.println("El 6 aparece 1 vez");
    }
    if (cont6 == 0) {
      System.out.println("El 6 no aparece");
    }
    
    if (cont7 > 1) {
      System.out.println("El 7 aparece " + cont7 + " veces");
    }
    if (cont7 == 1) {
      System.out.println("El 7 aparece 1 vez");
    }
    if (cont7 == 0) {
      System.out.println("El 7 no aparece");
    }
    
    if (cont8 > 1) {
      System.out.println("El 8 aparece " + cont8 + " veces");
    }
    if (cont8 == 1) {
      System.out.println("El 8 aparece 1 vez");
    }
    if (cont8 == 0) {
      System.out.println("El 8 no aparece");
    }
    
    if (cont9 > 1) {
      System.out.println("El 9 aparece " + cont9 + " veces");
    }
    if (cont9 == 1) {
      System.out.println("El 9 aparece 1 vez");
    }
    if (cont9 == 0) {
      System.out.println("El 9 no aparece");
    }
    
    if (cont10 > 1) {
      System.out.println("El 10 aparece " + cont10 + " veces");
    }
    if (cont10 == 1) {
      System.out.println("El 10 aparece 1 vez");
    }
    if (cont10 == 0) {
      System.out.println("El 10 no aparece");
    }
    
    
  } //Class
} //Static
