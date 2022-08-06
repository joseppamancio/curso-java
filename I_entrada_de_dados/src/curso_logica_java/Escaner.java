package curso_logica_java;

import java.util.Scanner;

public class Escaner {

	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
	
	System.out.print("Digite seu nome: ");
	String nome = ler.nextLine();
	
	System.out.println("Seu nome é: "+nome);
	
	}
}
