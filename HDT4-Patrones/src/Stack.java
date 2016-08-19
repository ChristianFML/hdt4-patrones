/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: interfaz par las implementaciones del stack
 */

public interface Stack <E>{
    
    /**
     * 
     * @param item elemento a agregar
     * post: el elemto es agregado al final del stack
     */
    public void push(E item);
   
    /**
     * el stack no debe estar vacio
     * @return el ultimo elemento de la lista y lo borra
     */
    public E pop();
   
    /**
     * el stack no debe estar vacio
     * @return el ultimo elemento
     */
    public E peek();
   
    /**
     *
     * @return verdadero si y solo si el stacke esta vacio
     */
    public boolean empty();
   
    /**
     *
     * @return la cantidad de elementos en el stack
     */
    public int size();

    
}
