import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintStream;
import java.io.DataOutputStream;

public class Servidor extends Thread{
	private String nombreCliente;
	private BufferedReader entrada;
	private PrintStream salida;

	public Servidor(Socket s) throws IOException{
		entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));//recibe el flujo de datos del socket cliente
		salida = new PrintStream(s.getOutputStream());
		nombreCliente = s.getInetAddress().getCanonicalHostName();
		System.out.println("Conexion aceptada desde "+s.getRemoteSocketAddress());//obtenemos la ip del socket
	}

	public String recibir() throws IOException{
		String str = entrada.readLine();
		return str;
	}

	public void cerrar() throws IOException{
		entrada.close();
	}

	@Override
	public void run(){
		try{
			salida.println("bienvenido");
			String str = "";
			while(!str.equals("salir")){
				str = recibir();//obtiene lo enviado por el cliente
				System.out.println(nombreCliente +" dice "+str);
				salida.println("men");
			}
		}catch(IOException e){
			System.out.println("se cerro la conexion con "+nombreCliente);
		}finally{
			try{
				cerrar();
			}catch(IOException e){}
		}
	}

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(9998);//lo unico que necesita es el pueto en el cual aceptara la conexion
		System.out.println("el puerto "+ss.getLocalPort()+" esta aceptando conexiones");
		while(true){
			Socket cliente = ss.accept();//suspende(espera) el proceso hasta encontrar una connexion(espera nuevas conexiones)
			Servidor hilo = new Servidor(cliente);//encontrada crea el hilo para darle el servicio
			hilo.start();//inicia el servicio unico para el cliente
		}
	}
}