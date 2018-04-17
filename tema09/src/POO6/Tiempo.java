package POO6;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Tiempo {

  private int hora;
  private int minuto;
  private int segundo;

  public Tiempo(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  @Override
  public String toString() {
    return hora + "h " + minuto + "m " + segundo + "s";
  }

  public static Tiempo suma(Tiempo t1, Tiempo t2) {
    int s;
    int m = 0;
    int h = 0;
    s = t1.getSegundo() + t2.getSegundo();
    if (s >= 60) {
      m++;
      s -= 60;
    }
    m += t1.getMinuto() + t2.getMinuto();
    if (m >= 60) {
      h++;
      m -= 60;
    }
    h += t1.getHora() + t2.getHora();
    return new Tiempo(h, m, s);
  }

  public static Tiempo resta(Tiempo t1, Tiempo t2) {
    int s;
    int m = 0;
    int h = 0;
    s = t1.getSegundo() - t2.getSegundo();
    if (s <= -60) {
      m--;
      s += 60;
    }
    m += t1.getMinuto() - t2.getMinuto();
    if (m <= -60) {
      h--;
      m += 60;
    }
    h += t1.getHora() - t2.getHora();
    if (h != 0) {
      m = Math.abs(m);
      s = Math.abs(s);
    } else if (m != 0) {
      s = Math.abs(s);
    }
    return new Tiempo(h, m, s);
  }
}
