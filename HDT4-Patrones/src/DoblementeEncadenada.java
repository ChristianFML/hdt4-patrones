/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: implementacion de lista como una lista doblemente encadenada
 * @param <E> generico
 */

public abstract class DoblementeEncadenada<E> extends AbstractList<E>{

    /**
     * almacena 
     */
    protected int count;

    /**
     * almacena la referencia de quien es el primer elemento
     */
    protected DoblementeEncadenadaNodo<E> head;

    /**
     * almacena la referencia de quien es el ultimo elemento
     */
    protected DoblementeEncadenadaNodo<E> tail;

    /**
     * Construye una lista vacia
     */
    public DoblementeEncadenada()
    {
        head = null;
        tail = null;
        count = 0;
    }


    /**
     * pre: la lista no debe estar vacia
     * @param value valor
     * asigna el elemento a la cabeza de la lista
     */
    @Override
    public void addFirst(E value)
    {
        // construct a new element, making it head
        head = new DoblementeEncadenadaNodo<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    /**
     *
     * @param value se agrega al final de la lista
     */
    @Override
    public void addLast(E value)
    {
        // construct new element
        tail = new DoblementeEncadenadaNodo<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

/* *******************************************************************************************************************************
 * ********************* CODIGO ORIGINAL, REVISAR ********************************************************************************   
 * *******************************************************************************************************************************
 * public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();      <-------
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);      <-------
   }
   count--;
   return temp.value();         <-------
}
 * ************************************************************************************************************************************
 * ***********************************************************************************************************************************/
    /**
     * pre: las lista no debe estar vacia
     * @return el ultimo elemento de la lista y lo borra
     */
    @Override
    public E removeLast()
    {
        DoblementeEncadenadaNodo<E> temp = tail;
        tail = tail.previousElement;
        if (tail == null) {
            head = null;
        } else {
            tail.nextElement = null;
        }
        count--;
        return temp.data;
    }
}