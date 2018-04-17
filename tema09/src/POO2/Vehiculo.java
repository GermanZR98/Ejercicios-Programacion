package POO2;
/**
 *
 * @author Equipo
 */
public abstract class Vehiculo {

  private static int vehiculosCreados;
  private static double kilometrosTotales;

  private double kilometrosRecorridos;

  public Vehiculo(double kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  public Vehiculo(){
    
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static double getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(double kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public double getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(double kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

}
