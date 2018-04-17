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
public abstract class Mamifero extends Animal {

  public Mamifero(String nombre, String sexo, String raza) {
    super(nombre, sexo, raza);
  }
  
  public void comunica(){
    System.out.println("Hola!");
  }
  
  public void amamanta(){
    System.out.println("Proceso de amamantado iniciado.");
  }
 
  
}
