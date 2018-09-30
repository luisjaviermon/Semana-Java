public class Main{ //Compila todas las clases que utiliza
	public static void main(String[] args) {
		final int constante=5;//Genera constantes
		Persona p1 = new Persona(); //Creamos un nuevo obj
		Persona p2 = new Persona(30, "Mario"); //Usando un metodo constructor

		p1.respirar();//Accede al metodo respirar

		//p1.edad=25; si es privada la var sale error

		System.out.println(Persona.getContador()); //pl + tab

		p1.setEdad(20);
		p1.setNombre("Jorge"); //Se reciben los datos para el obj

		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());//Iprimimos el valor del obj

		System.out.println(Persona.getContador());		
	}
}