package Ejercicio2;

public class Terminal {
    
  private String numero;
  private int conversacion;
  
  //ESTE ES EL CONSTRUCTOR

  public Terminal(String numero) {
    this.numero = numero;
    conversacion=0;
  }

  public int getConversacion() {
    return conversacion;
  }

  public void setConversacion(int conversacion) {
    this.conversacion = conversacion;
  }

  
  
  
  
  //HACEMOS EL MÉTODO
  
  public void llama(Terminal x, int conversacion) {
    this.conversacion= this.conversacion + conversacion;
    x.conversacion = x.conversacion + conversacion; 
  }

  @Override
  public String toString() {
    return "Nº " + this.numero + " - " + this.conversacion + "s de conversación.";
  }
  
  
}

