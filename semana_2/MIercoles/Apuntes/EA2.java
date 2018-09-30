import java.io.IOException;
import java.util.Scanner;
public class EA2{
	public static void main(String[] args) {
		EscrituraConBuffer prebes = new EscrituraConBuffer();
		CopiaBuffer prebesCopia = new CopiaBuffer();
		prebes.escribe();
		prebesCopia.copia();
	}
}