package POO4;
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej4 / T9
 *
 */

public class POOJAVA4 {

  public static void main(String[] args) {

    Fraccion f1 = new Fraccion(21, 24);
    Fraccion f2 = new Fraccion(1, 3);

    System.out.println("1º- Fraccion 1: " + f1);
    System.out.println("2º- Fraccion 2: " + f2);

    Fraccion f3 = Fraccion.multiplica(f1, f2);
    System.out.println("3º- Multiplicacion 1º y 2º: " + f3);

    Fraccion f4 = Fraccion.divide(f3, f2);
    System.out.println("4º- Division 3º y 2º: " + f4);

    Fraccion.simplifica(f1);
    System.out.println("5º- Fraccion 1 simplificada: " + f1);

    Fraccion f5 = Fraccion.invierte(f2);
    System.out.println("6º- Fraccion 2 invertida: " + f5);
  }
}
