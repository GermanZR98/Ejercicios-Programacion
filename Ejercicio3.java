package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author German98
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.println("Introduce 10 numeros por teclado:");

        for (int i = 0; i < 10; i++) {
            int n = entrada.nextInt();
            a.add(n);
        }
        
        Collections.sort(a);
        System.out.println("Lista ordenada: "+a);
    }
}
