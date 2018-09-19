import java.util.Scanner;

public class Complejos{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		CalComplejos c1 = new CalComplejos();


		System.out.println("***Menu***\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n5)Angulo\n6)Modulo\n7)Cambiar numeros\n8)Salir\nCual es su seleccion?");
		int opc = teclado.nextInt();

		switch(opc) {
			case 1:
			System.out.println("\nSelecciono suma\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Suma();
			c1.impRes();
			break;

			case 2:
			System.out.println("\nSelecciono resta\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Resta();
			c1.impRes();
			break;

			case 3:
			System.out.println("\nSelecciono Multiplicacion\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Mult();
			c1.impRes();
			break;

			case 4:
			System.out.println("\nSelecciono Division\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Div();
			c1.impRes();
			break;			

			case 5:
			System.out.println("\nSelecciono Division\n");
			c1.PedirZ1();
			System.out.println("Arguento = " + c1.Ang());
			break;

			case 6:
			c1.PedirZ1();
			System.out.println("Modulo = " + c1.Mod());
			break;

			case 7:
			System.out.println("desea Cambiar 1 numero o 2?");
			opc = teclado.nextInt();
			if(opc==1){
				c1.PedirZ1();
			}
			if(opc==2){
				c1.PedirZ1();
				c1.PedirZ2();
			}
			break;

			default: System.out.println("Opcion no conocida, intentalo de nuevo");
		}

	}
}