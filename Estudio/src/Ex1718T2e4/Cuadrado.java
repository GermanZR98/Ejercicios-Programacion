package Ex1718T2e4;

/**
 *
 * @author German98
 */
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado, String caracter, boolean estaRellena) {
        super(caracter, estaRellena);
        this.lado = lado;
    }
    

    @Override
    public String toString() {
        
        int i, espacios;
        String resultado = "";
        
        if (!this.isEstaRellena()) {
        for (i = 0; i < this.lado; i++) {
            resultado += this.getCaracter();
        }
        resultado += "\n";

        for (i = 1; i < this.lado - 1; i++) {
            resultado += this.getCaracter();
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += "  ";
            }
            resultado += this.getCaracter();
        }

        for (i = 0; i < this.lado; i++) {
            resultado += this.getCaracter();
        }
        resultado += this.getCaracter() + "\n";
        }
        return resultado;
    }
        

}
