/**
* Ejercicio1 examen
* pintar la bandera de españa
* @author German Zambrana Ruiz
*/
  public class Ex31gzr {
  public static void main(String[] args) {
    System.out.print("Introduzca la altua de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    double precio1 = (altura*anchura)*0.01;
    double total = precio1;
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String respuesta = System.console().readLine();
    
    
    if (respuesta.equals("s")) {
        total = precio1 + 2.50;
      }
      
    if (respuesta.equals("n")) {
        total = precio1;
      }
    System.out.println("Gracias.Aqui tiene su bandera");
    System.out.println("Bandera de:   "+altura*anchura*0.01+"€");
    
    if (respuesta.equals("s")) {
        System.out.print("Con escudo:   2.50€");
      }
    if (respuesta.equals("n")) {
        System.out.print("Sin escudo:   0.00€\n");
      }
    System.out.print("Gastos de envío:   3.25€\n");
    total += 3.25;
    System.out.print("Total: "+total+"€");
    
  }
}

