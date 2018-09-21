public class Teinda(){
	private String direccion;
	private double dinero;
	private int c_prod=0;
	private int c_emp=0;
	public Teinda(String direccion, double dinero){
		this.direccion = direccion;
		this.dinero = dinero;

	}

	public void aumentaP(){
		c_prod++;
	}

	public void aumentaE(){
		c_emp++;
	}

	public String getDireccion(){
		return this.direccion;
	}
	public double getDinero(){
		return this.dinero;
	}
}
