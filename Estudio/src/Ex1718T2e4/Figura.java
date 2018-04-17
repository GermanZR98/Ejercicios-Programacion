package Ex1718T2e4;

/**
 *
 * @author German98
 */
public abstract class Figura {
    private String caracter;
    private boolean estaRellena;

    public Figura(String caracter, boolean estaRellena) {
        this.caracter = caracter;
        this.estaRellena = estaRellena;
    }

    public String getCaracter() {
        return caracter;
    }

    public boolean isEstaRellena() {
        return estaRellena;
    }
    
    
    
    
}
