/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Hervivoro implements Animal{ //utilizamos la interfaz hervivoro
	private String nombre;
	private String cfav;
	private String dieta;

	public Hervivoro(String nombre,String cfav,String tipo){
		this.nombre=nombre;
		this.cfav = cfav;
		this.dieta = tipo;
	}

	public void jugar(String t1,String a1,String t2,String a2){
		if(t1.equals(t2)){
			System.out.println(a1 + " juega con " + a2);
		}else{
			System.out.println(a1 + " no puede jugar con " + a2);
		}
	}

	public String getNombre(){
		return nombre; 
	}

	public String getComida(){
		return cfav;
	} 

	public String getTipo(){
		return dieta;
	}


	public void comerAnimal(String t1,String a1,String t2,String a2){}
}
