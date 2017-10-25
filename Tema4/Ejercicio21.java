/**
* Ejercicio21 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.print("Dime la nota del 1º examen: ");
    
    int nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Dime la nota del 2º examen: ");
    
    int nota2 = Integer.parseInt(System.console().readLine());
    
    int media = (nota1 + nota2) / 2;
    
    if (media >= 5) {
      System.out.println("Felicidades, has aprobado la asignatura ");
      System.out.println("Tu nota media es de " + media);
      }
      
    if (media < 5) {
      System.out.println("Lo siento, tienes que hacer la recuperación");
      System.out.println("EL resultado ha sido (apto/noapto)");
      
      String apto = System.console().readLine();
      
      switch (apto) {
        case "apto":
         System.out.println("Felicidades, has aprobado con un 5");
         break;
         
        case "noapto":
         System.out.println("Lo siento tu nota es de " + media);
         break;
         
        default:
         System.out.println("Lo siento, no conozco ese valor");
        }
      }
    

}
}

    
