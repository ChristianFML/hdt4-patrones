/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: funciona como nodos, a manera de referencia de elementos para la implementacion de doblemente encadenada, da las referencias
 * @param <E> generico
 */

public class DoblementeEncadenadaNodo<E>{

    /**
     * para almacenar el valor
     */
    protected E data;

    /**
     * para almacenar la referencia al elemento siguiente
     */
    protected DoblementeEncadenadaNodo<E> nextElement;

    /**
     * para almacenar la referencia al elemento anterior
     */
    protected DoblementeEncadenadaNodo<E> previousElement;

    /**
     * @param v valor
     * @param next referencia al elemento siguiente
     * @param previous referencia al elemento anterior
     * post: construye un nodo, asignadole al valor una referencia de los elementos siguiente y anterior
     */
    public DoblementeEncadenadaNodo(E v, DoblementeEncadenadaNodo<E> next, DoblementeEncadenadaNodo<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    /**
     * @param v valor
     * post: construye un unico elemento
     */
    public DoblementeEncadenadaNodo(E v)
    {
        this(v,null,null);
    }

}
