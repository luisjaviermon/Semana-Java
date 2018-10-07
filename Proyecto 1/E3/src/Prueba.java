/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Prueba{
	public static void main(String[] args) {
		Moto moto = new Moto(2,"moto");
		Auto auto = new Auto(4,"auto");
		Bici bici = new Bici(2,"bici");
		moto.info(moto.tipo);
		moto.avanzar();
		moto.detener();
		moto.numero(moto.numero);

		auto.info(auto.tipo);
		auto.avanzar();
		auto.detener();
		auto.numero(auto.numero);

		bici.info(bici.tipo);
		bici.avanzar();
		bici.detener();
		bici.numero(bici.numero);
	}
}
