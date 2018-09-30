import java.util.Scanner;
import java.util.ArrayList;

public class Matriz{
	ArrayList<ArrayList<Double>> matriz_a = new ArrayList<ArrayList<Double>>();
	ArrayList<ArrayList<Double>> matriz_b = new ArrayList<ArrayList<Double>>();
	ArrayList<ArrayList<Double>> matriz_r = new ArrayList<ArrayList<Double>>();

	Scanner teclado = new Scanner(System.in);
	public void cMatriz(int orden){
		int i,j;
		for(i=0;i<orden;i++){
			matriz_a.add(new ArrayList<Double>());
			matriz_b.add(new ArrayList<Double>());
			matriz_r.add(new ArrayList<Double>());
		}
	}

	public void PeMatriz1(int orden){
		int i,j;
		System.out.println("\n***Matriz 1***\n");

		for (i=0;i<orden ;i++ ) {
			for(j=0;j<orden;j++){
				System.out.println("Ingrese el elmento" + "[" + (i+1) + "]" + "[" + (j+1) + "]");
				matriz_a.get(i).add(this.teclado.nextDouble());
			}
		}
	}

	public void PeMatriz2(int orden){
		int i,j;
		System.out.println("\n***Matriz 2***\n");

		for (i=0;i<orden;i++ ) {
			for(j=0;j<orden;j++){
				System.out.println("Ingrese el elmento" + "[" + (i+1) + "]" + "[" + (j+1) + "]");
				matriz_b.get(i).add(this.teclado.nextDouble());
				matriz_r.get(i).add(0.0);
			}
		}
	}

	public void pMatriz(int orden){
		int i,j;
		System.out.println("\nSus matrices son\n***Matriz 1***\n");
		for(i=0;i<orden;i++){
			for(j=0;j<orden;j++){
				System.out.print(matriz_a.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("***Matriz 2***\n");

		for(i=0;i<orden;i++){
			for(j=0;j<orden;j++){
				System.out.print(matriz_b.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
	}

	public void impMat(int orden){
		int i,j;
		System.out.println("***Matriz Resultante***\n");

		for(i=0;i<orden;i++){
			for(j=0;j<orden;j++){
				System.out.print(matriz_r.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}	
	}


	public void suma(int orden){
		int i,j;
		for (i=0;i<orden;i++ ) {
			for(j=0;j<orden;j++){
				matriz_r.get(i).set(j , matriz_a.get(i).get(j) + matriz_b.get(i).get(j));
			}
		}	
	}

	public void resta(int orden){
		int i,j;
		for (i=0;i<orden;i++ ) {
			for(j=0;j<orden;j++){
				matriz_r.get(i).set(j , matriz_a.get(i).get(j) - matriz_b.get(i).get(j));
			}
		}	
	}

	public void multi(int orden){
		int i,j;
		Double a = new Double(0.0);
		Double temp = new Double(0.0);
		for (i=0;i<orden;i++ ) {
			a=0.0;
			for(j=0;j<orden;j++){
				matriz_r.get(i).set(j , a+(matriz_a.get(i).get(j)*matriz_b.get(j).get(i)));
			}

		}	
	}

	public void trans(int orden){
		int i,j;
		System.out.println("\nMatriz Transpuesta");

		for (i=0;i<orden;i++){
			for(j=0;j<orden;j++){
				matriz_r.get(i).set(j,matriz_a.get(j).get(i)); 
				System.out.print(matriz_r.get(i).get(j) + "\t");
			}
			System.out.print("\n");
		}
	}


}

