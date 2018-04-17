package Ejercicio3;

/**
 *
 * @author German98
 */
public class TarjetaRegalo {

    private int numero;
    private double dinero;

    TarjetaRegalo(double dinero) {
        this.dinero = dinero;
        this.numero = (int) (Math.random() * 100000);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void gasta(double p) {
        this.dinero -= p;

        }
    
    public TarjetaRegalo (TarjetaRegalo a) {
     this.dinero = this.dinero + a.dinero;
    }
    
   TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
        this.dinero = this.dinero + t2.dinero;
        return t2;
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + this.numero + " - Saldo " + this.dinero;
    }

    

   

    


   

}//class

