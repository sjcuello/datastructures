import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    //para leer de teclado
    Scanner in= new Scanner(System.in);

    System.out.println("Prueba de que andan las listas enlazadas");
    System.out.println("Creacion");
    ListaSobreListasEnlazadas l = new ListaSobreListasEnlazadas();
    System.out.println("Es vacia?: "+ l.esVacia());
    System.out.println("Inserto elementos");
    int i=0;
    while(i<4){
      in.nextLine();
      l.insertar(in.nextInt());
      i++;
    }

    System.out.println("Los elementos son:");
    l.show();
  }	
}