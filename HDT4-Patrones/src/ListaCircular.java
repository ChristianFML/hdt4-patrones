/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: implementacion de lista como una lista circular
 * @param <E> generico
 */

public abstract class ListaCircular<E> extends AbstractList<E>{
    
    /**
     * guarda la referencia del ultimo elemento
     */
    protected Node<E> tail; 

    /**
     * guarda el tamano de la lista
     */
    protected int count;

    /**
     * Construye una nueva lista circular
     */
    public ListaCircular()
    {
        tail = null;
        count = 0;
    }

    /**
     * @param value se agrega al inicio de la lista
     */
    @Override
    public void addFirst(E value)
    {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }


    /**
     * @param value se agrega al final de la lista
     */
    @Override
    public void addLast(E value)
    {
        addFirst(value);
        tail = tail.next();
    }


    // lo dificil es quitar el elemento de la cola

    /**
     * pre: las lista no debe estar vacia
     * @return el ultimo elemento de la lista y lo borra
     */
    @Override
    public E removeLast()
    {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
    // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {   
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }
    
}
