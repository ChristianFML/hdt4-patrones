/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 17 de agosto del 2016
 * Descripción: esta clase aloja el patron de diseño, AbstractFactory 
 */

public class AbstractFactory<E> {
    
    public Stack<E> getStack(String tipo){
		switch(tipo){
		case("ArrayList"):
			return new ArrayLista<E>();
		case("Vector"):
			return new Vector<E>();
		case("List"):
			return new Lista<E>();
		
		default:
			System.out.println("Error.Saliendo del programa.");
			System.exit(0);
			return null;
		}
	}
}

