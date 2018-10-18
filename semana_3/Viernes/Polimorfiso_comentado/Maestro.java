public class Maestro extends Empleado{
	private String materia;

	public Maestro(String nombre, double sueldo, String materia){
		super(nombre,sueldo);
		this.materia=materia;
	}

	public void trabajar(){
		System.out.println(getNombre()+
			" dice: \nEstoy dando clase de: "+this.materia);
	}

	public String toString(){
		return "\nMaestro\nNombre: "+getNombre()+"\nSueldo: "
		+getSueldo()+"\nMateria: "+this.materia+"ID: "+getId(); 
	}

}