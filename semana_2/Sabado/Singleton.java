public class Singleton{
	private static Singleton obj;//Hacemos que la variable solo se pueda acceder solo desde la clase

	public static Singleton creacion(){
		System.out.println("***Ejemplo de patron Singleton");
		if(obj == null){
			System.out.println("el objeto no se ha instaciado, se crea ahorita...");
			obj = new Singleton();
			return obj;
		}
		return obj;
	} 
}