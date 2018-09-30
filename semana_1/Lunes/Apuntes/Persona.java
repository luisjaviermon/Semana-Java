public class Persona{
	private int edad; //al usar private solo se podra hacer cambios desde la clase
	private String nombre;
	static int cont=0; //Varible similar a un global al usar el mod static 

	public Persona(int edad, String nombre){ //Metodo constructor
		this.edad = edad;
		this.nombre = nombre;
		cont++;
	}

	public Persona(){}

	public void respirar(){ //Es un metodo que cualquiera accede, no regresa nada y se llama respira, la cual no recibe args
		System.out.print("Estoy repirando\n");
	} 

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre; //Hace referencia a la variable contenida en la variable 
		cont++;
	}

	public int getEdad(){ //get hace las devoluviones de algun valor
		return edad;
	}

	public void setEdad(int edad){ //set recibe y modifica variables
		this.edad = edad;
	}

	public static int getContador(){
		return cont;
	}
}