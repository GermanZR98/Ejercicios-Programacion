package ejercicio02;

/**
 *
 * @author David León
 */
public class Movil extends Terminal {

    private String tarifa;
    private String numero;
    private float tarificado;

    public Movil(String n, String t) {
        super(n);
        this.tarifa = t;
    }

    @Override
    public void llama(Terminal b, int s) {
        int conversacion = this.getConversacion() + s;
        this.setConversacion(conversacion);

        int conversacionB = b.getConversacion() + s;
        b.setConversacion(conversacionB);

        String tarifa = this.tarifa;

        if (tarifa.equals("rata")) {
            this.tarificado = (conversacion / 60) * 6;
        } else if (tarifa.equals("mono")) {
            this.tarificado = (conversacion / 60) * 12;
        } else if (tarifa.equals("bisonte")) {
            this.tarificado = (conversacion / 60) * 30;
        }
        

    }

    @Override
    public String toString() {
        int conversacion = this.getConversacion();
        String s = "Nº:  " + this.numero + " - " + conversacion + "s de conversación " + " - tarificados " + this.tarificado + " euros." ;
        return s;
    }

}
