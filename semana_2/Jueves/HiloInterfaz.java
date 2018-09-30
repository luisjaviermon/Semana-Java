class Hilos implements Runnable{//La interface runnable contiene al metodo run()
	@Override
	public void run(){
		System.out.println("hola");
	}
}

public class HiloInterfaz{
	public static void main(String[] args) {
		//new Thread(new HiloInterfaz()).start();//usamos new Thread para poder tener las caracteristicas de thread y posteriormente lo iniciamos
		Thread t = new Thread(new Hilos());
		t.start();
	}
}