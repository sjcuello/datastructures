/**
 * Interface que especifica los servicios básicos e indispensables del
 * TAD Pila. Esta interface corresponde a implementaciones genéricas
 * de pilas.
 * @author Nazareno Aguirre
 * @version 0.1 18/9/2009
 */

public interface Pila<T> {
	
	/** 
	 * Indica si la pila es vacía o no.
	 * @return true ssi la pila no tiene elemento
	 * @pre. true.
	 * @post. Retorna true ssi la pila no tiene elementos
	 */
	public boolean esVacia();
	
	/** 
	 * Elimina todos los elementos de la pila.
	 * @pre. true.
	 * @post. elimina todos los elementos de la pila.
	 */
	public void vaciar();
	
	/** 
	 * Retorna la cantidad de elementos de la pila.
	 * @return retorna la cantidad de elementos de la pila.
	 * @pre. true.
	 * @post. retorna la cantidad de elementos de la pila.
	 */
	public int longitud();

	/** 
	 * inserta item al tope de la pila de elementos.
	 * @param item es el objeto a insertar en la pila.
	 * @pre. true  
	 * @post. Si la estructura subyacente a la pila no está agotada en espacio,
	 * se inserta item al tope de la pila. Si la inserción falla por algún
	 * motivo, lanza una excepción de tipo RunTimeException.
	 */
	public void apilar(T item) throws RuntimeException; 
	
	/** 
	 * elimina el elemento al tope de la pila.
	 * @pre. longitud()>0 
	 * @post. si la pila es no vacía, elimina el elemento del tope
	 *  Si la pila está vacía, lanza una excepción de tipo
	 * Exception. 
	 */
	public void desapilar() throws Exception;
	
	/** 
	 * retorna el elemento al tope de la pila. 
	 * @return el elemento al tope de la pila.
	 * @pre.longitud()>0 
	 * @post. si la pila es no vacía, se retorna el item del tope.
	 *  Si la pila está vacía, se lanza una excepción de tipo
	 * Exception. 
	 */
	public T tope() throws Exception;
	
	/**
     * Indica si la representación de la pila es internamente consistente.  
     * @return true si y sólo si la representación de la pila es internamente 
     * consistente.
     * @pre. true
     * @post. retornar true si y sólo si la representación de la pila es internamente
	 * consistente.
     */
    public boolean repOk();
	
}
