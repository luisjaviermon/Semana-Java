/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.Scanner;
public class Sfrac{
	public static void main(String[] args) {
		int a,b,mcd;
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese el numerador: ");
		a = s.nextInt();
		System.out.print("Ingrese el denominador: ");
		b = s.nextInt();
		System.out.print(a+"/"+b+" = ");
		mcd=Simplificar.maxcd(a,b);
		a = Simplificar.simplificalo(a,mcd);
		b = Simplificar.simplificalo(b,mcd);
		System.out.print(a+"/"+b+"\n");
	}
}
