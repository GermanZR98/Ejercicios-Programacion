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
public abstract class Ave extends Animal {
  
  
  public Ave(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }
  
  public void pia(){
    System.out.println("Pio Pio!");
  }
  
  public void vuela(){
    System.out.println("Voló muy alto por la arbolada.");
  }
  
}
