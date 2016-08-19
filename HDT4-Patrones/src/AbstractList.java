/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: 
 */


import java.util.Vector;

public abstract class AbstractList <E> implements List<E>{
    
    public AbstractList()
    // post: does nothing
    {
    }

    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
       return size() == 0;
    }
  
    @Override
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
	return -1 != indexOf(value);
    }
    
    
}
