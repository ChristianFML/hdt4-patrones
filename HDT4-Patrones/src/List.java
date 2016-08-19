/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: interfaz para las implementaciones de la lista
 * @param <E> generico
 */

public interface List <E> {
    
    /**
     * @return la cantidad de elementos en la lista
     */
    public int size();

    /**
     * @return verdadero si y solo si la lista no tiene elementos
     */
    public boolean isEmpty();

    /**
     * limpia la lista
     */
    public void clear();

    /**
     * @param value se agrega al inicio de la lista
     */
    public void addFirst(E value);

    /**
     * @param value se agrega al final de la lista
     */
    public void addLast(E value);

    /**
     * pre: la lista no debe estar vacia
     * @return el primer valor de la lista
     */
    public E getFirst();

    /**
     * pre: la lista no debe estar vacia
     * @return el ultimo elemento de la lista
     */
    public E getLast();

    /**
     * pre: la lista no debe etar vacia
     * @return el primer elemento y lo borra
     */
    public E removeFirst();

    /**
     * pre: las lista no debe estar vacia
     * @return el ultimo elemento de la lista y lo borra
     */
    public E removeLast();

    /**
     * @param value
     * @return el valor igual al preguntado y lo remueve, si no hay reresa null
     */
    public E remove(E value);

    /**
     * @param value se agrega a la cola de la lista
     */
    public void add(E value);

    /**
     * pre: la lista no debe estar vacia
     * @return el ultimo valor encontrado en la lista y lo quita
     */
    public E remove();

    /**
     * pre: la lista no debe estar vacia
     * @return el ultimo valor encontrado en la lista
     */
    public E get();

    /**
     * pre: el valor existe
     * @param value valor a buscar
     * @return verdadero si y solo si la lista contiene ese valor
     */
    public boolean contains(E value);

    /**
     * pre: el valor existe
     * @param value el valor a buscar
     * @return la posicion del valor
     */
    public int indexOf(E value);

    /**
     * pre: el valor existe
     * @param value
     * @return la posicion del valor o -1 si no existe
     */
    public int lastIndexOf(E value);

    /**
     * pre: la posicion esta dentro del rango de la lista
     * @param i posicion
     * @return el elemento correspondiente a esa posicion
     */
    public E get(int i);

    /**
     * pre: la posicion esta dentro del rango de la lista
     * @param i posicion
     * @param o elemento
     * set: el elemento en dicha posicion
     * @return el ultimo valor antiguo de esa posicion
     */
    public E set(int i, E o);

    /**
     * @param i posicion
     * @param o elemento
     * set: pone dicho elemento en la posicion dada
     */
    public void add(int i, E o);

    /**
     * @param i posicion, debe estar dentro del rango de la lista
     * @return el elemento de esa posicion y lo elimina
     */
    public E remove(int i); 
}
