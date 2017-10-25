/**
* Ejercicio23 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduza el tipo de iva (general,reducido o superreducido): ");
    String tipo = System.console().readLine();
    
    double iva = 0;
    
    switch (tipo) {
     case "general":
      iva = 1.21;
      break;
     
     case "reducido":
      iva = 1.10;
      break;
      
    case "superreducido":
      iva = 1.04;
      break;
      
    default:
     System.out.println("Ese tipo no existe");
    }
    
    System.out.print("Código promocional(nopro,mitad,meno5,5porc): ");
    String codigo = System.console().readLine();
    
    double cod = 0;
    
    switch (codigo) {
     case "nopro":
      cod = base + 0;
      break;
     
     case "mitad":
      cod = base * 0.5;
      break;
      
    case "meno5":
      cod = base - 5;
      break;
      
    case "5porc":
      cod = base *1.05;
      break;
      
    default:
     System.out.println("Ese codigo no existe");
   }
   
   System.out.print("Base imponible: " + base +"\n");
   System.out.print("IVA: " + iva +"\n" );
   System.out.print("Precio con IVA: " + (base * iva) +"\n");
   System.out.print("COD promo: " + cod +"\n");
   System.out.print("Total: " + (cod*iva) +"\n" );
 }
}

    
    
    
