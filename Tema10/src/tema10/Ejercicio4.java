package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author German98
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        ArrayList<String> a = new ArrayList<String>();

        System.out.println("Introduce 10 palabras por teclado:");

        for (int i = 0; i < 10; i++) {
            String palabra = entrada.next();
            a.add(palabra);
        }
        
        Collections.sort(a);
        System.out.println("Lista ordenada: "+a);
    }
}
