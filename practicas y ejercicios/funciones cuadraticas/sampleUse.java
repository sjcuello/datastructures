/** Clase que ilustra el uso de funciones cuadráticas. Consiste sólo de un
 * método principal, que crea una función cuadrática usando parámetros pasados
 * por consola, calcula e imprime las raíces reales de la función creada.
 * @author Nazareno Aguirre 
 * @version 0.1 8/9/2009
 */
public class sampleUse {


    /** Método principal, que crea una función cuadrática utilizando valores
     * pasados por consola. Luego muestra por consola las raíces reales de
     * la función cuadrática creada. 
     * @param args contiene los tres parámetros utilizados para crear la 
     * función cuadrática.
     * @throws Exception si hay problemas (problemas de conversión de los 
     * parámetros pasados, problemas con el uso de los métodos de 
     * FuncionCuadratica, etc). 
     */
    public static void main(String[] args) throws Exception {
	float a = Float.parseFloat(args[0]);
	float b = Float.parseFloat(args[1]);
	float c = Float.parseFloat(args[2]);
        FuncionCuadratica f = new FuncionCuadratica(a,b,c);
        if (f.numRaices()==0) {
            System.out.println("El polinomio " + f.toString() + " no tiene raíces reales");
	}
	else {
	    if (f.numRaices()==1) {
		System.out.println("El polinomio " + f.toString() + " tiene la raíz real: " + ((Float) f.raices()).floatValue());
	    }
	    else {
                Pair<Float,Float> raices = (Pair<Float,Float>) f.raices();
		System.out.println("El polinomio " + f.toString() + " tiene las raíces reales: " + raices.toString()); 
	    }

	}
    }

}
