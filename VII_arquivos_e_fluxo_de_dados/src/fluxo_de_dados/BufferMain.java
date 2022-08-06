package fluxo_de_dados;

import java.io.File;

public class BufferMain {

	public static void main(String args[]) {

		File entrada = new File("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/Teste.txt");
		File saida = new File("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/Copia_Buffer_Teste.txt");

		System.out.println("Iniciando Cópia...");
		
		//RECEBE STRING DA CLASSE E ARMAZENA
		String s = BufferDeLeitura.ler(entrada);
		
		//ENVIA STRING E GRAVA ARQUIVO SAIDA
		BufferDeEscrita.escrita(saida, s);
		
		System.out.println("Cópia realizada com sucesso!");
	}

}
