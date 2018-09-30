public class Proceso extends Thread{
	String mensaje;
	public Proceso(String nombre){
		super(nombre);
	}
	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}
	@Override //indica que se sobreescribira un metodo
	public void run(){ //Esta clase mostrara lo que deba hacer el hilo
		for (int i=0;i<10;i++){
			System.out.println("este es el mensaje "+i+" de "+this.getName());
		}
		//System.out.println(mensaje);
		System.out.println("Este hilo ha terminado: "+this.getName());//getName indica que 		
	}
}