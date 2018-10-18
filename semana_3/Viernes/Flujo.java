import java.util.*;
import java.util.stream.Collectors;

public class Flujo{
	static List<Integer> lista = new List<Integer>();  
	static List<String> lista2 = new List<String>();

	public static void main(String[] args) {
	 	List<Integer> lf = null;
	 	for(int i =0;i<10;i++){
	 		lista.add(i);
	 	}


	 //	ap   crea un flujo de dat  filtra la lista del tipo x con la cond     Agrupa el flujo a lo necesario 
	 //		       |							|								    |
	 	lf = lista.stream().filter(a -> Integer.valueOf(a)>5).collect(Collectors.toList());
	 	System.out.println(lf.toString());

	 	List <Integer> lf2 = null;

	 	lista2.add("Mexico");
	 	lista2.add("Canada");
	 	lista2.add("Marruecos");
	 	lista2.add("Chile");
	 	lista2.add("Canada");
	 	lista2.add("Mexico");

	 	lf2 = lista2.stream().filter(nombre -> nombre.charAt(0)=='M').collect(Collectors.toList());
	 	//lf2 = lista2.stream().distinct().collect(Collectors.toList());
	 	System.out.println(lf2.toString());
	 } 
}