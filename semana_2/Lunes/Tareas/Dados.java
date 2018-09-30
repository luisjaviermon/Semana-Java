//Para la grafica se colocaran los elementos a base de espaciados
import java.util.Random;
public class Dados{
	public static void main(String[] args) {
		Random ale=new Random();
		int dado1, dado2, i,j,k=0,l=2000;
		int [][] tabla = new int [11][2];

		for(i=0;i<11;i++){
			tabla[i][0]=i+2;
			tabla[i][1]=0;
		}

		for(i=0;i<1000;i++){
			dado1= (int)(ale.nextDouble() * 6 + 1);
			dado2= (int)(ale.nextDouble() * 6 + 1);
			j=dado1 + dado2;
			tabla[j-2][1]+=1;
			//System.out.println(j);
		}
		System.out.println("\n----------------Tabla---------------\n\nSum.dados\t|\tVeces que aparecio\n-------------------------------------------");
		for(i=0;i<11;i++){
			System.out.print("     " + tabla[i][0] + "\t\t|\t\t" + tabla[i][1]);
			if (tabla[i][1]>k){
				k=tabla[i][1];
			}

			if (tabla[i][1]<l){
					l=tabla[i][1];
		}
			System.out.print("\n");
		}
		System.out.println("\nMaximo: " + k + " Minimo: " + l + "\n\n\n");
		for (i=k;i>(l-20);i-=5){
			for(j=0;j<11;j++){
				if(tabla[j][1]>=i){
					System.out.print("+++\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.print("\n");
		}

	}
}