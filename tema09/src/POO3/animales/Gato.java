package POO3.animales;

/**
 *
 * @author Equipo
 */
public class Gato extends Mamifero{

  public Gato(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }
  
  @Override
  public void comunica() {
    System.out.println("Miau Miau!");
  }
}
