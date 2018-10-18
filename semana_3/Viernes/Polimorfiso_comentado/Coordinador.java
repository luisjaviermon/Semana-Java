public class Coordinador extends Empleado{
	private String departamento;

	public Coordinador(String nombre, double sueldo, String departamento){
		super(nombre,sueldo);
		this.departamento=departamento;
	}

	public void trabajar(){
		System.out.println(getNombre()+
			" dice: \nEstoy coordinando: "+this.departamento);
	}

	public String toString(){
		return "\nCoordinador\nNombre: "+getNombre()+"\nSueldo: "
		+getSueldo()+"\nDepartamento: "+this.departamento+"ID: "+getId(); 
	}
}