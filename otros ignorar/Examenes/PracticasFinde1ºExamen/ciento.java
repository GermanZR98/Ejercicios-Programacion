/**
* Ejercicio2 examen
*
* @author German Zambrana Ruiz
*/
public class ciento {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura (5 minimo): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los espacios (1 minimo): ");
    int espacio = Integer.parseInt(System.console().readLine());
    
    int huecoFinal = 3;
    
    
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    System.out.println();
    /////////////////1º  linea terminada
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio+3; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio+3; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= huecoFinal; i++) { /////////espacios
    System.out.print(" ");
    }
    System.out.println();
    
    ///////////////Fin 2º linea
    
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    System.out.println();
    
    ////////////////////////fin 3º linea
    ///////////////////////Altura
    for (int k = 1; k <= altura-4; k++) {
    
    for (int j = 1; j <= 1; j++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int j = 1; j <= espacio+3; j++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int j = 1; j <= 1; j++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int j = 1; j <= espacio+3; j++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int j = 1; j <= 1; j++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    System.out.println();
    } /////fin altura
    
    ////////////////////////////////Linea final
    
    for (int i = 1; i <= 1; i++) { ////////asteriscos del 1
    System.out.print("*");  
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    
    for (int i = 1; i <= espacio; i++) { /////////espacios
    System.out.print(" ");
    }
    
    for (int i = 1; i <= 4; i++) {
    System.out.print("*");
    }
    
  }
}

