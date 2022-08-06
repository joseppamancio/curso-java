package fluxo_de_dados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//ARQUIVO - A SER CRIADO

public class BufferDeLeitura {

	public static String ler(File arquivo) {

		StringBuffer sb = new StringBuffer();

		try {
			// CRIA VARIAVEIS DE LEITURA
			FileReader reader = new FileReader(arquivo); //LER ARQUIVO
			BufferedReader bufReader = new BufferedReader(reader); //ARMAZENA EM BUFFER
			String s;

			
			do {
				// STRING PARA ARMAZENAR LINHA
				s = bufReader.readLine();

				// VERIFICA FIM DA LINHA
				if (s != null) {
					sb.append(s + "\r\n");
				}
			} while (s != null);
			
			bufReader.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
