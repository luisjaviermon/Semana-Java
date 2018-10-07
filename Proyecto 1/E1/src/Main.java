/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
		ArrayList<Animal> la = new ArrayList<Animal>();
		la.add(new Tigre("tigre","cebra","carnivoro"));
		la.add(new Cebra("cebra","pastito","hervivoro"));
		la.add(new Antilope("antilope","pastizal","hervivoro"));
		la.add(new Leon("leon","antilope","carnivoro"));
		la.get(3).comerAnimal(la.get(3).getTipo(),la.get(3).getNombre(),la.get(1).getTipo(),la.get(1).getNombre());
		la.get(0).comerAnimal(la.get(0).getTipo(),la.get(0).getNombre(),la.get(2).getTipo(),la.get(2).getNombre());
		la.get(0).comerAnimal(la.get(0).getTipo(),la.get(0).getNombre(),la.get(3).getTipo(),la.get(3).getNombre());
		la.get(1).jugar(la.get(1).getTipo(),la.get(1).getNombre(),la.get(3).getTipo(),la.get(3).getNombre());
		la.get(2).jugar(la.get(2).getTipo(),la.get(2).getNombre(),la.get(1).getTipo(),la.get(1).getNombre());

	}
}
