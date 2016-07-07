
public class ListaSobreListasEnlazadas implements Lista {

    private Nodo head;                       
    private int numItems;                    

    public ListaSobreListasEnlazadas() {

        head = null;
        numItems = 0;

    } 

    public boolean esVacia() {//modificada

		
		if ((this.head == null) && (numItems ==0)){
			return true;
		
		}else{
			return false;
		}
	} 

    public int longitud() { //modificada

        return (this.numItems);
    } 

    public void vaciar() {//modificada
		this.head= null;
		this.numItems=0;
    }

    public void insertar(int index, Object item) {//modificada 
		Nodo nuevoNodo = new Nodo(item);
		Nodo nodoAux = new Nodo();
		int i =0;
		nodoAux=head;
		while(i<index){
			nodoAux.cambiarSiguiente(nodoAux.obtenerSiguiente());
			i++;
		}
		nuevoNodo.cambiarItem(item);
		nuevoNodo.cambiarSiguiente(nodoAux.obtenerSiguiente());
		nodoAux.cambiarSiguiente(nuevoNodo);
		numItems++;
		
	} 

    // insertar item en la cabeza de la lista    
    public void insertar(Object item) {

        Nodo nuevoNodo = new Nodo(item);
        nuevoNodo.cambiarSiguiente(head);
        head = nuevoNodo; 
        numItems = numItems + 1;

    } 

    public void eliminar(int index){

        Nodo nodoAux2 = new Nodo();
		Nodo nodoAux = new Nodo();
		int i =0;
		nodoAux=head;
		while(i<index){
			nodoAux.cambiarSiguiente(nodoAux.obtenerSiguiente());
			i++;
		}
		nodoAux2.cambiarSiguiente(nodoAux.obtenerSiguiente());
		nodoAux.cambiarSiguiente(obtenerSiguiente(nodoAux2));
		numItems--;
	

    } 

    public Object obtener(int index)  {
        Object retorno = null; 
        Nodo nodo = head; 
        for (int i=0; i<index && nodo != null ;i++ ) {
            nodo = nodo.obtenerSiguiente();	    		             
        }   
        if (nodo!=null) {
            retorno = nodo.obtenerItem();
        } 
        return retorno;        
    } 

    public String toString() {
		
		Nodo nodoAux = new Nodo();
		int i =0;
		nodoAux=head;
		while(i<numItems){
			nodoAux.cambiarSiguiente(nodoAux.obtenerSiguiente());
			i++;
			
		}
		
		
      

        return null;
    }

}
