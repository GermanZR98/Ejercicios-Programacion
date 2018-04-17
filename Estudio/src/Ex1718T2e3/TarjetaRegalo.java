package Ex1718T2e3;

/**
 *
 * @author German98
 */
class TarjetaRegalo {
    private double saldo;
    private int codigo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.codigo = (int)(Math.random()*100000);
    }

    public double getSaldo() {
        return saldo;
    }
    
    void gasta(double gasto) {
        if (gasto > this.saldo) {
            System.out.println("No tiene suficiente saldo para gastar " + gasto);
        } else {
        this.saldo -= gasto;
        }
    }
    
    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
       return new TarjetaRegalo((this.saldo + t.getSaldo()));
    }
    
    @Override
    public String toString() {
        return "Tarjeta nº" + this.codigo + " - Saldo " + this.saldo + "€";
    }

    
}


