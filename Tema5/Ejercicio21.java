/**
* Ejercicio21 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio21 {
    public static void main(String[] args) {
      
      int contador = 0;
      int n = 0;
      int contMedia = 0;
      int contImp = 0;
      int par = 0;
      
      while (n >= 0) {
        System.out.print("Introduzca un número: ");
        n = Integer.parseInt(System.console().readLine());
        if (n > 0){
          contador ++;
        }
        if ((n%1==0) || (n%3==0) || (n%5==0)|| (n%7==0)|| (n%9==0)) {
          if (n > 0){
          contImp ++;
          contMedia += n;
        }
          }
        if (n%2==0) {
          if (n > par) {
            par = n;
            }
          }
        }
        System.out.println("Se han introducido: " +contador+ " numeros");
        System.out.println("La media es: " +contMedia/contImp);
        System.out.println("El nº par más grande es: " +par);
      }
    }
    
