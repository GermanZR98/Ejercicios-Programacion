package POO4;
public class Fraccion {

  int numerador;
  int denominador;

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  @Override
  public String toString() {
    return numerador + "/" + denominador;
  }

  public static Fraccion invierte(Fraccion fraccion) {
    return new Fraccion(fraccion.getDenominador(), fraccion.getNumerador());
  }


  public static Fraccion multiplica(Fraccion fraccion1, Fraccion fraccion2) {
    return new Fraccion((fraccion1.getNumerador() * fraccion2.getNumerador()), fraccion1.getDenominador() * fraccion2.getDenominador());
  }

  public static Fraccion divide(Fraccion fraccion1, Fraccion fraccion2) {
    return new Fraccion((fraccion1.getNumerador() * fraccion2.getDenominador()), fraccion1.getDenominador() * fraccion2.getNumerador());
  }

  public static void simplifica(Fraccion fraccion) {
    int n = fraccion.getNumerador();
    int d = fraccion.getDenominador();
    int mayor = 0;
    boolean mcd = false;

    if (n > d) {
      mayor = n;
    } else if (d > n) {
      mayor = d;
    } else {
      fraccion.setNumerador(1);
      fraccion.setDenominador(1);
    }

    if (mayor != 0) {
      for (int i = Math.abs(mayor); i > 0 && !mcd; i--) {
        if (n % i == 0 && d % i == 0) {
          //M.C.D.
          fraccion.setNumerador(n / i);
          fraccion.setDenominador(d / i);
          mcd = true;
        }
      }

    }
  }
}
