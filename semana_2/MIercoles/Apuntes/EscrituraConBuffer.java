import java.io.*;
import java.util.Scanner;

public class EscrituraConBuffer{
	public void escribe(){
		String cadena;
		File archivo;
		FileWriter fw;
		BufferedWriter bw;
		try{
			archivo = new File("pescritura.txt");
			fw = new FileWriter(archivo, true);
			bw = new BufferedWriter(fw);//Se crea un buffer para escribir en archivo  
			Scanner teclado = new Scanner(System.in);
			do{
				cadena = teclado.nextLine();
				bw.write(cadena+"\n");
			}while(!cadena.equals("adios"));
			bw.flush();
			bw.close();
			fw.close();

		}
		catch(IOException e){}
	}
}