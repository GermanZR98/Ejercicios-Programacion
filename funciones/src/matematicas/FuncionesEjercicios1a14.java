package matematicas;

/**
 *
 * @author German
 */
public class FuncionesEjercicios1a14 {

  //VOLTEA da la vuelta al numero
  public static int voltea(int x) {
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
  //Funcion

  public static long voltea(long x) {
    return voltea((int) x);
  }

  //CAPICUA
  public static boolean capicua(int x) {
    int copia = x;
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    if (volteado == copia) {
      return true;
    } else {
      return false;
    }
  }

  //PRIMO 
  public static boolean primo(int x) {
    for (int i = 2; i < x; ++i) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }

  //SIGUIENTE PRIMO 
  public static int siguientePrimo(int x) {
    boolean esPrimo = false;
    while (esPrimo == false) {
      int j = 2;
      while ((x % j) != 0) {
        j++;
      }
      if (j == x) {

        esPrimo = true;
      }
      x++;
    }
    return (x - 1);
  }

  //POTENCIA DE UN NUMERO 
  public static int potencia(int x, int y) {
    int potencia;
    if (y == 0) {
      potencia = 1;
    } else {
      potencia = x;
      for (int i = 0; i < y - 1; i++) {
        potencia *= x;
      }
    }
    return potencia;
  }

  //CUENTA DIGITOS
  public static int digitos(int x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      contador++;
    }
    return contador;
  }

  //DIGITO QUE ESTA EN LA POSICION QUE SE LE MARCA 
  public static int digitoN(int n, int x) {

    int aux = voltea(n);

    if (x == 1) {
      return aux % 10;
    } else {
      for (int i = 0; i < x; i++) {
        aux = aux / 10;
      }
      return aux % 10;
    }
  }

  //LE QUITA A UN NUMERO LOS DIGITOS QUE LE INDIQUES POR DETRAS
  public static int quitaPorDetras(int x, int y) {
    for (int i = 0; i < y; i++) {
      x /= 10;
    }
    return x;
  }

  //LE QUITA A UN NUMERO LOS DIGITOS QUE LE INDIQUES POR DELANTE
  public static int quitarPorDelante(int n, int x) {

    n = voltea(n);
    int contador = 0;

    while (contador < x) {
      n = n / 10;
      contador++;
    }

    n = voltea(n);
    return n;
  }
  
  //PEGA UN NÚMERO POR DETRÁS 
   public static int pegaPorDetras(int n, int x) {

     n = n*10;
     n = n + x;

     return n;
   }


  //PEGA NÚMERO POR DELANTE
   public static int pegaPorDelante(int n, int x) {

     n = voltea(n);

     n = n*10;
     n = n + x;

     return n = voltea(n);
   }

}//class
