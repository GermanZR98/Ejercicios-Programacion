
package Ejercicio3;

/**
 *
 * @author German98
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String[] a = new String[7];
        a[0] = "casa";
        a[1] = "coche";
        a[2] = "sol";
        a[3] = "mesa";
        a[4] = "ordenador";
        a[5] = "CASA";
        a[6] = "mermelada";

        String[] b = new String[5];
        b[0] = "zambomba";
        b[1] = "coche";
        b[2] = "casa";
        b[3] = "sol";
        b[4] = "mermelada";

        String[] ArrayC = palabrasComunes(a, b);

        for (int i = 0; i < ArrayC.length; i++) {
            System.out.println(ArrayC[i]);
        }

    }//Cierra el main

    public static String[] palabrasComunes(String[] a, String[] b) {
        int contador = 0;

        //Comprobamos las palabras que se repiten
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    contador++;
                }
            }
        }
        String[] c = new String[contador];
        int indice = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    c[indice] = a[i];
                    indice++;
                }
            }

        }
        return c;
    }

}//Cierra el class
