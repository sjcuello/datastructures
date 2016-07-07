public class PruebaLista {

    public static void main(String[] args) { 
        Lista l1 = new ListaSobreListasEnlazadas();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        l1.insertar(i1);
        l1.insertar(i2);
        System.out.println("Lista l1:");
        System.out.println(l1.obtener(0).toString());
        System.out.println(l1.obtener(1).toString());
        System.out.println("");

        Lista l2 = new ListaSobreListasEnlazadas();    
        Libro lotr = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro hp = new Libro("Harry Potter", "J. K. Rowling", 600);
        l2.insertar(lotr);
        l2.insertar(hp);
        Libro res1 = (Libro) l2.obtener(0);
        Libro res2 = (Libro) l2.obtener(1);
        System.out.println("Lista l2:");
        System.out.println(res1.obtenerTitulo());
        System.out.println(res2.obtenerTitulo());
    }

}
