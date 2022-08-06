package fluxo_de_dados;

import java.io.File;

public class CopiaBinarioMain {

	public static void main(String[] args) {
		
		File entrada = new File ("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/PapaLeguas.jpg");
		File saida = new File ("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/Copia_PapaLeguas.jpg");
		System.out.println("Iniciando Cópia...");
		CopiaBinario.copia(entrada, saida);
		System.out.println("Cópia realizada com sucesso!");
	}

}
