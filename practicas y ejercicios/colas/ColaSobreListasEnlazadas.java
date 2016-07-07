public class ColaSobreListasEnlazadas implements Cola {

	private Nodo fin;
	private int numItems;

	public ColaSobreListasEnlazadas() {
		fin = null;
		numItems = 0;
	}

	public boolean esVacia() {
		return (numItems == 0);
	}

	public void vaciar() {
		fin = null;
		numItems = 0;
	}

	public int longitud() {
		return (numItems);
	}

	public void encolar(Object item) throws ExcepcionCola {
		try {
			Nodo nuevoNodo = new Nodo(item);
			if (esVacia()) {
				nuevoNodo.setNext(nuevoNodo);
			}
			else {
				nuevoNodo.setNext(fin.getNext());
				fin.setNext(nuevoNodo);
			}
			fin = nuevoNodo;
			numItems++;
		}
		catch(Exception e) {
			throw new ExcepcionCola("Excepcion en ColaSobreListasEnlazadas.encolar");
		}
	}

	public void desencolar() throws ExcepcionCola {
		if (esVacia()) {
			throw new ExcepcionCola("Excepcion en ColaSobreListasEnlazadas.desencolar: Cola vacia");
		}
		else {
			if (longitud()==1) {
				fin = null;
			}
			else {
				fin.setNext((fin.getNext()).getNext());
			}
			numItems--;
		}
	}

	public Object primero() throws ExcepcionCola {
		if (esVacia()) {
			throw new ExcepcionCola("Excepcion en ColaSobreListasEnlazadas.primero() : Cola Vacia");
		}
		return (fin.getNext()).getInfo();
	} 

	public boolean repOK() {
		if (((fin == null) && (numItems !=0))||((fin!=null)&& numItems<=0)) {
			return false;
		}
		else {
			Nodo corriente = fin;
			int visitados = 0;
			while ((corriente != null) && (visitados != numItems)) {
				visitados++;
				corriente = corriente.getNext();	
			}
			return (corriente == fin);
			
		}
	}
}
