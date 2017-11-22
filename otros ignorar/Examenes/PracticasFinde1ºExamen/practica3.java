/**
* Ejercicio24 Tema4
*
* @author German Zambrana Ruiz
*/
  public class practica3 {
  public static void main(String[] args) {
    
    System.out.print("¿Que quieres palmera donut o pitufo?: ");
    
    double pitufo = 0;
    double aceite = 0;
    double tortilla = 0;
    double donut = 0;
    double zumo = 0;
    double cafe = 0;
    
    String ingredientes = "";
    
    ingredientes = (System.console().readLine());
    
    if (ingredientes.equals("pitufo")) {
      System.out.print("Quiere aceite o tortilla: ");
      
      ingredientes = (System.console().readLine());

        if (ingredientes.equals("aceite")) {
         aceite = 1.20;
         double precioAceite = pitufo + aceite;
         System.out.print("Pitufo con aceite: "+precioAceite);
         System.out.println();
        }
        
                
        if (ingredientes.equals("tortilla")) {
         tortilla = 1.80;
         double precioTortilla = pitufo + tortilla;
         System.out.print("Pitufo con tortilla: "+precioTortilla);
         System.out.println();
        }
        
      } //cierra if
    
      if (ingredientes.equals("donut")) {
        donut = 1;
        double precioDonut = donut;
        System.out.print("Donut: "+precioDonut);
        System.out.println();
      }
  
    
      System.out.print("Quiere zumo o cafe: ");
    
      
      
      String bebida = (System.console().readLine());
      double bebida2 = 0;
    
      if (bebida.equals("zumo")) {
         zumo = 1.50;
         double precioZumo = zumo;
         System.out.print("Zumo: "+precioZumo);
         System.out.println();
        }
        
      if (bebida.equals("cafe")) {
       cafe = 1.25;
       double precioCafe = cafe;
       System.out.print("cafe: "+precioCafe);
       System.out.println();
      }
      
      double precioCafe = cafe;
      double precioZumo = zumo;
      double total = pitufo + donut + aceite + tortilla + zumo + cafe;
      System.out.print("Total: "+total);
  }
}
