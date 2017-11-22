
public class S05Ejercicio25 {

  public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int volteado = 0;
    
    while (numeroIntroducido > 0) {
      volteado = volteado + numeroIntroducido % 10;
      numeroIntroducido /= 10;
    } // while
    
    System.out.println("tenemos el " + volteado);
  }
}
