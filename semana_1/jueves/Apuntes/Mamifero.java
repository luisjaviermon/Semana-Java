public class Mamifero extends Animal{
	public Mamifero(int tamano, String color, String colorOjos, int numOjos){
		super(new pelo(), tanano, color, new Ojos(colorOjos,numOjos));
	}

	public void avanzar(){
		System.out.println("camino a mi destino");
	}
}