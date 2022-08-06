package fluxo_de_dados;
import java.io.File;

public class Teste_Pastas {

	public static void main(String args[]) {

		// NO WINDOWS USAR '\\' PARA REPRESENTAR CAMINHO
		File arquivo = new File("/mnt/DADOS/TORRENT/# CURSOS/Formação Java Completo/01_Java SE");

		// OBTENDO INFORMAÇÕES
		System.out.println("Caminho: " + arquivo.getAbsolutePath());
		System.out.println("É um Diretório? ->  " + arquivo.isDirectory());
		System.out.println();

		// OBTENDO PASTAS
		String[] lista = arquivo.list();
		int j = 1;

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Jogo " + j + ": " + lista[i]);
			j++;
		}
	}
}
