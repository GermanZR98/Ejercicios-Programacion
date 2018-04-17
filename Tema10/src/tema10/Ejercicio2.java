package tema10;

/**
 *
 * @author German98
 */
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        int suma = 0;
        int cont = 0;
        int media = 0;
        int max = 0;
        int min = 9999;

        for (int i = 0; i < (int) (Math.random() * 11) + 10; i++) {
            int n = (int) (Math.random() * 101);
            a.add(n);
            suma += n;
            cont++;
            if (n < min) {
                min = n;
            }
            
            if (n > max) {
                max = n;
            }
        }

        media = suma / cont;

        System.out.println(a);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Minimo: " + min);
        System.out.println("Maximo:" + max);

    }

}
