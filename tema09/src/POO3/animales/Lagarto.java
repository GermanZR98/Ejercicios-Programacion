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
public class Lagarto extends Animal {

  public Lagarto(String nombre, String sexo) {
    super(nombre, sexo);
  }

  @Override
  public void desplaza() {
    System.out.println("Reptó durante 5s.");
  }

}
