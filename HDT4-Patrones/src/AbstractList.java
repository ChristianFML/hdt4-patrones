/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: abstract class para las distintas implementaciones, provee todos los metodos posibles a utilizar
 * @param <E> generico
 */

public abstract class AbstractList <E> implements List<E>{
    
    /**
     * Constructor de AbstractList
     */
    public AbstractList()
    {
    }

    /**
     *
     * @return verdadero si y solo si la lista no tiene elementos
     */
    @Override
    public boolean isEmpty()
    {
       return size() == 0;
    }
  
    /**
     * pre: el valor existe
     * @param value valor a buscar
     * @return verdadero si y solo si la lista contiene ese valor
     */
    @Override
    public boolean contains(E value)
    {
	return -1 != indexOf(value);
    }
}
