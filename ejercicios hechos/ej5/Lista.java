/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */
/* Interface Lista: Interface que especifica el TAD Lista (polimorfico).    */
/* Las clases que implementan el TAD Lista deben implementar esta, y proveer*/
/* implementaciones para todos los metodos abstractos de la misma.          */
/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */
public interface Lista {

    public abstract boolean esVacia();

    public abstract void vaciar();

    public abstract int longitud();

    public abstract void insertar(int index, Object item);

    public abstract void insertar(Object item);

    public abstract void eliminar(int index);

    public abstract Object obtener(int index);

}
