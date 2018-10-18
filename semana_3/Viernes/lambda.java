interface PruebaValor{
	boolean hacerPrueba(int x);
}

public class Lambda{
	public static void main(String[] args) {
		PruebaValor esPar = (x) -> (x%2)==0; //a la funcion hacerPrueba  de la intarfaz le asigna una serie de acciones 
		PruebaValor esNegativo = (x) -> (x<0);
		System.out.println(esPar.hacerPrueba(5));
		System.out.println(esNegativo.hacerPrueba(-4));
	}
}