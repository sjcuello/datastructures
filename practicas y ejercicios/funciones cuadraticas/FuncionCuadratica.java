/**
 * Clase que representa funciones polinómicas de grado 2, es decir, funciones
 * cuadráticas. Estas funciones cuadráticas son mutables, es decir, su estado
 * puede ser alterado una vez creado un objeto. 
 * 
 * @author Nazareno Aguirre
 * @version 0.1 8/9/2009
 */
public class FuncionCuadratica {
    private float a; // coheficiente cuadrático del polinomio
    private float b; // coheficiente lineal del polinomio
    private float c; // término independiente del polinomio

    /**
     * Constructor por defecto de funciones cuadráticas. La función cuadrática
     * creada por defecto es la función constante f(x) = x^2.
     * @pre. true.
     * @post. se crea la función f(x) = x^2. 
     */
    public FuncionCuadratica() {
        a = 1;
        b = 0;
        c = 0;
    }

    /**
     * Constructor de funciones cuadráticas. La función cuadrática creada
     * se basará en los parámetros, y será la función: f(x) = ax^2+bx+c. El
     * coheficiente cuadrático debe ser distinto de cero; caso contrario se
     * lanza una excepción de tipo PolinomioException.
     * @param a es el coheficiente cuadrático usado para crear la función. 
     * @param b es el coheficiente lineal usado para crear la función. 
     * @param c es el término independiente usado para crear la función.
     * @throws PolinomioException cuando el coheficiente cuadrático es cero. 
     * @pre. true.
     * @post. se crea la función f(x) = ax^2+bx+c. 
     */
    public FuncionCuadratica(float a, float b, float c) throws PolinomioException {
        if (a==0.0) throw new PolinomioException("FuncionCuadratica.FuncionCuadratica(float a, float b, float c): El coheficiente cuadrático no puede ser cero.");
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /**
     * Permite cambiar el coheficiente cuadrático de esta función cuadrática.
     * El oheficiente cuadrático debe ser distinto de cero; caso contrario se
     * lanza una excepción de tipo PolinomioException.
     * @param a es el nuevo coheficiente cuadrático para esta función. 
     * @throws PolinomioException cuando el coheficiente cuadrático es cero. 
     * @pre. a!=0
     * @post. this.a = a.
     */
    public void setA(float a) throws PolinomioException {
        if (a==0.0) throw new PolinomioException("FuncionCuadratica.setA(float a): El coheficiente cuadrático (parámetro) no puede ser cero.");
        this.a = a;

    }

    /**
     * Permite obtener el valor del coheficiente cuadrático de esta función 
     * cuadrática.
     * @return el valor del coheficiente cuadrático de esta función.
     * @pre. true
     * @post. return = a.
     */
    public float getA() {
        return a;
    }

    /**
     * Permite cambiar el coheficiente lineal de esta función cuadrática.
     * @param b es el nuevo coheficiente lineal para esta función. 
     * @pre. true
     * @post. this.b = b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Permite obtener el valor del coheficiente lineal de esta función 
     * cuadrática.
     * @return el valor del coheficiente lineal de esta función.
     * @pre. true
     * @post. return = b.
     */
    public float getB() {
        return b;
    }

    /**
     * Permite cambiar el término independiente de esta función cuadrática.
     * @param c es el nuevo término lineal para esta función. 
     * @pre. true
     * @post. this.c = c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Permite obtener el valor del término independiente de esta función 
     * cuadrática.
     * @return el valor del término independiente de esta función.
     * @pre. true
     * @post. return = c.
     */
    public float getC() {
        return c;
    }

    /**
     * Evalúa esta función cuadrática en un valor real determinado.
     * @param x es el valor de tipo float en que se evalúa la función.
     * @return la imagen, según la función, del valor x. 
     * @pre. true
     * @post. return = a*x*x + b*x + c.
     */
    public float eval(float x) {
        return (a*x*x + b*x + c);
    }

    /**
     * Calcula el determinante de una función cuadrática.
     * @return el valor del determinante de la función cuadrática.
     * @pre. true
     * @post. return = b*b - 4*a*c.
     */
    public float determinante() {
        return (b*b - 4*a*c);
    }

    /**
     * Calcula el número de raíces reales de una función cuadrática.
     * @return el número de raíces de la función cuadrática.
     * @pre. true
     * @post. return = número de raíces de este polinomio (valor entre 0 y 2).
     */
    public int numRaices() {
        float determinante = determinante();
        if (determinante>0) {
            return 2;
        }
        else if (determinante==0) {
            return 1;
        }
	else {
            return 0;
        }
    }

    /**
     * Calcula las raíces reales de una función cuadrática. Si la función no
     * tiene raíces reales, entonces se lanza una excepción de tipo
     * PolinomioException.
     * @return las raíces reales del polinomio. Si el mismo tiene dos raíces
     * reales, la función las retorna en un objeto de tipo Pair<Float,Float>.
     * Si el polinomio tiene sólo una raíz, se retorna la misma como un 
     * objeto de tipo Float.
     * @see Pair
     * @see java.lang.Float
     * @throws PolinomioException cuando esta función no tiene raíces reales.
     * @pre. determinante()>=0
     * @post. return = raíces de este polinomio (un par de Float, o un Float).
     * Si la precondición no se satisface, se lanza una excepción de tipo
     * PolinomioException.
     */
    public Object raices() throws PolinomioException {
        int numRaices = numRaices();
        switch (numRaices) {
            case 2: 
                Pair<Float,Float> raices = new Pair<Float,Float>();
                Float raiz1 = new Float((-b+Math.sqrt(determinante()))/2*a);
                Float raiz2 = new Float((-b-Math.sqrt(determinante()))/2*a);
                raices.setFst(raiz1);
                raices.setSnd(raiz2);
	        return raices;
            case 1: 
                Float raiz = new Float(-b/(2*a));		
                return raiz;
            default: 
                throw new PolinomioException("Polinomio.raices(): El polinomio no tiene raices reales");
        }
    }

    /**
     * Genera una representación textual del estado de esta función. 
     * @return una cadena de caracteres conteniendo la representación textual 
     * del estado de esta función.
     * @pre. true
     * @post. return = representación textual del estado de esta función
     * cuadrática.
     */
    public String toString() {
        String resultado = a + "x^2";
        if (b!=0.0) resultado = resultado + "+"+b+"x";
        if (c!=0.0) resultado = resultado + "+"+c;
        return resultado;
    }

    /**
     * Indica si esta función cuadrática es internamente consistente. En este
     * caso, la función es internamiente consistente si y sólo si el 
     * coheficiente cuadrático de la función es distinto de cero. 
     * @return true si y sólo si el coheficiente cuadrático de la función
     * cuadrática es distinto de cero.
     * @pre. true
     * @post. return = (a!=0.0)
     */
    public boolean repOk() {
        return (a!=0.0);
    }

    /**
     * Indica si esta función cuadrática es igual a la pasado como parámetro.
     * @param other es la función cuadrática con la que se comparará esta 
     * función. 
     * @return true si y sólo si esta función y la pasada como parámetro 
     * representan la misma función cuadrática. 
     * @pre. true
     * @post. return = a==other.getA() && b==other.getB() && c==other.getC()
     */
    public boolean equals(FuncionCuadratica other) {
        return (a==other.getA() && b==other.getB() && c==other.getC());
    }

}    
