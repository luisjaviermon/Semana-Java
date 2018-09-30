public class Transpuesta{
	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		int matriz_T[][] = new int [3][3];
		int valor = 1;
		int i;
		int j;
		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				matriz[i][j] = valor;
				System.out.print(matriz[i][j] + "\t");
				valor++;
			}
			System.out.print("\n");
		}

		System.out.println("\nMatriz Transpuesta");

		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				matriz_T[i][j]=matriz[j][i];
				System.out.print(matriz_T[i][j] + "\t");
				valor++;
			}
			System.out.print("\n");
		}
	}
}