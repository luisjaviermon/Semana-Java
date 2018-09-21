public class Reptil extends Animal{
	public Reptil(int tamano, String color,String colorOjos){
		super(new Escamosa(), tamano, color, new Ojos(colorOjos, 2));
	}
	public void avanzar(){
		System.out.println("camino muy bajo a mi destino");
	}
}