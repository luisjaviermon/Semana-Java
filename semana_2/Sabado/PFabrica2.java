public class PFabrica2 implements FabricaAbstracta{
	public IFabrica2 age1(String destino){
		if (destino.equals("agencia 1")){
			return new A1();
		}
		if(destino.equals("agencia 2")){
			return new A2();
		}
		return null;
	}

	public IFabrica visitas(String destino){
		return null;
	}
	
}