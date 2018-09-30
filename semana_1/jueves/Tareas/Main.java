import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Matriz m1 = new Matriz();
		int orden, opc=1;
		
		System.out.println("Ingrese el orden de la Matriz");
		orden=teclado.nextInt();

		m1.cMatriz(orden);
		m1.PeMatriz1(orden);
		m1.PeMatriz2(orden);
		m1.pMatriz(orden);
		while (opc!=0){
		System.out.println("\n\n***Menu***\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Transposicion\n5)Inversa\n6)Cambiar valores\n7)Salir\nCual es su seleccion?");
		opc = teclado.nextInt();

		switch(opc){
			case 1:
			System.out.println("\nSelecciono suma\n");
			m1.suma(orden);
			m1.impMat(orden);
			break;

			case 2:
			System.out.println("\nSelecciono resta\n");
			m1.resta(orden);
			m1.impMat(orden);
			break;

			case 3:
			System.out.println("\nSelecciono Multiplicacion\n");
			m1.multi(orden);
			m1.impMat(orden);
			break;

			case 4:
			m1.trans(orden);
			break;

			case 5:
			System.out.println("\nSelecciono matriz inversa\n");
			break;

			case 6:
			System.out.println("cambiando valores");
			m1.PeMatriz1(orden);
			m1.PeMatriz2(orden);
			break;
			case 7:
			opc = 0;
			break;	
		}
	}

	}
}