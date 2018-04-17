package ejercicio02;

/**
 *
 * @author David León
 */
public class Terminal {
    private String numero;
    private int conversacion;
    
    
    public Terminal(String n) {
        this.numero = n;
        this.conversacion = 0;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public int getConversacion() {
        return this.conversacion;
    }
    
    public String setNumero(String n) {
        return this.numero = n;
    }
    
    public int setConversacion(int n) {
        return this.conversacion = n;
    }
    
    //terminalito.llama(goku, 200);
    //goku = pepi
    //terminalito = this.
    //s = 200
    public void llama(Terminal pepi, int s) {
        this.conversacion += s;
        pepi.conversacion += s;
    }
    
    @Override
   public String toString() {
        String s = "Nº:  " + this.numero + " - " + this.conversacion + "s de conversación";
        return s;
    }
    
}
