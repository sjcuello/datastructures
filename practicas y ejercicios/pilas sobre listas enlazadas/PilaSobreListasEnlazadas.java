/**
 * Implementacion del TAD Pila, usando una estructura de datos dinámica,
 * más precisamente una lista enlazada.
 * Esta clase implementa los métodos abstractos declarados en Pila. Esta
 * es una implementación genérica del TAD Pila.
 * @author Nazareno Aguirre
 * @version 0.2 16/9/2009
 */
public class PilaSobreListasEnlazadas<T> implements Pila<T> {
	
	
    private Nodo<T> tope; // usado como la cabeza del a lista enlazada que
	// almacena los elementos de la pila. the linked list 
	private int numItems; // indica la cantidad de elementos en la pila.
	
	/** 
	 * Constructor de la clase PilaSobreListasEnlazadas.   
	 * @pre. true.
	 * @post. Se inicializa la estructura, dejando tope en null
	 * y numItems en 0.  
	 */
    public PilaSobreListasEnlazadas() {
		
        tope = null;
		numItems = 0;
		
    } 
	
	/** 
	 * Indica si la pila es vacía o no.
	 * @return true ssi la pila no tiene elementos
	 * @pre. true.
	 * @post. Retorna true ssi la pila no tiene elementos
	 */
    public boolean esVacia() {
		
        return (numItems==0);    
		
    } 
	
	/** 
	 * Retorna la cantidad de elementos de la pila.
	 * @return retorna la cantidad de elementos de la pila.
	 * @pre. true.
	 * @post. retorna la cantidad de elementos de la pila.
	 */
    public int longitud() {
		
		return numItems;
		
    } 
	
	/** 
	 * Elimina todos los elementos de la pila.
	 * @pre. true.
	 * @post. elimina todos los elementos de la pila.
	 */	
    public void vaciar() {
		
        tope = null;
		numItems = 0;
		
    } 
	
	/** 
	 * inserta item al tope de la pila de elementos.
	 * @param item es el objeto a insertar en la pila.
	 * @pre. true  
	 * @post. Si la estructura subyacente a la pila no está agotada en espacio,
	 * se inserta item al tope de la pila. Si la inserción falla por algún
	 * motivo, lanza una excepción de tipo RunTimeException.
	 */
    public void apilar(T item) throws RuntimeException {
		
        try {
			Nodo<T> nuevoNodo = new Nodo<T>();
			nuevoNodo.cambiarItem(item);
			nuevoNodo.cambiarSiguiente(tope);
			tope = nuevoNodo;
			numItems++;
		}
		catch (Exception err){
            throw new 
			RuntimeException("PilaSobreListasEnlazadas.apilar: ocurrio un error.");
		}
		
    } 
	
	/** 
	 * elimina el elemento al tope de la pila.
	 * @pre. longitud()>0 
	 * @post. si la pila es no vacía, elimina el elemento del tope
	 *  Si la pila está vacía, lanza una excepción de tipo
	 * Exception. 
	 */
    public void desapilar() throws Exception {
		
        if (tope!=null) {
			tope = tope.obtenerSiguiente();
			numItems--;
		}
		else {
			throw new 
			Exception("PilaSobreListasEnlazadas.desapilar: pila vacia.");
		} 
		
    } 
	
	/** 
	 * retorna el elemento al tope de la pila. 
	 * @return el elemento al tope de la pila.
	 * @pre.longitud()>0 
	 * @post. si la pila es no vacía, se retorna el item del tope.
	 *  Si la pila está vacía, se lanza una excepción de tipo
	 * Exception. 
	 */
    public T tope() throws Exception {
		
        if (tope!=null) {
			return tope.obtenerItem();
		}
		else {
			throw new 
			Exception("PilaSobreListasEnlazadas.tope: pila vacia.");
		} 
		
    } 
	
	/**
     * Indica si la representación de la pila es internamente consistente.  
     * @return true si y sólo si la representación de la pila es internamente 
     * consistente.
     * @pre. true
     * @post. retornar true si y sólo si la representación de la pila es internamente
	 * consistente. En este caso, la estructura es internamente consistente si y
	 * sólo si numItems es exactamente el número de nodos en la lista enlazada, desde 
	 * tope. Este algoritmo incluye el chequeo de aciclicidad de la estructura de datos.
     */	
    public boolean repOk() {
		int cantItems = numItems;
		Nodo<T> corriente = tope;
        while (corriente != null && cantItems>0) {
			cantItems--;
			corriente = corriente.obtenerSiguiente();
		} 
        return ((cantItems==0)&&(corriente==null));
	}
	
} 
