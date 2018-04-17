package ejercicio1;

/**
 * Ejercicio1 examen de daw
 * @author German98
 */
public class Terminal {
    private String numero;
    private int conversacion;

    public Terminal(String numero) {
        this.numero = numero;
        this.conversacion=0;
    }
    
    public void llama (Terminal n, int s) {
    this.conversacion+=s;
    n.conversacion+=s;
    }

    @Override
    public String toString() {
        return "Nº " + this.numero + "- " + this.conversacion + "s de conversacion";
    }
    
 
    
}
