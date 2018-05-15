package Ejercicio2;

/**
 *
 * @author German98
 */
class Terminal {
    String numero;
    double conversacion;

    Terminal(String numero) {
        this.numero=numero;
        this.conversacion=0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getConversacion() {
        return conversacion;
    }

    public void setConversacion(double conversacion) {
        this.conversacion = conversacion;
    }
    
    

    void llama(Terminal terminal, double conversacion) {
        this.conversacion+=conversacion;
        terminal.conversacion+=conversacion;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + conversacion + "s de conversación ";
    }
    
    
    
}
