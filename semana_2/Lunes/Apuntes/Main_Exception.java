public class Main_Exception{

	private void metodoB() throws Exception{ //Esto funciona si lo que queremos es no tratar la excepcion en el mismo metodo
		try{
			int division = 1/0;
		}catch(Exception e ){
			throw new Exception("Enviando Excepcion");
		}
	}

	private void metodoA(){
		try{
			metodoB();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		/*try{
			Excepcion prueba = new Excepcion(0,0);
			prueba.divide();
		}catch(ArithmeticException ae){
			//System.out.println("No se puede dividir entre cero" + ae.getMessage());//ae es un objeto de tipo excepcion
			System.out.println("Error: " + ae.getMessage());//toString() muestra la informacion completa y getMessage() solo el porque de la excepcion 
		}

		catch(Exception e ){ //Debido a la jerarquia de excepcion no permite que se coloque una excepcion encima de otra mayor, si se coloca abajo no sale error pero no lo muestra
			System.out.println("Error2");

		}finally{
			System.out.println("Esto se ejecuta aun con la excepcion");
		}*/

		//Relacionado con throw
		Main_Exception Prueba = new Main_Exception();
		Prueba.metodoA();


	}
}