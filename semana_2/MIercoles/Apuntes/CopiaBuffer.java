import java.io.*;
import java.util.Scanner;

public class CopiaBuffer{
	public void copia(){
	try{
			File f = new File("pescritura.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);//Se crea un buffer para escribir en archivo  
			String linea;

			File archivo = new File("archivocopia.txt");
			FileWriter fw = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while((linea = br.readLine())!=null){
				bw.write(linea+"\n");
			}

			br.close();
			fr.close();
			bw.close();
			fw.close();

		}
		catch(IOException e){}
	}	
}