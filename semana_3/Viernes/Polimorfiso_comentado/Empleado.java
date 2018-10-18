public abstract class Empleado implements Asesor{

	private String nombre;
	private double sueldo;
	private int idEmpleado;
	private static int contador=1;

	public Empleado(String nombre, double sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.idEmpleado=contador++;
	}

	public String getNombre(){
		return nombre;
	}

	public double getSueldo(){
		return sueldo;
	}

	public int getId(){
		return idEmpleado;
	}

	public abstract void trabajar();

	public void darAumento(double aumento){
		this.sueldo+=aumento;
	}

	public void darAsesoria(int horas){
		System.out.println(this.nombre+" dice: \nVOy a dar "
			+horas+"horas de asesoria");
		darAumento(precio*horas);
	}

	public void darSeguimiento(){
		System.out.println("\n El alumno va bien");
	}

}