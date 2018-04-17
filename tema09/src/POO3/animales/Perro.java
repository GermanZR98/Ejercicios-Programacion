/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3.animales;

/**
 *
 * @author Equipo
 */
public class Perro extends Mamifero {

  public Perro(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }

  @Override
  public void comunica() {
    System.out.println("WOOF WOOF!");
  }
  
}
