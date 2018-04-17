package POO1;
/**
 * @author Juan Francisco Bernal Rodríguez
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * Ej1 / T9
 *
 */
public class T9Ej01 {

  public static void main(String[] args) {
    Caballo caballo1 = new Caballo("Caballo 1");
    caballo1.setPeso(50);
    caballo1.setSexo("Hembra");

    Caballo caballo2 = new Caballo("Caballo 2", 60);
    caballo2.setSexo("Hembra");

    Caballo caballo3 = new Caballo("Caballo 3", 80, "Macho");

    System.out.println("Nombre: " + caballo1.getNombre() + "\nPeso: " + caballo1.getPeso()
      + "\nSexo: " + caballo1.getSexo());
    System.out.print(caballo1.getNombre() + " acelera y relincha... ");
    caballo1.acelera();
    caballo1.relincha();
    System.out.println(caballo1.getNombre() + " corre a " + Math.round(caballo1.getVelocidad() * 100d) / 100d + " km/h");

    System.out.println("\nNombre: " + caballo2.getNombre() + "\nPeso: " + caballo2.getPeso()
      + "\nSexo: " + caballo2.getSexo());
    System.out.print(caballo2.getNombre() + " acelera y relincha... ");
    caballo2.acelera();
    caballo2.relincha();
    System.out.println(caballo2.getNombre() + " corre a " + Math.round(caballo2.getVelocidad() * 100d) / 100d + " km/h");

    System.out.println("\nNombre: " + caballo3.getNombre() + "\nPeso: " + caballo3.getPeso()
      + "\nSexo: " + caballo3.getSexo());
    System.out.print(caballo1.getNombre() + " acelera y relincha... ");
    caballo3.acelera();
    caballo3.relincha();
    System.out.println(caballo3.getNombre() + " corre a " + Math.round(caballo3.getVelocidad() * 100d) / 100d + " km/h");

  }
}
