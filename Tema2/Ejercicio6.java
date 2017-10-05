/**
 * Ejercicio 6 Tema 2
 *
 * @author Germán Zambrana Ruiz
 */

public class Ejercicio6 { 
  public static void main(String[] args) {
    double preciobase = 32.14;
    double iva = 0.21 * preciobase;
    double total = iva + preciobase;
    
    System.out.println("Precio base del producto: " + preciobase);
    System.out.println("Iva añadido al producto: " + iva);
    System.out.println("------------------------------");
    System.out.println("Precio total a pagar: " + total);

  }
}

