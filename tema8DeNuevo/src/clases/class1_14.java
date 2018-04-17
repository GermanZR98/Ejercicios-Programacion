package clases;

/**
 *
 * @author German98
 */
public class class1_14 {

    public static boolean esCapicua(int n) {
        int y = n;
        int modulo;
        int volteado = 0;

        do {
            modulo = y % 10;
            volteado = volteado * 10 + modulo;
            y /= 10;
        } while (y > 0);
        return n == volteado;
    }

    public static Boolean esPrimo(long n) {
        if (n < 2) {
            return false;
        } else {
            for (long i = n / 2; i >= 2; i--) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static long siguientePrimo(long n) {
        n++;
        while (!esPrimo(n)) {
            n++;
        }
        return n;
    }

    public static double potencia(int base, int exponente) {
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }
        if (exponente == 0) {
            return 1;
        }
        int n = 1;
        for (int i = 0; i < exponente; i++) {
            n = n * base;
        }
        return n;
    }

}//class
