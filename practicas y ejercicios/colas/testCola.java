public class testCola {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Uso: java testCola <numero natural>");
		}
		else {
			Cola miCola = new ColaSobreListas();
//			System.out.println("rep. luego de creacion " + miCola.repOK());
			int valor = Integer.parseInt(args[0]);
			int valorCorriente = 0;
			while (valorCorriente <= valor) {
				miCola.encolar(new Integer(valorCorriente));
//				System.out.println("rep. luego de insercion " + miCola.repOK());
				valorCorriente++;
			}
			while (!miCola.esVacia()) {
				Integer elemCorriente = (Integer) miCola.primero();
				System.out.println("primer elem.: " + elemCorriente.intValue());
				miCola.desencolar();
//				System.out.println("rep. luego de elim. " + miCola.repOK());
			}
		}
	}
}
