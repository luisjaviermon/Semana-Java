/**
*
* @author Carolina Rdriguez Avalos Prebe 20 
* @author Luis Javier Montiel Martinez Prebe 8   
*/
public class Cesar{
	private String palabra;
	public Cesar(String palabra){
		this.palabra = palabra;
	}
	public String cifrar(){
		char anterior, posterior;
		int limite = palabra.length();
		String copia=palabra;
		palabra="";
		for (int i = 0; i<limite;i++){
			anterior = copia.charAt(i);
			if(anterior!='l'){
				posterior = (char)((int)anterior+3);
			}else{
				posterior = (char)((int)'ñ');
			}
			palabra = palabra + posterior;
		}
		return palabra;
	}

	public String descifrar(){
		char anterior, posterior;
		int limite = palabra.length();
		String copia=palabra;
		palabra="";
		for (int i = 0; i<limite;i++){
			anterior = copia.charAt(i);
			if(anterior!='ñ'){
				posterior = (char)((int)anterior-3);
			}else{
				posterior = (char)((int)'l');
			}
			palabra = palabra + posterior;
		}
		return palabra;
	}
}
