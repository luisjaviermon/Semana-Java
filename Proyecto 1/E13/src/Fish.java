/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Fish extends Animal{
	public Fish(String name,String sound){
		super(name,sound);
	}
	public void aSay(){
		System.out.println("And "+name+" go "+sound);
	} 
}
