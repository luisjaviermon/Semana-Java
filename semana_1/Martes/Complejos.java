import java.util.Scanner;

public class Complejos{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		CalComplejos c1 = new CalComplejos();
		c1.PedirZ1();
		c1.PedirZ2();


		System.out.println("***Menu***\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n5)Angulo\n6)Modulo\n7)Cambiar numeros\n8)Salir\nCual es su seleccion?");
		int opc = teclado.nextInt();

		switch(opc) {
			case 1:
			System.out.println("\nSelecciono suma\n");
			c1.Suma();
			if(c1.getIm() < 0){
			System.out.println("Resultado: " + c1.getReal() + " " + c1.getIm() + "i");
			}else{
				System.out.println("Resultado: " + c1.getReal() + "+" + c1.getIm() + "i");
			}
			break;

			case 2:
			System.out.println("\nSelecciono resta\n");
			c1.Resta();
			if(c1.getIm() < 0){
			System.out.println("Resultado: " + c1.getReal() + " " + c1.getIm() + "i");
			}else{
				System.out.println("Resultado: " + c1.getReal() + "+" + c1.getIm() + "i");
			}
			break;

			default: System.out.println("Opcion no conocida, intentalo de nuevo");
		}

	}
}