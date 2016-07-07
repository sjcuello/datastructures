public interface Cola {
    
    public abstract boolean esVacia();
    
    public abstract void vaciar();
    
    public abstract int longitud();
    
    public abstract void encolar(Object item) throws ExcepcionCola;
    
    public abstract void desencolar() throws ExcepcionCola;
    
    public abstract Object primero() throws ExcepcionCola;

    public abstract boolean repOK();    
}
