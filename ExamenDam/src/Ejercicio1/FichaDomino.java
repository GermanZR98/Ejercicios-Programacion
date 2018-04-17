package Ejercicio1;

/**
 *
 * @author German98
 */
public class FichaDomino {

    private int lado1;
    private int lado2;

    public FichaDomino(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public FichaDomino voltea() {
        FichaDomino a = new FichaDomino(0, 0);
        a.lado1 = this.lado2;
        a.lado2 = this.lado1;

        return a;
    }

    public boolean encaja(FichaDomino a) {
        boolean enc = false;
        if ((this.lado1 == a.lado2) || (this.lado1 == a.lado1) || (this.lado2 == a.lado2) || (this.lado2 == a.lado1)) {
            enc = true;
        }
        return enc;
    }

    @Override
    public String toString() {
        String ladoUno = Integer.toString(lado1);
        String ladoDos = Integer.toString(lado2);
        if (lado1 == 0) {
            ladoUno = " ";
        } else if (lado2 == 0) {
            ladoDos = " ";
        }
        return "[" + ladoUno + "]" + "[" + ladoDos + "]";
    }

}
