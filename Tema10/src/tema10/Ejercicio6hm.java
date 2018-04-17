package tema10;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author German98
 */
public class Ejercicio6hm {

    public static void main(String[] args) {

        HashMap<String, String> m = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        m.put("Jesus", "1234");
        m.put("German", "alcachofa");
        m.put("Gonzalo", "tomate");
        m.put("Raul", "lechuga");

        System.out.print("Usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = entrada.nextLine();
        
        if ((m.containsKey(usuario)) && (m.containsKey(contrasena))) {
            System.out.println("Ha accedido al área restringida");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
