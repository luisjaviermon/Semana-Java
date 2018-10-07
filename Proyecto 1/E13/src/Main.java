/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
		ArrayList<Animal> wdfs = new ArrayList<Animal>(); 
		wdfs.add(new Dog("Dog","Woof"));
		wdfs.add(new Cat("Cat","meow"));
		wdfs.add(new Bird("Bird","tweet"));
		wdfs.add(new Mouse("mouse","squeek"));
		wdfs.add(new Cow("Cow","moo"));
		wdfs.add(new Frog("Frog","croak"));
		wdfs.add(new Elephant("elephant","toot"));
		wdfs.add(new Duck("Ducks","quack"));
		wdfs.add(new Fish("fish","Woof"));
		wdfs.add(new Seal("seal","Woof"));
		for(int i =0; i<10;i++){
			wdfs.get(i).aSay();
		}
	}
}
