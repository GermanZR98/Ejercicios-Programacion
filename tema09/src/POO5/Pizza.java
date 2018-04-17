package POO5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Pizza {

  private String nombre;
  private String tamano;
  private String estado;
  private static int totalPedidas;
  private static int totalServidas;

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public Pizza(String nombre, String tamano) {
    this.nombre = nombre;
    this.tamano = tamano;
    this.estado = "pedida";
    totalPedidas++;
  }

  public void sirve() {
    if (!this.estado.equals("servida")) {
      this.estado = "servida";
      totalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }

  }

  @Override
  public String toString() {
    return "pizza " + this.nombre + " " + this.tamano + ", " + this.estado;
  }

}
