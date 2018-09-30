public class PFabrica{
	public IFabrica visitas(String destino){
		if (destino.equals("colombia")){
			return new Colombia();
		}
		if(destino.equals("peru")){
			return new Peru();
		}
		return new Npais();
	}

	public IFabrica2 age1(String destino){
		return null;
	}
}