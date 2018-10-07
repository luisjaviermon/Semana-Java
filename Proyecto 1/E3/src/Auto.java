/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Auto implements rueda{
	int numero;
	String tipo;
	public Auto(int numero,String tipo){
		this.numero = numero;
		this.tipo = tipo;
	}

	public void numero(int num){
		System.out.println("tengo "+num+" ruedas");
	}
	public void avanzar(){
		System.out.println("avanzo muy rapido");
	}
	public void detener(){
		System.out.println("frene de repente ");
	}
	public void info(String tipo){
		System.out.println("soy un "+tipo);
	}
}
