/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.Scanner;
public class Matriz{
	int orden;
	int mat[][];
	Scanner scn = new Scanner(System.in);
	public Matriz(int ord){
		orden = ord;
		mat = new int [ord][ord]; 
	}
 	

 	public void llenar(){
 		for(int i = 0 ; i<orden;i++){
 			for(int j=0;j<orden;j++){
 				System.out.print("Ingrese elemento ["+(i+1)+"]"+"["+(j+1)+"]: ");
 				mat[i][j]=scn.nextInt();
 			}
 		}
 	}
 	
 	public void mostrar(){
 		System.out.println();
 		for(int i = 0 ; i<orden;i++){
 			for(int j=0;j<orden;j++){
 				System.out.print(mat[i][j]+"\t");
 			}
 			System.out.println();
 		}
 	}

 	public int det(int orden,int[][] mat)
	{
    	int determinante;
    	if(orden==2)
    	{
        	determinante=(mat[0][0]*mat[1][1])-(mat[1][0]*mat[0][1]);
        	return determinante;
    	}
    int suma=0;
    for(int i=0; i<mat.length; i++){
    int[][] nm=new int[mat.length-1][mat.length-1];
        for(int j=0; j<mat.length; j++){
            if(j!=i){
                for(int k=1; k<mat.length; k++){
                int indice=-1;
                if(j<i)
                indice=j;
                else if(j>i)
                indice=j-1;
                nm[indice][k-1]=mat[j][k];
                }
            }
        }
        if(i%2==0)
        suma+=mat[i][0] * det(orden-1,nm);
        else
        suma-=mat[i][0] * det(orden-1,nm);
    }
    return suma;
}
 	
}
