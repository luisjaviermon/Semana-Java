public class Prueba{
	public static void main(String[] args) {
		VerificarCuenta vc = new VerificarCuenta();
		Thread hilo1 = new Thread(vc,"Poli");//el hilo ejecutara acciones en el obj vc con el nombre indicado
		Thread hilo2 = new Thread(vc,"Mayito");//el hilo igual ejecutara acciones en el obj vc con el mismo nombre

		hilo1.start();
		hilo2.start();
	}
}