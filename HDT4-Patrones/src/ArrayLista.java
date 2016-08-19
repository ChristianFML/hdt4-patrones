/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: implementacion de stack como ArrayList
 */
import java.util.ArrayList;

public class ArrayLista<E> extends AbstractStack<E>{
    
    /**
     * variable data para atributo
     */
    protected ArrayList<E> data;

    /**
     * construye un nuevo ArrayList generico vacio
     */
    public ArrayLista()
    {
    	data = new ArrayList<E>();
    }

    /**
     * post: the value is added to the stack will be popped next if no intervening push
     * @param item
     */
    @Override
    public void push(E item)
    {
    	data.add(item);
    }

    /**
     * pre: stack is not empty
     * @return ultimo elemento del Stack y lo borra
     */
    @Override
    public E pop()
    {
    	return data.remove(size()-1);
    }

    /**
     * pre: stack is not empty
     * @return ultimo elemento del Stack
     */
    @Override
    public E peek()

    {
    	return data.get(size() - 1);
    }

    /**
     *
     * @return la cantidad de elementos en el Stack
     */
    @Override
    public int size()
    {
    	return data.size();
    }
  
    /**
     *
     * @return verdadero si y solo si el Stack esta vacio
     */
    @Override
    public boolean empty()
    {
    	return size() == 0;
    }
}