package fluxo_de_dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaBinario {

	public static void copia(File entrada, File saida) {

		try {

			FileInputStream input = new FileInputStream(entrada);
			FileOutputStream output = new FileOutputStream(saida);
			int c;

			do {
				c = input.read();
				if (c != -1) {
					output.write(c);
				}
			} while (c != -1);
			input.close();
			output.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
