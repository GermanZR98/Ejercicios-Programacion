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
public class Canario extends Ave{

  public Canario(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }
  
  public void canta(){
    System.out.println("pio pio pio pio pio pio pio pio!");
  }
 
  
}
