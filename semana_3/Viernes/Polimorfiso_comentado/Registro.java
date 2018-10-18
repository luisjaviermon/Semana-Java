import java.util.Scanner;
import java.util.ArrayList;

public class Registro{

	static Scanner sc = new Scanner(System.in);
	static String nombreAux;
	static double sueldoAux;
	static String infoExtra;

	public static void main(String[] args) {
		ArrayList<Empleado> registro = new ArrayList<Empleado>();
		int op;
		boolean bandera=true;

		System.out.println("REGISTRO DE PERSONAL\n");

		do{
			System.out.println("Registrar: \n1)Coordinador\n2)Maestro\n");
			op=sc.nextInt();
			sc.nextLine();
			if(op==1){
				pedirDatos();
				System.out.println("\nDepartamento: ");
				infoExtra=sc.nextLine();
				registro.add(new Coordinador(nombreAux,sueldoAux,infoExtra));

			}else if(op==2){
				pedirDatos();
				System.out.println("\nMateria: ");
				infoExtra=sc.nextLine();
				registro.add(new Maestro(nombreAux,sueldoAux,infoExtra));
			}
			System.out.println("\nRegistrar mas\n1)Si\n2)No\n");
			op=sc.nextInt();
			sc.nextLine();
			if(op==2){
				bandera=false;
			}

		}while(bandera);

		System.out.println("\nEMPLEADOS REGISTRADOS:\n");

		for(Empleado emp:registro){
			System.out.println(emp.toString());
		}

		System.out.println("\nLos empleados ya etsan trabajando\n");

		for(Empleado emp:registro){
			emp.trabajar();
		}

		System.out.println("\nIngreese el ID del empleado que quiere que de asesoria\n");

		int nEmp=sc.nextInt();
		sc.nextLine();
		System.out.println("\nCuantas horas va a dar?\n");
		int horas=sc.nextInt();
		sc.nextLine();

		registro.get((nEmp-1)).darAsesoria(horas);
		System.out.println("\nComo va el alumno\n?");
		registro.get((nEmp-1)).darSeguimiento();

		System.out.println(registro.get((nEmp-1)).toString());
	}

	public static void pedirDatos(){
		System.out.println("\nNombre:");
		nombreAux=sc.nextLine();
		System.out.println("\nSueldo:");
		sueldoAux=sc.nextDouble();
		sc.nextLine();
	}

}