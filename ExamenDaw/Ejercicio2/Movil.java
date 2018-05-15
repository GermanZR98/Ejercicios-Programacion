package Ejercicio2;

/**
 *
 * @author German98
 */
class Movil extends Terminal {

    String Tarifa;
    double Tarificado;

    public Movil(String numero, String Tarifa) {
        super(numero);
        this.Tarifa = Tarifa;
        this.Tarificado = 0;
    }

    void llama(Terminal terminal, double conversacion) {
        super.llama(terminal, conversacion);
        double segundos = conversacion / 60;
        if (Tarifa.equals("rata")) {
            this.Tarificado = (segundos * 0.06);
        }
        if (Tarifa.equals("mono")) {
            this.Tarificado = (segundos * 0.12);
        }
        if (Tarifa.equals("bisonte")) {
            this.Tarificado = (segundos * 0.30);
        }
    }/////////////metodo

    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + this.getConversacion() + "s de conversación - tarificados " + this.Tarificado + " euros";
    }
}
