package Ejercicio4;

/**
 *
 * @author German98
 */
public class Cuadrado extends Figura {
  int lado;
    
  public Cuadrado(int l) {
    this.lado = l;
  }
  
  void setLado(int l) {
    this.lado = l;
  }
  
  public String toString() {
    
    int i, espacios;
    String resultado = "";

    for (i = 0; i < this.lado; i++) {
      resultado += "â–ˆâ–ˆ";
    }
    resultado += "\n";

    for (i = 1; i < this.lado - 1; i++) {
      resultado += "â–ˆâ–ˆ";
      for (espacios = 1; espacios < this.lado - 1; espacios++) {
        resultado += "  ";
      }
      resultado += "â–ˆâ–ˆ\n";
    }
        
    for (i = 0; i < this.lado; i++) {
      resultado += "â–ˆâ–ˆ";
    }
    resultado += "\n";
    
    return resultado;
  }
}
