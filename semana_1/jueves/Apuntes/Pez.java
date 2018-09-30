public class Pez extends Animal{
	public pez(){
		super(new Escamosa(), tamano, color, new Ojos(colorOjos, 2));
	
	}

	public void avanzar(){
		System.out.println("nado a mi destino");
	}
}