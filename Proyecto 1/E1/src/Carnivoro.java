/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Carnivoro implements Animal{ // utilizamos la interface Animal
	private String nombre;
	private String cfav;
	private String dieta;

	public Carnivoro(String nombre,String cfav,String tipo){ //metodo contructor de la clase
		this.nombre=nombre;
		this.cfav = cfav;
		this.dieta = tipo;
	}

	public void comerAnimal(String t1,String a1,String t2,String a2){
		if(t1.equals(t2)){//en caso de ser animales del mismo tipo
			System.out.println(a1 + " no se puede comer a " + a2);
		}

		if(!(t1.equals(t2)) && t1.equals("carnivoro")){//si el primero es carnivoro y son de diferente tipo
			System.out.println(a1 + " se pude comer a " + a2);
		}else{
			System.out.println(a1 + " no se pude comer a " + a2);
		}
	}

	public String getNombre(){//metodo getter del nombre
		return nombre; 
	}

	public String getComida(){//metodo getter de la comida
		return cfav;
	} 

	public String getTipo(){//metodo getter del tipo
		return dieta;
	}


	public void jugar(String t1,String a1,String t2,String a2){}//lo colocamos debido a ser una interfaz
}
