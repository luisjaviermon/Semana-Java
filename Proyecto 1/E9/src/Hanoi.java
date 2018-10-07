/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.Scanner;
public class Hanoi{
	public static void main(String[] args) {
		int nDiscos;
		Scanner scn = new Scanner(System.in);
		Torre t_a = new Torre("A");
		Torre t_b = new Torre("B");
		Torre t_c = new Torre("C");
		System.out.print("Cuantos discos seran? ");
		nDiscos = scn.nextInt();
		TorresHanoi.llenarTorre(nDiscos,t_a);
		TorresHanoi.pasos(nDiscos,t_a,t_b,t_c);
		}	
}
