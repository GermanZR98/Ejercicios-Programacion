package Ejercicio2;
public class FichaDomino {
  public static void main(String[] args) {
    
    int ladoUno;
    int ladoDos;
    
    FichaDomino2 f1 = new FichaDomino2(0, 0);
    FichaDomino2 f2 = new FichaDomino2(0, 0);
    FichaDomino2 f3 = new FichaDomino2(0, 0);
    FichaDomino2 f4 = new FichaDomino2(0, 0);
    FichaDomino2 f5 = new FichaDomino2(0, 0);
    FichaDomino2 f6 = new FichaDomino2(0, 0);
    FichaDomino2 f7 = new FichaDomino2(0, 0);
    FichaDomino2 f8 = new FichaDomino2(0, 0);
    
    do {
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f1.setLadoUno(ladoUno);
    f1.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f2.setLadoUno(ladoUno);
    f2.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f3.setLadoUno(ladoUno);
    f3.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f4.setLadoUno(ladoUno);
    f4.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f5.setLadoUno(ladoUno);
    f5.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f6.setLadoUno(ladoUno);
    f6.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f7.setLadoUno(ladoUno);
    f7.setLadoDos(ladoDos);
    ladoUno = (int)(Math.random() * 7);
    ladoDos = (int)(Math.random() * 7);
    f8.setLadoUno(ladoUno);
    f8.setLadoDos(ladoDos);
    
    
    } while (f1.getLadoDos() != f2.getLadoUno() || f2.getLadoDos() != f3.getLadoUno()
      || f3.getLadoDos() != f4.getLadoUno() || f4.getLadoDos() != f5.getLadoUno()
      || f5.getLadoDos() != f6.getLadoUno() || f6.getLadoDos() != f7.getLadoUno()
      || f7.getLadoDos() != f8.getLadoUno());
    
      System.out.print(f1);
      System.out.print(f2);
      System.out.print(f3);
      System.out.print(f4);
      System.out.print(f5);
      System.out.print(f6);
      System.out.print(f7);
      System.out.print(f8);
      System.out.println();
  }
}