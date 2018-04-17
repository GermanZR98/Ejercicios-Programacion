package ejercicio1;

/**
 *
 * @author David León
 */
public class ExamenPOO {

    public static void main(String[] args) {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");

        System.out.println(t1); //segundos 0
        System.out.println(t2); //segundos 0
        t1.llama(t2, 320); //t1 y t2 100 segundos
        t3.llama(t1, 200); //t1 300 segundos t3 200 segundos
        System.out.println(t1); 
        System.out.println(t2); 
        System.out.println(t3); 
        System.out.println(t4); //segundos 0        
    }
}

