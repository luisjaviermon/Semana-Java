public class ClasesEnvolventers{
	public static void main(String[] args){
		double a;	//Por defecto se utiliza el double para los reales
		Double b;
		b=new Double(a); //Aqui se usa un boxing, el valor del primitivo 'a' se guarda en la clse envolvente Double 
		Integer x=6;//El 6 se trata como un primitivo int que se usa para un boxing -> es = a Integer x=new Integer(6);
	}

}