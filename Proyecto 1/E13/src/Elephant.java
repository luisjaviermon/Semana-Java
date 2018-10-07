/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Elephant extends Animal{
	public Elephant(String name,String sound){
		super(name,sound);
	}
	public void aSay(){
		System.out.println("And the "+name+" goes "+sound);
	} 
}
