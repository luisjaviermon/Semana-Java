public class EProceso{
	public static void main(String[] args) throws InterruptedException {
		Proceso hilo1 = new Proceso("hllo 1");
		Proceso hilo2 = new Proceso("hilo 2");
		hilo1.setMensaje("Este es el mensaje del hilo 1");
		hilo2.setMensaje("Este es el mensaje del hilo 2");
		System.out.println(Thread.currentThread().getName());
		hilo1.start();//iniciamos hilo1
		hilo1.join();//Esperamos a que muera el hilo para seguir
		hilo2.start();//Iniciamos el hilo2
	}
}