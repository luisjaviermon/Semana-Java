/*socket: punto final de una conexion (nodo)

        ----------------------------->
cliente								   Servidor
        <-----------------------------
(socket)							  (socket)

para la conexion entre cliente y servidor se usara el protocolo TCP

los clientes srien los hilos que utilizan el servicio*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.Socket;

/* para este caso el socket necesita la direccion ip y el puerto para poder enviar info*/

public class Cliente{
	private PrintStream ps;
	private String host; //almacena la direccion ip
	private int port;//almacena el puerto

	public void setHost(String host){
		this.host = host;
	}

	public void setPort(int port){
		this.port = port;
	}

	public BufferedReader conectar(BufferedReader entrada) throws IOException{
		Socket s = new Socket(host,port);
		ps = new PrintStream(s.getOutputStream());
		entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
		return entrada;
	}

	public void enviar(String mensaje) throws IOException{
		ps.println(mensaje);//envia un flujo hacia la salida estandar (consola)

	}

	public void cerrar() throws IOException{
		ps.close();
	}

	public static void main(String[] args) throws IOException{
		BufferedReader teclado,entrada;
		String viene;
		teclado = new BufferedReader(new InputStreamReader(System.in));
		entrada = new BufferedReader(new InputStreamReader(System.in));
		Cliente c = new Cliente();
		System.out.print("Host: ");
		c.setHost(teclado.readLine());
		System.out.print("Puerto: ");
		c.setPort(Integer.parseInt(teclado.readLine()));
		entrada = c.conectar(entrada);
		String str = "";
		while(!str.equals("salir")){
			System.out.print("Mensaje: ");
			str = teclado.readLine();
			c.enviar(str);
			viene = entrada.readLine();
			System.out.println(viene);
		}
	}
}