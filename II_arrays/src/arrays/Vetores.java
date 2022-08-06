package arrays;

import javax.swing.JOptionPane;

public class Vetores {

	public static void main(String args[]) {

		// MÉTODO 1
		int[] idade = new int[4];

		idade[0] = 25;
		idade[1] = 20;
		idade[2] = 15;
		idade[3] = 5;

		System.out.print("\nIDADES\n");
		for (int i = 3; i >= 0; i--) {
			System.out.printf("idade %d é :%d\n", i, idade[i]);
		}

		// MÉTODO 2
		System.out.print("\nNOMES\n");
		String[] nomes = { "José", "Joyce", "Snoop", "Hygor" };
		for (int i = 3; i >= 0; i--) {

			System.out.printf("Nomes %d é :%s\n", i, nomes[i]);
		}

		// MÉTODO 3
		String[] nome = new String[4];
		for (int i = 1; i <= 4; i++) {
			String txt = JOptionPane.showInputDialog("Entre com o " + i + "° nome: ");

			if (txt == null)
				break;
			nome[i - 1] = txt;

		}
		for (int i = 0; i < 4; i++) {
			JOptionPane.showMessageDialog(null, "Nomes: " + nome[i]);
		}

		// LISTA COMPLETA
		String lista = "Lista de Nomes";
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] == null)
				break;

			lista += "\n - " + nome[i];
		}
		JOptionPane.showMessageDialog(null, lista);
	}
}
