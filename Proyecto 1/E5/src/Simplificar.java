/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Simplificar{
	
	public static int maxcd(int a, int b){
		int mcd,bandera;
		bandera = 0;
		mcd = 0;
		while(bandera == 0){
			mcd = a%b;
			if(mcd == 0){
				mcd=b;
				bandera = 1;
			}else{
				a = b;
				b = mcd;
			}
		}
		return mcd; 
	}

	public static int simplificalo(int numero,int mcd){
		double nu;
		nu = ((double)numero)/((double)mcd);
		return (int)nu;
	} 
}
