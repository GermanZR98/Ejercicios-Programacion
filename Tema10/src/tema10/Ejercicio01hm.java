package tema10;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author German98
 */
public class Ejercicio01hm {

    public static void main(String[] args) {

        HashMap<String, String> m = new HashMap<>();
        HashMap<String, String> d = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        m.put("ortiga", "urtica dioica");
        m.put("romero", "rosmarinus officinalis");
        m.put("aloe vera", "aloe barbadensis miller");
        m.put("ayahasca", "banisteriopsis caapi");

        d.put("ortiga", "Descripcion1");
        d.put("romero", "Descripcion2");
        d.put("aloe vera", "Descripcion3");
        d.put("ayahasca", "Descripcion4");

        System.out.println("Introduce el nombre común: ");
        String nombreComun = entrada.nextLine();

        if (m.containsKey(nombreComun)) {
            System.out.println("Nombre común: " + nombreComun + " nombre cientifico: " + m.get(nombreComun) + " Descripcion: " + d.get(nombreComun));
        } else {
            System.out.println("Ese nombre no existe");
        }
    }
}
