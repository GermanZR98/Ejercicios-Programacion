package POO2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Coche extends Vehiculo {
  
  double neumaticos = 100;
  double gasolina = 50;
  
  public Coche(double kilometrosRecorridos) {
    super(kilometrosRecorridos);
    setKilometrosTotales(getKilometrosTotales() + kilometrosRecorridos);
  }
  
  public void acelera() {
    if (gasolina <= 0) {
      System.out.println("No te queda más gasolina!");
    } else {
      System.out.println("Brrrrmmm");
      gasolina -= Math.random() * 5 + 1;
      System.out.println("Gasolina actual: " + gasolina + "L.");
      setKilometrosTotales(getKilometrosTotales() + gasolina);
    }
    

  }
  
  public void quemaRueda() {
    if (neumaticos <= 0) {
      System.out.println("No te quedan neumáticos!");
    } else {
      neumaticos -= (Math.random() * 10 + 2);
      System.out.println("Estado de neumáticos: " + neumaticos + "%.");
      setKilometrosTotales(getKilometrosTotales() + neumaticos);
    }
  }
  
}
