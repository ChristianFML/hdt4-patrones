/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: funciona como nodos, a manera de referencia de elementos para las implementaciones de lista
 * @param <E> generico
 */

public class Node <E>{
    
    /**
     * almacena el valor del elemento
     */
    protected E data;

    /**
     * referencia hacia el siguiente elemento
     */
    protected Node<E> nextElement;

    /**
     * pre: v existe, next si es referencia
     * @param v elemento
     * @param next referencia
     * post: el elemento se vuelve la cabez
     */
    public Node(E v, Node<E> next)
    {
       data = v;
       nextElement = next;
    }

    /**
     * @param v elemento
     * post: construye una nueva cola
     */
    public Node(E v)
    {
        this(v,null);
    }

    /**
     * @return una referencia al siguiente elemento
     */
    public Node<E> next()
    {
        return nextElement;
    }

    /**
     * @param next referencia
     * post: asigna esa referencia al siguiente elemento
     */
    public void setNext(Node<E> next)
    {
        nextElement = next;
    }

    /**
     * @return el valor asociado a ese elemento
     */
    public E value()
    {
         return data;
    }

    /**
     * @param value elemento
     * post: asigna ese valor 
     */
    public void setValue(E value)
    {
        data = value;
    }
}
