
public class Catalogo {
    
    private Libro[] libros;
    private int nroLibros;
    private final int DEFAULT_MAX = 50;

    public Catalogo() {
        libros = new Libro[DEFAULT_MAX];
        nroLibros = 0;
    }

    public Catalogo(int max) {
        libros = new Libro[max];
        nroLibros = 0;
    }

    public boolean agregarLibro(Libro l) {
        if (nroLibros == libros.length || buscarPorTitulo(l.obtenerTitulo()) != null)
            return false;

        libros[nroLibros] = l;
        nroLibros++;
        return true;
    }

    // Si hay un libro con titulo t en el catalogo lo retorna, sino devuelve null.
    public Libro buscarPorTitulo(String t) {
        // TODO: Implementar
        // HINT: Usar el metodo equals para comparar strings
        // ej: s1.equals(s2) retorna true si y solo si s1 y s2 son el mismo string.
        return null;
    }


    public void mostrar() {
        for (int i = 0; i<nroLibros; i++) 
            System.out.println("Libro " + i + ": " + libros[i].toString());
    }
    

    @Override
    public boolean equals(Object other) {
        if (other == this) 
            return true;
        if(other == null || other.getClass() != this.getClass())
            return false;
		
		int i =0;
		boolean bool = true;
		Catalogo aux = (Catalogo) other;
		while ((i <nroLibros) && (bool == true)) {
			if (aux.libros[i].equals(this.libros[i])){
				i++;
			}else{
			bool = false;
			}
		}
		return bool;
    }


}
