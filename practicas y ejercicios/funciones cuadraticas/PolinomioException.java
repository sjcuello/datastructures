/** Excepción para comunicar problemas en el uso de funciones cuadráticas y
 * otros polinomios. 
 * @author Nazareno Aguirre
 * @version 0.1 8/9/2009
 */
public class PolinomioException extends Exception {

    /**
     * Constructor de PolinomioException. Definida en términos del constructor
     * de Exception.
     * @param s es la cadena usada para comunicar la razón de la excepción.
     */
    public PolinomioException(String s) {
        super(s);
    }
}
