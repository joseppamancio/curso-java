package arrays;

import java.util.Arrays;

public class CopiaArray {
	public static void main(String args[]) {
		int[] origem = { 1, 2, 3, 4, 5, 6 };
		int[] destino1 = new int[8];
		int[] destino2 = new int[4];
		int[] destino3 = new int[6];

		// ARRAYCOPY(VETOR_ORIGEM,INDICE_INICIO,VETOR_DESTINO,INICIO,FIM)
		System.arraycopy(origem, 1, destino1, 3, 4);
		System.arraycopy(destino1, 3, destino2, 0, 4);

		// ARRAY_DESTINO = ARRAYS.COPYOF(ARRAY_ORIGEM,NOVO_TAMANHO)
		destino3 = Arrays.copyOf(origem, 9);

		for (int i = 0; i < destino1.length; i++) {
			System.out.println("destino1: " + destino1[i]);
		}
		System.out.println("\n\n");
		for (int i = 0; i < destino2.length; i++) {
			System.out.println("destino2: " + destino2[i]);

			System.out.println("\n\n");
			for (i = 0; i < destino3.length; i++) {
				System.out.println("destino3: " + destino3[i]);
			}
		}
	}
}