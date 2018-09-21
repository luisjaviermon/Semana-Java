import java.util.ArrayList;

public class Listas{
	public static void main(String[] args) {
		//Las listas son dinamicas y ofrece metodos para su incercion y elimiacion
		ArrayList<String> names = new ArrayList<String>();
		/*Sintaxis de sus metodos
		name.add();//Agregar un elemento
		name.get();//obtener los elementos
		name.remove();//elimina un elemento
		name.set();//modifica un elemento
		name.size();//da el tamaño de la lista*/
		names.add("Pablo");
		names.add("Hernandez");
		names.add("Fuente de las luces no.23");
		System.out.println(names);
		System.out.println(names.get(1));
		names.set(0,"Jose");
		System.out.println(names + " " + names.size());
	}
}