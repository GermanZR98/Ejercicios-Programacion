package tema10;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author German98
 */
public class Ejercicio02hm {

    public static void main(String[] args) {

        HashMap<String, String> m = new HashMap<>();
        HashMap<String, String> d = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        m.put("blue", "azul");
        m.put("black", "negro");
        m.put("red", "rojo");
        m.put("orange", "naranja");

        d.put("blue", "codigo1");
        d.put("black", "codigo2");
        d.put("red", "codigo3");
        d.put("orange", "codigo4");

        System.out.println("Introduce el nombre inglés: ");
        String nombreComun = entrada.nextLine();

        if (m.containsKey(nombreComun)) {
            System.out.println("Nombre inglés: " + nombreComun + " nombre español: " + m.get(nombreComun) + " código: " + d.get(nombreComun));
        } else {
            System.out.println("Ese nombre no existe");
        }
    }
}
