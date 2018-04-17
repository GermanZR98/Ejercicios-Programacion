package Ex1718T2e2;

public class Ex1718T2e2 {

    public static void main(String[] args) {
        int[][] a = generaArrayBiInt(4, 6, 10, 99);
        
        muestraArrayIntBi(a);
        System.out.println();
        System.out.println(nEsimo(a, 5));

    }//main

    public static int nEsimo(int[][] n, int posicion) {
        int contador = 0;
        
        for (int fila = 0; fila < n.length; fila++) {
         for (int columna = 0; columna < n[0].length; columna++){
          if (contador==posicion) {
          return n[fila][columna];
          }
          contador++;
         }
        }
        return -1;
    }

    /**
     * Devuelve el número de dígitos que contiene un número entero
     *
     * @param x un número entero
     * @return la cantidad de dígitos que contiene el número
     */
    public static int digitos(int x) {

        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }

    // Funciones ////////////////////////////////////////////////////////
    /**
     * Devuelve el número de filas de un array bidimensional de números enteros.
     *
     * @param x un array bidimensional de números enteros
     * @return número de filas del array
     */
    public static int filasArrayIntBi(int x[][]) {
        return x.length;
    }

    /**
     * Devuelve el número de columnas de un array bidimensional de números
     * enteros.
     *
     * @param x un array bidimensional de números enteros
     * @return número de columnas del array
     */
    public static int columnasArrayIntBi(int x[][]) {
        return x[0].length;
    }

    /**
     * Devuelve el máximo de un array bidimensional de números enteros.
     *
     * @param x un array bidimensional de números enteros
     * @return el valor máximo encontrado en el array
     */
    public static int maximoArrayIntBi(int x[][]) {

        int maximo = Integer.MIN_VALUE;

        for (int f = 0; f < filasArrayIntBi(x); f++) {
            for (int c = 0; c < columnasArrayIntBi(x); c++) {
                if (x[f][c] > maximo) {
                    maximo = x[f][c];
                }
            }
        }

        return maximo;
    }

    /**
     * Muestra por pantalla el contenido de un array bidimensional de números
     * enteros.
     *
     * @param x un array bidimensional de números enteros
     */
    public static void muestraArrayIntBi(int x[][]) {

        String formatoNumero = "%" + digitos(maximoArrayIntBi(x)) + "d";

        for (int f = 0; f < filasArrayIntBi(x); f++) {
            for (int c = 0; c < columnasArrayIntBi(x); c++) {
                System.out.printf(formatoNumero + " ", x[f][c]);
            }
            System.out.println();
        }
    }

    /**
     * Crea un array bidimensional de números enteros y lo rellena con valores
     * aleatorios dentro de un rango.
     * <p>
     * Por ejemplo, <code>generaArrayBiInt(8, 7, 10, 30)</code> devolvería un
     * array de 8 filas por 7 columnas relleno con números generados al azar
     * comprendidos entre 10 y 30.
     *
     * @param filas número de filas que tendrá el array
     * @param columnas número de columnas que tendrá el array
     * @param minimo límite inferior del intervalo de números aleatorios
     * @param máximo límite superior del intervalo de números aleatorios
     * @return array bidimensional de números enteros rellena con valores
     * aleatorios dentro del rango definido por los valores <code>minimo</code>
     * y <code>maximo</code>
     */
    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] x = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                x[i][j] = (int) (Math.random() * (maximo - minimo) + minimo + 1);
            }
        }

        return x;
    }
}
