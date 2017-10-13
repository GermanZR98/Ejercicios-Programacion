/**
* Ejercicio12 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Que nota quieres sacar: ");
    double deseo = Double.parseDouble(System.console().readLine());
    
    double nota2 = ((deseo * 100) - (nota1 * 40)) / 60;
   
    System.out.println("Entonces tienes que sacar un: " + nota2);
        
    }
}
