package POO2;
/**
 *
 * @author Equipo
 */
public class Bicicleta extends Vehiculo {

  double energia = 100;
  double habilidad = 50;

  public Bicicleta(double kilometrosRecorridos) {
    super(kilometrosRecorridos);
    setKilometrosTotales(getKilometrosTotales() + kilometrosRecorridos);
  }

  public void pedalea() {
    if (energia <= 0) {
      System.out.println("Estás agotado!");
    } else {
      System.out.println("Ufff! Ufff!");
      energia -= (int) (Math.random() * 5 + 1);
      System.out.println("Energía actual: " + energia);
    }
  }

  public void caballito() {
    if (habilidad <= 0) {
      System.out.println("Estás agotado para hacer este truco!");
    } else {
      int duracion = (int) (Math.random() * (habilidad / 5) + 2);
      habilidad += duracion;
      System.out.println("Has hecho un caballito de " + duracion + " segundos.");
      System.out.println("Tu habilidad de caballito ha aumentad en " + duracion + " puntos."
        + "\nHabilidad actual: " + habilidad);
    }
  }

}
