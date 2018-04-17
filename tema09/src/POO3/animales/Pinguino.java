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
public class Pinguino extends Ave {

  public Pinguino(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }
  
  @Override
  public void vuela(){
    System.out.println("Lo siento, soy un pingüino y no vuelo.");
  }
  
  public void nada(){
    System.out.println("Nadando a 20km/h");
  }

}
