public class Main{
	public static void main(String[] args) {
			Teinda t1 = new Teinda("dir 1",4300.00);
			Teinda t2 = new Teinda("dir 2",6400.00);
			Teinda t3 = new Teinda("dir 3",3500.00);

			Empleado e1 = new Empleado("mario 1","cajero",3000.00);
			t1.aumentaP();
			Empleado e2 = new Empleado("mario 2","cajero",5000.00);
			t1.aumentaP();
			Empleado e3 = new Empleado("mario 3","cajero",7000.00);
			t1.aumentaP();
			Empleado e4 = new Empleado("mario 4","cajero",4000.00);
			t2.aumentaP();
			Empleado e5 = new Empleado("mario 5","cajero",8000.00);
			t2.aumentaP();
			Empleado e6 = new Empleado("mario 6","cajero",1000.00);
			t2.aumentaP();
			Empleado e7 = new Empleado("mario 7","cajero",3000.00);
			t3.aumentaP();
			Empleado e8 = new Empleado("mario 8","cajero",5000.00);
			t3.aumentaP();
			Empleado e9 = new Empleado("mario 9","cajero",59800.00);
			t3.aumentaP();

			Producto p1 = new Producto("product 1",32);
			t1.aumentaE();
			Producto p2 = new Producto("product 2",31);
			t1.aumentaE();
			Producto p3 = new Producto("product 3",43);
			t1.aumentaE();
			Producto p4 = new Producto("product 4",25);
			t2.aumentaE();
			Producto p5 = new Producto("product 5",75);
			t2.aumentaE();
			Producto p6 = new Producto("product 6",68);
			t2.aumentaE();
			Producto p7 = new Producto("product 7",68);
			t3.aumentaE();
			Producto p8 = new Producto("product 8",45);
			t3.aumentaE();
			Producto p9 = new Producto("product 9",378);
			t3.aumentaE();

			System.out.println(t1.getDireccion() + " " + t1.getDinero());
			System.out.println(t2.getDireccion() + " " + t2.getDinero());
			System.out.println(t3.getDireccion() + " " + t3.getDinero());

		}	
}
