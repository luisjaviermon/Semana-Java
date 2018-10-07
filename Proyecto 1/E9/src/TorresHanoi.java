/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
import java.util.Stack;
public class TorresHanoi{
	static int cont = 0;
	public static void llenarTorre(int num,Torre nTorre){
		for(int i = num;i>0;i--){
			nTorre.pilaTorre.push(new Disco(i));
			//System.out.println(((Disco)nTorre.pilaTorre.peek()).numDisk);
		}
		
	}

	public static void mover(Torre o,Torre d){
		d.pilaTorre.push(o.pilaTorre.pop());
		cont+=1;
		System.out.println(cont+".-mover disco "+o.lNombre+" a "+d.lNombre);
	}

	public static void pasos(int altura,Torre o,Torre d,Torre a){
		//System.out.println(o.lNombre+" "+d.lNombre+" "+a.lNombre);
		if(altura==1){
			TorresHanoi.mover(o,a);
		}else{
			TorresHanoi.pasos(altura-1,o,a,d);
			TorresHanoi.mover(o,a);
			TorresHanoi.pasos(altura-1,d,o,a);
		}
	}

}
