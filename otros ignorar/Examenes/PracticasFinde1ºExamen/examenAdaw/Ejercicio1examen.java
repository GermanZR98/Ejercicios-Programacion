
/*
* @author German Zambrana Ruiz
*/
  public class Ejercicio1examen {
    public static void main(String[] args) {
      
      String modelo = "";
      double total = 0;
      double tipo = 0;
      double autonoma = 0;
      int bateria = 0;
      double tipoBateriaPrecio = 0;
      String tipoCoche = "Ñesla Modelo";
      String tipoBateria = "";
      String tipoAutonoma = "";
      
      //Empieza el ejercicio
      System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
      modelo = (System.console().readLine());
      
      
      switch (modelo) {
        case "a":
      if (modelo.equals("a")) {
        tipoCoche += " 5";
        tipo = 30000;
        
          System.out.print("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
          modelo = (System.console().readLine());
          
        if (modelo.equals("a")) {
          tipoBateria += " 50";
          tipoBateriaPrecio = 125 * 50;
          bateria = 125;
        }
        
        if (modelo.equals("b")) {
          tipoBateriaPrecio = 125 * 70;
          tipoBateria += " 70";
          bateria = 125;
        }
      } //if del modelo a
        break;
      
      
      
        case "b":
      if (modelo.equals("b")) {
          tipoCoche += " 8";
          tipo = 36000;
          
          System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
          modelo = (System.console().readLine());
          
        if (modelo.equals("a")) {
          tipoBateriaPrecio = 125 * 80;
          tipoBateria += " 80";
          
          bateria = 125;
        }
        if (modelo.equals("b")) {
          tipoBateriaPrecio = 125 * 120;
          tipoBateria += " 120";
          bateria = 125;
        }
        
          System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
          tipoAutonoma = (System.console().readLine());
          
        if (tipoAutonoma.equals("s")) {
          
          autonoma = 1800;
        }
        if (tipoAutonoma.equals("n")) {
          autonoma = 0;
        }
      } //if del modelo b
        break;
      }
      
      //Precio modelo A 
      double precioSubvencionA = (tipo+tipoBateriaPrecio);
      double Subvencion = precioSubvencionA * 0.05;
      double totalA = precioSubvencionA - Subvencion;
      
      // Precio modelo B
      double precioSubvencionB = (tipo+tipoBateriaPrecio+autonoma);
      double totalB = precioSubvencionA - Subvencion;
      //Imprimir factura
      System.out.println();
      System.out.print("Gracias. Aquí tiene el presupuesto de su coche.");
      System.out.println();
      System.out.print(tipoCoche);
      System.out.println();
      System.out.print("Precio base         "+tipo+"€");
      System.out.println();
      System.out.println("Bateria de"+tipoBateria+"          "+tipoBateriaPrecio+"€");
      
      if (tipoAutonoma.equals("s")) {
      System.out.print("Conduccion aut.          1800€");  
      totalA = totalB;
      precioSubvencionA = precioSubvencionB;
      } else if (tipoAutonoma.equals("n") ) {
      System.out.print("Sin conduccion aut.          0€");  
      } 
      
      System.out.println(); 
      System.out.print("Subvencion Estatal:          -"+Subvencion);
      System.out.println();
      System.out.println("Total:          "+totalA); 
      
      
      
      
      
      
    
      
      
      
      
      
      
      
      
      
   
    } //class
  } //Static

  
