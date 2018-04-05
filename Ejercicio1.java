package tema10;

/**
 * 
 * @author German98
 */
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("Jesus");
        a.add("David");
        a.add("Carmen");
        a.add("German");
        a.add("Luis");
        a.add("Gonzalo");
        
        for (String listado: a) {
            System.out.println(listado);
        }
        
    }
    
}
