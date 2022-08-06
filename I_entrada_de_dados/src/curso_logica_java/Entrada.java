package curso_logica_java;

import java.io.IOException;

public class Entrada {
	
	public static void main (String [] args) throws IOException {
		String nome;
		
		System.out.print("Digite seu nome: ");
		byte [] valor = new byte [100];
		System.in.read(valor);
		nome= new String (valor);
		
		System.out.println("Seu nome é: " + nome);
	}

}
