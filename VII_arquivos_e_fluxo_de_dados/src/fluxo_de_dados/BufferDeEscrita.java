package fluxo_de_dados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//ARQUIVO - A SER CRIADO
//TEXTO - CONTEUDO A SER ESCRITO


public class BufferDeEscrita {

	public static void escrita (File arquivo, String texto) {
		
		try {
			//PREPARANDO ARQUIVO
			FileWriter writer = new FileWriter(arquivo);
			
			//PREPARANDO OBJETO WRITER
			BufferedWriter bufferwriter = new BufferedWriter(writer);
			bufferwriter.write(texto);
			
			//SEMPRE FECHAR ARQUIVOS
			bufferwriter.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
