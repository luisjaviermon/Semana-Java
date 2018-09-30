public class Patrones{
	public static void main(String[] args) {
		
		/*

		//Patron Singleton

		Singleton p1=Singleton.creacion();
		Singleton p2=Singleton.creacion();
		System.out.println(p1);
		System.out.println(p2);

		//Patron Fabrica

		PFabrica fabrica = new PFabrica();
		IFabrica viajero1 = fabrica.visitas("peru");
		IFabrica viajero2 = fabrica.visitas("colombia");
		viajero1.visitar();
		viajero2.visitar();

		PFabrica2 fabrica = new PFabrica2();
		IFabrica2 viajero1 = fabrica.age1("agencia 1");
		IFabrica2 viajero2 = fabrica.age1("agencia 2");
		viajero1.agencia();
		viajero2.agencia();

		*/

		//Patron fabrica abstracta
		FabricaAbstracta fa = PFabricaAbstracta.gFabrica("viajes");
		IFabrica ag = fa.visitas("peru");
		ag.visitar();

		FabricaAbstracta af = PFabricaAbstracta.gFabrica("agencia");
		IFabrica2 ga = af.age1("agencia 1");
		ga.agencia();

	}
}