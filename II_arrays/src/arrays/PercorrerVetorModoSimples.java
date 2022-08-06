package arrays;

public class PercorrerVetorModoSimples {

	public static void main(String args[]) {
		String nomes[] = { "José", "Paulo", "Pereira", "Amâncio" };
		int i = 1;

		for (String j : nomes) {
			System.out.printf("%dº Nome: %s\n", i, j);
			i++;
		}
	}
}
