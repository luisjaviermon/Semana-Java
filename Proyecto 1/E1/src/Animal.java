/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public interface Animal{
	//indicamos las funciones que se podran reescribir dependiendo del animal
	void jugar(String t1,String a1,String t2,String a2);//dira si pueden jugar
	void comerAnimal(String t1,String a1,String t2,String a2);//indica si los animales se pueden comer
	String getNombre();//obtenemos el nombre del animal
	String getComida();//obtenemos la comida del animal 
	String getTipo(); //obtenemos si es hervivoro o carnivoro
}

