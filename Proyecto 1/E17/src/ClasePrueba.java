/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class ClasePrueba{
	String sp;
	int ip;
	public ClasePrueba(String si,double di,String sp,int ip){
		super(si,di);
		this.sp=sp;
		this.ip=ip;
	}

	public void mostrarTodo(){
		
		System.out.println("Estos es lo que hay\nde la padre: \n" + si + "\n" + di + "\nde la hija: \n" + sp + "\n" + ip);
		claseInservible.estatico();
	}

}
