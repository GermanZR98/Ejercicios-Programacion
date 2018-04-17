package tema10;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author German98
 */
public class hashMapEjemplo {
    public static void main(String[] args) {
       
    HashMap<Integer, String> m = new HashMap<>();
    Scanner entrada = new Scanner( System.in );

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");      
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Introduce el código");
    int codigo = entrada.nextInt();
    
        if (m.containsKey(codigo)) {
            System.out.println("Para el codigo "+codigo+" el valor es: "+m.get(codigo));
        }else{
            System.out.println("Ese código no existe");
        }
      
      
    }
  }
