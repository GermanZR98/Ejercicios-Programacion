package Ex1718T2e1;

import java.util.Scanner;

public class Ex1718T2e1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la alutra de la piramide: ");
        int longitud = s.nextInt();
        String caracter = "*";

        linea(longitud, caracter);

    }//Cierra el main

    public static void linea(int longitud, String caracter) {
        int altura = 1;
        int i = 0;
        int espaciosPorDelante = longitud - 1;
        int espaciosInternos = 0;

        while (altura < longitud) {

            // inserta espacios delante
            for (i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print(caracter);
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(caracter);
            }

            if (altura > 1) {
                System.out.print(caracter);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////

        // base de la pirámide
        for (i = 1; i < altura * 2; i++) {
            System.out.print(caracter);
        }
    }
}
