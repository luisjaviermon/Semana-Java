/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Cat extends Animal{
	public Cat(String name,String sound){
		super(name,sound);
	}
	public void aSay(){
		System.out.println(name+" goes "+sound);
	} 
}
