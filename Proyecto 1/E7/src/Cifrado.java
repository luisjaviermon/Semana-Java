/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*author proteco
 */
import java.util.Scanner;
public class Cifrado{
	public static void main(String[] args) {
		if(args.length > 0){
		System.out.println(args[0]);
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese palabra -> ");
		Cesar c1 = new Cesar(s.nextLine());
		if(args[0].equals("1")){
		System.out.println("Cadena cifrada -> " + c1.cifrar());
		}else if(args[0].equals("0")){
			System.out.println("Cadena descifrada -> " + c1.descifrar());
		}else{
			System.out.println("argumento no valido (0 para descifrar o 1 para cifrar)");
		}
		}else{
			System.out.println("favor de inclur la bandera correspondiente (0 para descifrar o 1 para cifrar)");
		}
	}
}
