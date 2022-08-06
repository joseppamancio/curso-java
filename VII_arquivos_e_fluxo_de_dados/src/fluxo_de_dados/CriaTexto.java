package fluxo_de_dados;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CriaTexto {

	public static void main(String args[]) {
		File arquivo = new File("/home/jose/eclipse-workspace/VII_arquivos_e_fluxo_de_dados/Teste.txt");

		//REXTO A SER ESCRITO
		String texto = "Teste de Ecrita Realizado com Sucesso!";
		escrever(arquivo, texto);
	}

	//ESCRITA DO ARQUIVO
	public static void escrever(File arquivo, String texto) {
		try {
			FileWriter escrita = new FileWriter(arquivo);
			char[] c = texto.toCharArray();

			for (int i = 0; i < c.length; i++) {
				escrita.write(c[i]);
			}
			escrita.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
