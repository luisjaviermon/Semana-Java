public class Arreglos{
	public static void main(String[] args) {
		int[] arreglo_1;
		int arreglo_2[] = new int[10];//Forma de inicializar un arreglo, si no se coloca un valor manda una excepcion
		//arreglo_2[4] = 20;					//--
												//  |-formas de asignar un valor al arreglo 
		int arreglo_3[]= {1,2,3,4,5,6,7,8,9,10};//--
		int b=0;
		for(int i : arreglo_3){ //Si se va a usar este tipo de for se deve inicializar la var i
			arreglo_2[i-1]=b;
			System.out.println(arreglo_3[i-1] + " " + arreglo_2[i-1]);
			b++;
		}
		System.out.println("El arrego es de " + arreglo_2.length);
	}
}