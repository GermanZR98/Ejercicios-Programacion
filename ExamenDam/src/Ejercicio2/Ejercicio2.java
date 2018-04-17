package Ejercicio2;

public class Ejercicio2 {
  
  // Declaración de los atributos.
  
  private int ladoUno;
  private int ladoDos;
  
  public Ejercicio2(int ladoUno, int ladoDos) {
    this.ladoUno = ladoUno;
    this.ladoDos = ladoDos;
  }

  public int getLadoUno() {
    return ladoUno;
  }

  public int getLadoDos() {
    return ladoDos;
  }

  public void setLadoUno(int ladoUno) {
    this.ladoUno = ladoUno;
  }

  public void setLadoDos(int ladoDos) {
    this.ladoDos = ladoDos;
  }
  
  public Ejercicio2 voltea() {
    
    Ejercicio2 a = new Ejercicio2(0,0);
    int auxiliar;
    auxiliar = this.ladoUno;
    a.ladoUno = this.ladoDos;
    a.ladoDos = auxiliar;
    return a;
  }
  
  public boolean encaja(Ejercicio2 a) {
    
    boolean encaja = false;
    
    if ((this.ladoUno == a.ladoUno) || (this.ladoUno == a.ladoDos)) {
      encaja = true;
    }
    
    if ((this.ladoDos == a.ladoUno) || (this.ladoDos == a.ladoDos)) {
      encaja = true;
    }
    return encaja;
  }

  @Override
  public String toString() {
    String caracteres = "";
    caracteres += "[";
    if (this.ladoUno > 0) {
      caracteres += this.ladoUno;
    } else {
      caracteres += " ";
    }
    caracteres += "|";
    if (this.ladoDos > 0) {
      caracteres += this.ladoDos;
    } else {
      caracteres += " ";
    }
    caracteres += "]";
    return caracteres;
  }
}