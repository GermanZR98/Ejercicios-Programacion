package Ejercicio5;

/**
 *
 * @author German98
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Disco> a = new ArrayList<>();

        int opcion;
        String nuevoCodigo;
        String nuevoTitulo;
        String nuevoAutor;
        String codigoBorrar;

        a.add(new Disco("154l", "Margaritas", "Rosa Dominguez"));
        a.add(new Disco("167m", "Amapolas", "Jesus Lopez"));

        do {
            System.out.println("DISCOS");
            System.out.println("1. Lista");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            
            System.out.println(a.contains(new Disco ("1542")));
            switch (opcion) {
                case 1:
                    System.out.println(a);
                    break;

                case 2:
                    System.out.println("codigo:");
                    nuevoCodigo = entrada.nextLine();
                    System.out.println("título:");
                    nuevoTitulo = entrada.nextLine();
                    System.out.println("autor:");
                    nuevoAutor = entrada.nextLine();
                    a.add(new Disco(nuevoCodigo, nuevoTitulo, nuevoAutor));
                    break;
                case 4: 
                    System.out.println("Código del libro que quieres borrar: ");
                    codigoBorrar = entrada.nextLine();
                    a.remove(new Disco(codigoBorrar));
                    break;
            }
        } while (opcion != 5);
    }//do
}//main
