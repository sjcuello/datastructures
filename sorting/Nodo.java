/*-------------------------------------------------------------------------*/
/*-------------------------------------------------------------------------*/
/* Clase Nodo: Usada para construir listas enlazadas para implementaciones */
/* basadas en referencias de listas, pilas, colas, etc.                    */
/*-------------------------------------------------------------------------*/
/*-------------------------------------------------------------------------*/

public class Nodo {

    private Object item;
    private Nodo siguiente;
    
    /*------------------------------------------------------------*/
    /* Nodo(): Constructor de la clase Nodo.                      */
    /*Pre: true.                                                  */
    /*Post: item y siguiente se setean en null.                   */
    /*------------------------------------------------------------*/
    public Nodo() {
        item = null;
	      siguiente = null;
    } 
    

    /*------------------------------------------------------------*/
    /* Nodo(nuevoItem): Constructor de la clase Nodo.             */
    /*Pre: true.                                                  */
    /*Post: item se setea con nuevoItem, y siguiente se setea en  */
    /* null.                                                      */
    /*------------------------------------------------------------*/
    public Nodo(Object nuevoItem) {
        item = nuevoItem;
	      siguiente = null;
    } 
    

    /*------------------------------------------------------------*/
    /* Nodo(nuevoItem, siguienteNodo): Constructor de la clase    */
    /* Nodo.                                                      */
    /*Pre: true.                                                  */
    /*Post: item se setea con nuevoItem, y siguiente se setea con */
    /* siguienteNodo.                                             */
    /*------------------------------------------------------------*/
    public Nodo(Object nuevoItem, Nodo siguienteNodo) {
        item = nuevoItem;
	      siguiente = siguienteNodo;
    } 
    

    /*------------------------------------------------------------*/
    /* cambiarItem(nuevoItem): setea el atributo item del nodo.   */
    /*Pre: true.                                                  */
    /*Post: el atributo item se setea con nuevoItem.              */
    /*------------------------------------------------------------*/
    public void cambiarItem(Object nuevoItem) {
        item = nuevoItem;
    } 
    
    /*------------------------------------------------------------*/
    /* cambiarSiguiente(siguienteNodo): setea el atributo         */
    /* "siguiente" de un nodo.                                    */
    /* Pre: true.                                                 */
    /*Post: siguiente se setea con siguienteNodo.                 */
    /*------------------------------------------------------------*/
    public void cambiarSiguiente(Nodo siguienteNodo) {
        siguiente = siguienteNodo;
    } 

    /*------------------------------------------------------------*/
    /* obtenerItem(): retorna el item de un nodo.                 */
    /*Pre: true.                                                  */
    /*Post: item is retornado, y no se cambia el valor de los     */
    /* atributos.                                                 */
    /*------------------------------------------------------------*/
    public Object obtenerItem() {
        return item;
    } 

    /*------------------------------------------------------------*/
    /* obtenerSiguiente(): retorna el atributo "siguiente" de un  */
    /* Nodo.                                                      */
    /*Pre: true.                                                  */
    /*Post: siguiente es retornado, y no se cambia el valor de los*/
    /* atributos.                                                 */
    /*------------------------------------------------------------*/
    public Nodo obtenerSiguiente() {
        return siguiente;
    } 
    
} // fin de clase Nodo
