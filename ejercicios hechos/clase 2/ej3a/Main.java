import java.io.IOException;

public class Main {
    
    public static void main(String args[]) throws IOException {

        Libro l1 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro l2 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());

        System.in.read();

        if (l1 == l2) 
            System.out.println("l1 igual a l2\n");
        else
            System.out.println("l1 distinto a l2\n");

        Libro l3 = l1;          
        System.out.println("l1: " + l1.toString());
        System.out.println("l3: " + l3.toString());

        System.in.read();

        if (l1 == l3) 
            System.out.println("l1 igual a l3\n");
        else
            System.out.println("l1 distinto a l3\n");

        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());

        System.in.read();

        if (l1.equals(l2)) 
            System.out.println("l1 igual (equals) a l2\n");
        else
            System.out.println("l1 distinto a l2\n");
        

        Libro l4 = new Libro("Harry Potter", "J. K. Rowling", 600);
        Catalogo c1 = new Catalogo();
        c1.agregarLibro(l1);
        c1.agregarLibro(l4);
        Catalogo c2 = new Catalogo();
        c2.agregarLibro(l2);
        c2.agregarLibro(l4);
         
        System.in.read();

        // TODO: Implementar equals de Catalogo para que imprima por pantalla c1 igual a c2
        if (c1.equals(c2)) 
            System.out.println("c1 igual a c2\n");
        else
            System.out.println("c1 distinto a c2\n");

   }


}
