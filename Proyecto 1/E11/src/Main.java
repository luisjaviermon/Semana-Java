/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingrese el orden de la Matriz: ");
		Matriz m = new Matriz(scn.nextInt());
		m.llenar();
		m.mostrar();
		//System.out.println("\nEl determinante es: "m.det(m.orden,m.mat));
	}
}
