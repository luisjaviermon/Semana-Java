import java.util.*;

public class Pila{
	public static void main(String[] args) {
		//PILA
		Stack pila = new Stack(); //Declaración de la pila
		pila.push("elemento 1"); //para añadir el elemento 1 a la pila
		pila.push("elemento 2");//para añadir el elemento 2 a la pila

		Object objetoTope = pila.peek(); //peek es el tope de la pila

		int indice = pila.search("elemento 2"); //va a regresar el índice 2, pues el índice aumenta conforme se añaden weas

		pila.pop(); //bota el elemento del tope de la pila y nos lo da.

		Object entrega = pila.pop(); //entrega es el último elemento de la pila
		
		// objetoTope = pila.peek(); //se verifica el nuevo tope de la pila

		//Para el ArrayDeque

		Deque arregloDoble = new ArrayDeque();

		arregloDoble.add("Primer elemento"); //se añade un elemento al array Deque

		arregloDoble.addFirst("ElementoUno"); //añade un elemento al inicio de la cola doble
		arregloDoble.addLast("ElementoFinal"); //añade un elemento al final de la cola doble


		//COLA
		Queue cola = new LinkedList();

		cola.add("Elemento1");
		cola.add("Elemento2");

		//SET
		Set<Integer> unSet = new HashSet(); //Además del HashSet (rápido) existe TreeSet (ordenado y un poco más lento). Set está restringido, no puede haber elementos repetidos.
		unSet.add(2);

		//MAP, HASHMAP
		Map<String,String> unMap = new HashMap<String,String>();


		unMap.put("clave1","elemento1");//con put se colocan nuevos elementos
		unMap.put("clave2","elemento2");

		unMap.remove("clave2");//con remove se usa la clave del elemento a borrar

	}

}