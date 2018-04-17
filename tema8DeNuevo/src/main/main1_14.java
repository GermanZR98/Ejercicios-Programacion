package main;
import java.util.Scanner;
/**
 * Ejercicios del 1 al 14
 * @author German98
 */
public class main1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int n = s.nextInt();
        
        if (clases.class1_14.esCapicua(n)) {
            System.out.println("Capicúa");
        } else {
            System.out.println("No es capicúa");
        }
        
        if (clases.class1_14.esPrimo(n)) {
            System.out.println("Primo");
        } else {
            System.out.println("No es Primo");
        }
        
        System.out.println("El siguiente primo es: "+clases.class1_14.siguientePrimo(n));
        
        System.out.println("Dime la base y el exponente: ");
        int base=n;
        int exponente=5;
        System.out.println("La potencia es: "+clases.class1_14.potencia(base, exponente));
        
    }//main  
}//class
