/* ---------------------------------------------------------------------- */
/* ---------------------------------------------------------------------- */
/* Clase Cola: Clase abstracta que especifica el TAD Cola (polimorfico).  */
/* Las clases que implementan el TAD Cola deben heredar de esta, y proveer*/
/* implementaciones para todos los metodos abstractos de la misma.        */
/* -----------------------------------------------------------------------*/
/* -----------------------------------------------------------------------*/
public class ColaSobreListas implements Cola {

    private Lista items;
        	

    /* ColaSobreListas(): Constructor de la clase ColaSobreListas        */
    /* pre: true                                                         */
    /* post: Se crea una lista y se asigna a la referencia items.        */
    public ColaSobreListas() {
        items = new ListaSobreArreglos();
    }


    /* esVacia(): Indica si la cola es vacia o no                        */
    /* pre: true                                                         */
    /* post: Retorna true ssi items no tiene elementos                   */
    public boolean esVacia() {
        return (items.esVacia());
    } // fin de esVacia()


     /* vaciar(): Elimina todos los elementos de la cola                   */
     /* pre: true                                                          */
     /* post: elimina todos los elementos de items.                        */
     public void vaciar() {
        items.vaciar();
     } // fin de vaciar()


     /* longitud(): Retorna la cantidad de elementos de la cola            */
     /* pre: true                                                          */
     /* post: retorna la cantidad de elementos de items.                   */
     public int longitud() {
        return (items.longitud());
     } // fin de longitud()

     
     /* encolar(item): agrega item en el extremo de entrada de la cola.    */
     /* pre: true                                                          */
     /* post: agrega item en el extremo de entrada de la cola, es decir    */
     /* al final de la lista items.                                        */
     /* Si la operacion falla por algun motivo, lanza una excepcion        */
     /* ExcepcionCola.                                                     */
     public void encolar(Object item) throws ExcepcionCola {
        try {
            items.insertar(items.longitud()+1,item);
        }
        catch (Exception s) {
            throw new ExcepcionCola("ColaSobreListas.encolar: Ocurrio un error");
        }
     } // fin de encolar(item)


     /* desencolar(): elimina el primer elemento en el extremo de salida   */
     /* de la cola .                                                       */
     /* pre: longitud()>=1                                                 */
     /* post: si la cola es no vacia, se elimina el primer elemento en el  */
     /* extremo de salida de la misma, es decir el elemento en la posicion */
     /* 1 de la lista items.                                               */
     /* Si la cola esta vacia, lanza una excepcion ExcepcionCola.          */
     public void desencolar() throws ExcepcionCola {
        try {
            items.eliminar(1);
        }
        catch (Exception s) {
            throw new ExcepcionCola("ColaSobreListas.desencolar: Ocurrio un error");
        }
     } // fin de desencolar()


     /* primero(): retorna el primer elemento en el extremo de salida.     */
     /* de la cola .                                                       */
     /* pre: longitud()>=1                                                 */
     /* post: si la cola es no vacia, retorna el primer elemento en el     */
     /* extremo de salida de la misma, es decir el elemento en la posicion */
     /* 1 de la lista items.                                               */
     /* Si la cola esta vacia, lanza una excepcion ExcepcionCola.          */
     public Object primero() throws ExcepcionCola {
        Object res;
        try {
            res = items.obtener(1);
        }
        catch (Exception s) {
            throw new ExcepcionCola("ColaSobreListas.primero: Ocurrio un error");
        }
        return res;
     } // fin de primero()

	public boolean repOK() {
		return true;
	}     
} // fin de clase ColaSobreListas
