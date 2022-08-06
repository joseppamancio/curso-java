package fluxo_de_dados;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LendoArquivo {

	public static void main(String args[]) {

		// NO WINDOWS USAR '\\' PARA REPRESENTAR CAMINHO
		File arquivo = new File("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/Teste.txt");

		// OBTENDO INFORMAÇÕES
		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("Caminho: " + arquivo.getAbsolutePath());
		System.out.println("Arquivo Existe? ->  " + arquivo.exists());
		System.out.println("É um Diretório? ->  " + arquivo.isDirectory());
		System.out.println("É um Arquivo?   ->  " + arquivo.isFile());
		System.out.println("Pode ser lido?  ->  " + arquivo.canRead());
		System.out.println();
		// System.out.println("PASTAS -> " + arquivo.listFiles());

		// OBTENDO DISCOS
		File[] discos = File.listRoots();

		for (int i = 0; i < discos.length; i++) {
			System.out.println("Disco " + i + ":" + discos[i]);
		}
		System.out.println();

		// LENDO ARQUIVO
		String temp = ler(arquivo);
		System.out.println(temp);
	}

	// LEITURA DO ARQUIVO
	public static String ler(File arquivo) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader leitura = new FileReader(arquivo);
			int c;
			do {
				c = leitura.read();
				if (c != -1) {
					sb.append((char) c);
				}
			} while (c != -1);
			leitura.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
