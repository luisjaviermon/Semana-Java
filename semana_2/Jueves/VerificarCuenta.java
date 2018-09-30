public class VerificarCuenta implements Runnable{
	private CuentaBanco cb = new CuentaBanco();
	private synchronized void hacerRetiro(int cantidad){
		if(cb.getBalance()>=cantidad){
			System.out.println(Thread.currentThread().getName() + " hace un retiro de " + cantidad);
			cb.retiroBancario(cantidad);
			System.out.println(Thread.currentThread().getName() + ": Retiro dealizado");
			System.out.println(Thread.currentThread().getName()+" su saldo es de " + cb.getBalance());
		}else{
			System.out.println("No hay suficientes fondos Sr. " + Thread.currentThread().getName());
			System.out.println("Su saldo actual es de "+cb.getBalance()) ;
		}
	}

	@Override
	public void run(){
		for(int i=0;i<3;i++){
			this.hacerRetiro(10);
			if(cb.getBalance() < 0){
				System.out.println("Cuenta sobregirada");
			}
		}
	}
}