/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Moto implements rueda{
	int numero;
	String tipo;
	public Moto(int numero,String tipo){
		this.numero = numero;
		this.tipo = tipo;
	}

	public void numero(int num){
		System.out.println("tengo "+num+" ruedas");
	}
	public void avanzar(){
		System.out.println("avanzo super rapido");
	}
	public void detener(){
		System.out.println("freno y derrapo");
	}
	public void info(String tipo){
		System.out.println("soy una "+tipo);
	}
}
