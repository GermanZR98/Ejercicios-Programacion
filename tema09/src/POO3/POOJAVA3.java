package POO3;
import POO3.animales.Canario;
import POO3.animales.Gato;
import POO3.animales.Lagarto;
import POO3.animales.Perro;
import POO3.animales.Pinguino;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej3 / T9
 *
 */
public class POOJAVA3 {

  public static void main(String[] args) {
    //Lagarto
    Lagarto lag = new Lagarto("milagarto", "macho");
    System.out.println("Nombre: " + lag.getNombre() + ", Raza: " + lag.getSexo());
    lag.desplaza();

    System.out.println("");
    //Canario
    Canario can = new Canario("Rafael", "macho", "Tropical");
    System.out.println("Nombre: " + can.getNombre() + ", Sexo: " + can.getSexo() + ", Raza: " + can.getRaza());
    can.desplaza();
    can.canta();
    can.vuela();

    System.out.println("");
    //Pinguino
    Pinguino pin = new Pinguino("Pingu", "hembra", "Los casacas negras");
    System.out.println("Nombre: " + pin.getNombre() + ", Sexo: " + pin.getSexo() + ", Raza: " + pin.getRaza());
    pin.desplaza();
    pin.vuela();
    
    System.out.println("");
    //Gato
    Gato g = new Gato("Misifú", "hembra", "persa");
    System.out.println("Nombre: " + g.getNombre() + ", Sexo: " + g.getSexo() + ", Raza: " + g.getRaza());
    g.desplaza();
    g.amamanta();
    g.comunica();
    
    System.out.println("");
    //Perro
    Perro p = new Perro("Dogon", "hembra", "Doge");
    System.out.println("Nombre: " + p.getNombre() + ", Sexo: " + p.getSexo() + ", Raza: " + p.getRaza());
    p.desplaza();
    p.amamanta();
    p.comunica();
    
   
    
  }
}
