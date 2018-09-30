public class PFabricaAbstracta{
	public static FabricaAbstracta gFabrica(String fabrica){
		if (fabrica.equals("agencia")){
			return new PFabrica2();
		}

		if (fabrica.equals("viajes")){
			return new PFabrica1();
		}
		return null;
	}
}