/*
 * Ejercicio 1 del examen
 * 
 * @author German Zambrana Ruiz
 * 16/11/2017
 * 2º Turno 
 */
  public class Ex31gzr1 {
    public static void main(String[] args) {
      System.out.println("Nuevo pedido de pizza.");
      System.out.print("Seleccione el tamaño 1.Pequeña 2.Mediana 3.Familiar: ");
      
      int size = Integer.parseInt(System.console().readLine());
      double pizza = 0;
      double valorQueso = 0;
      double valorIngre = 0;
      double descuento = 0;
      String queso = "";
      
      switch (size) {
        case 1:
        pizza = 8;
        break;
        case 2:
        pizza = 11;
        break;
        case 3:
        pizza = 14;
        break;
      } ///switch 
      
      System.out.print("¿Cuántos ingredientes quiere? ");
      double ingre = Integer.parseInt(System.console().readLine());
      
      if (ingre == 3) {
        valorIngre = (ingre * 2)-6;
      }
      if (ingre == 2) {
        valorIngre = (ingre * 2)-4;
      }
      if (ingre == 1) {
        valorIngre = (ingre * 2)-2;
      }
      if (ingre > 3) {
        valorIngre = (ingre * 2)-6;
      }
      
      System.out.print("¿Quiere extra de queso? (s/n): ");
      queso = (System.console().readLine());
        
        if (queso.equals("s")) {
          valorQueso = 3;
        }
        if (queso.equals("n")) {
          valorQueso = 0;
        }
      
      double total = pizza + valorIngre + valorQueso;
      double totalDesc = 0;
      double totalQueso = pizza + valorIngre + valorQueso;
      
      
      if (total > 25) {
        descuento = total * 0.10;
        totalDesc = total - descuento;
      }
      
      double quesoDescuento = totalQueso - descuento;
      System.out.println();
      
      ///////////////////////Factura
      System.out.println("Gracias. Aquí tiene su ticket.");
      System.out.println("Pizza Jat");
      System.out.println("Precio base            "+pizza+" €");
      System.out.println("Ingredientes ( "+ingre+")     "+valorIngre+"€");
      if (queso.equals("s")) {          //Si queso y no descuento
        System.out.println("Extra de queso: "+valorQueso+"€");
        System.out.println("Total                   "+totalQueso+"€");
      }
      if (queso.equals("s") && (total > 25)) {    //si y si 
        System.out.println("Extra de queso: "+valorQueso+"€");
        System.out.println("Descuento               -"+descuento+"€");
        System.out.println("Total                   "+quesoDescuento+"€");
      }
      
      if (queso.equals("n")) {
        System.out.println("Total:                   "+total+"€");
      }  
      
      if (queso.equals("n") && (total > 25)) {
        System.out.println("Descuento               -"+descuento+"€");
        System.out.println("Total:                   "+totalDesc+"€");
      }  
      
      
      
      
        
        
        
        
        
        
        
        
        
        
        
        
        

      
    
      
    
    
    } //Class
  } //Static
