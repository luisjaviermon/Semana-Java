import java.util.Scanner;
public class Main_EE{
	public static void main(String[] args){ //throws EdadExcepcion{ //En este caso muestra el errror de la forma que hereda de exception
		final int MAX = 30;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa tu edad: ");
		int edad = sc.nextInt();
		try{ //Si se usa try lo que hace es tratarlo desde el metodo
		if(edad < MAX){
			System.out.println("Holi");
		}else{
			throw new EdadExcepcion("Ocurrio un error en la edad");
		}}catch(EdadExcepcion ea){
			System.out.println(ea.toString());
		}
	}
}