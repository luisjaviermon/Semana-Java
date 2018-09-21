public class Empleado(String nombre, String puesto,double sueldo){
	private String nombre;
	private String puesto;
	private double sueldo;
	public Empleado(String nombre, String puesto,double sueldo){
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldo = sueldo;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getPuesto(){
		return this.puesto;
	}

	public double getsueldo(){
		return this.sueldo;
	}
}
