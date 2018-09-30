public class Enumeracion{
	public enum Semana{
		Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
	}

	public static void main(String[] args) { //ma + tab
		Semana s = Semana.Lunes;
		System.out.println("Hoy es " + s.name());
		//s.values();//Regresa un arreglo con todos los valores del enum
			for (Semana f:s.values()){ //for la variable f del tipo Semana en los valores de s
				System.out.println("Hoy es " + f.toString());//Concatenamos con + la convercion del valor en String que recorre la var aux f
			}

		String cad1=new String("hola");//String cad1= "hola";
		String cad2= "hola";
		if(cad1==cad2){
			System.out.println("Son iguales con ==");
		}

		if(cad1.equals(cad2)){
			System.out.println("Son iguales con equals");
		}
	}
}
