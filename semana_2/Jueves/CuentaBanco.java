public class CuentaBanco{
	private int balance = 50;
	//public CuentaBanco(){}
	int getBalance(){//Aqui asemeja a una consulat de saldo
		return balance;
	}
	public void retiroBancario(int retiro){//representa el retiro del banco
		balance -=retiro; 
	}
}