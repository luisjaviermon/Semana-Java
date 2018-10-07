/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Mouse extends Animal{
	public Mouse(String name,String sound){
		super(name,sound);
	}
	public void aSay(){
		System.out.println("And"+name+" goes "+sound);
	} 
}
