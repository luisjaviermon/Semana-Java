//con multihilos creara varios archivos y colocara el archivo un numero del 1 al 10

import java.util.*;
import java.io.*;

public class MultiplesArchivos extends Thread{

	final static String nom = "Arcivo_";
	final static String ext=".txt";
	int x;

	public MultiplesArchivos(int x){
		this.x=x;
	} 	
	

	Random rn = new Random();

	public void run(){
		String nombre=nom+x+ext;
		try{
			/*
			File f = new File("nombre de archivo");
			FileWriter fw = new FileWriter(f);
			BufferedWriter = bw = new BufferedWriter(fw);
			*/
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File (nombre)));

			for(int i=0;i<10;i++){
				Thread.sleep((rn.nextInt(10)+1)*10);
				System.out.println(i);
				bw.write("Numero: "+i);
				bw.newLine();
			}

			bw.close();
		}catch(Exception e){
			System.out.println("Error");
		} 
	}
}