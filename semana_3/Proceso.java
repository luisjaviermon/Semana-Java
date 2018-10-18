//hilo: proceso ligero, ya que se quiere simular una ejecucion multiple (concurrente)



//estados deun hilo
/* en espera: espera a que ocurra (wait)
dormido: para sus acciones por cierto tiempo (sleep)
suspendido: para toda accion con metodo (suspend) hasta aparecer un resume
bloqueado: suspende acciones pero referido a eventos
yield(): una pausa en la que el hilo no termino su tarea pero espera su momento para poder continuar*/


public class Proceso extends Thread{
	String mensaje;
	//llamamos al constructor de la clase padre y le damos nombre al hilo
	public Proceso(String nombre){
		super(nombre);
	}

	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}

	//en run() se usa para poder colocar las acciones que hara el hilo, esta dentro de la interfaz Runnable
	
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println("numero de iteracion: "+i+" "+mensaje);
		}
		System.out.println("fin del hilo" + this.getName());
	}

}    