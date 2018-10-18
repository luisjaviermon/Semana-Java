public class Ejemplo{
	public static void main(String[] args) throws InterruptedException{
		Proceso hilo1 = new Proceso("Hilo1");
		Proceso hilo2 = new Proceso("Hilo2");
		hilo1.setMensaje("mensaje del hilo1");
		hilo2.setMensaje("mensaje del hilo2");
		hilo1.start();
		//hilo1.join();//espera a que se termine el proceso para poder seguir con el siguiente hilo
		hilo2.start();
	}
}