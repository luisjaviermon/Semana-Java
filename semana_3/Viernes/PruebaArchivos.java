import java.util.*;

public class PruebaArchivos{
	public static void main(String[] args) {
		List<MultiplesArchivos> l=new ArrayList<MultiplesArchivos>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de archivos a crear: ");
		int k = sc.nextInt();
		for(int i = 0;i<k;i++){
			l.add(new MultiplesArchivos(i));
			l.get(i).start();
		}
	}
}