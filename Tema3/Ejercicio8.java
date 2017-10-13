/**
* Ejercicio8 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.print("Horas trabajadas: ");
    double Horas = Double.parseDouble(System.console().readLine());
    
    double Salario = 12;
    
    double Total = Horas * Salario;
    System.out.println("El trabajador cobra esta semana: " + Total + "€");
        
    }
}
