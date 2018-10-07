/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Bici implements rueda{
	int numero;
	String tipo;
	public Bici(int numero,String tipo){
		this.numero = numero;
		this.tipo = tipo;
	}

	public void numero(int num){
		System.out.println("tengo "+num+" ruedas");
	}
	public void avanzar(){
		System.out.println("avanzo de manera regular");
	}
	public void detener(){
		System.out.println("freno un poco despacio");
	}
	public void info(String tipo){
		System.out.println("soy una "+tipo);
	}
}
