import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class EjHasMap{
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"valor uno");
		map.put(2,"valor dos");
		map.put(3,"valor tres");
		map.put(4,"valor cuatro");

		Iterator it = map.keySet().iterator();
		Integer key;

		while(it.hasNext()){//mientras it pueda apuntar a la clave de un elemento
			key = (Integer)it.next();
			System.out.println("clave: " + key + "\nValor: " + map.get(key));//imprimimos la clave almacenada en key y el valor que relaciona esa clave
		}
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.get(4));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("valor uno"));
	}
}