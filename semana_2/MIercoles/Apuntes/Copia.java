import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Copia {
	public static void main(String args[]) {
		FileInputStream  desdeF = null;//Archivos que tendran los archivos (el original y la copías) 
		FileOutputStream hastaF = null;
		try { 
			desdeF = new FileInputStream("imagen.jpg");//Declaramos un obj y a este le damos el nombre de la imagen
			hastaF = new FileOutputStream("img2.jpg");
		// Copia de los bytes
			int i = desdeF.read(); //lee un unico caracter (osease lee un bit del archivo original) (read() lee caracteres unicode o binarios)
			System.out.println(i);
			while (i != -1) { //Mientras se pueda almacenar un bit del archivo original 
		// -1 si se alcanza el fin de fichero 
				hastaF.write(i);//Escribe la copia del bit en el archivo
				i = desdeF.read();//Lee un siguiente 
			}
			desdeF.close();
			hastaF.close();//cerramos el flujo de datos (similar a eliminar el enlace en un archivo )
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Uso: Copia <origen> <destino>");//la ruta esta equivocada
		} 
		catch (FileNotFoundException e) { //no existe el archivo 
			System.err.println("No existe " + e);
		} 
		catch (IOException e) { //error en el flujo de datos
			System.err.println("Error de E/S " + e);
		} 
	}
}