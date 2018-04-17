package Ex1718T2e4;

/**
 *
 * @author German98
 */
public class Rectangulo extends Figura {
    private int altura;
    private int anchura;

    public Rectangulo(int altura, int anchura, String caracter, boolean estaRellena) {
        super(caracter, estaRellena);
        this.altura = altura;
        this.anchura = anchura;
    }
    
    
}
