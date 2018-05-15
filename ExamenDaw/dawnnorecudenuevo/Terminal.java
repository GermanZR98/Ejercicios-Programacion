package dawnnorecudenuevo;

/**
 *
 * @author German98
 */
class Terminal {
    String numero;
    int conversacion;

    Terminal(String numero) {
        this.numero=numero;
        this.conversacion=0;
    }

    void llama(Terminal terminal, int conversacion) {
        this.conversacion+=conversacion;
        terminal.conversacion+=conversacion;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + conversacion + "s de conversación ";
    }
    
    
    
}
