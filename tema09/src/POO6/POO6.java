package POO6;
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej6 / T9
 *
 */
public class POO6 {

  public static void main(String[] args) {
    Tiempo t = new Tiempo(1, 20, 30);
    System.out.println(t);

    Tiempo t1 = new Tiempo(0, 30, 40);
    Tiempo t2 = new Tiempo(0, 31, 20);

    System.out.println(Tiempo.suma(t1, t2));
    System.out.println(Tiempo.resta(t1, t2));
  }
}
