
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
public abstract class Animal {

  String nombre;
  String sexo;
  String raza;

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public Animal(String nombre, String sexo, String raza) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.raza = raza;
  }

  public Animal(String nombre, String sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void desplaza(){
    System.out.println("Andó 50m.");
  }
}
