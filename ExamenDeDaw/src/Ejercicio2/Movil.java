package Ejercicio2;

/**
 *
 * @author German98
 */
public class Movil extends Terminal {
   private String numero;
  private String tarifa;
  private double tarificado;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
  }
  
  
  @Override
  public void llama(Terminal x, int conversacion) {
    super.llama(x, conversacion); 
    int minutos = this.getConversacion()/60;
    if(this.tarifa.equals("rata")){
      tarificado = (minutos * 0.06);
    } else if (this.tarifa.equals("mono")){
      tarificado = minutos * 0.12;
    } else if(this.tarifa.equals("bisonte")) {
      tarificado = minutos * 0.30;
    }
    
    
    
  }

  @Override
  public String toString() {
    return "Nº " + this.numero + " - " + this.getConversacion() + "s de conversación." + " - " +  this.tarificado + " euros tarificados";
  }
   
}
