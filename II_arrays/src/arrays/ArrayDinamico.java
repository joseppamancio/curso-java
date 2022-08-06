package arrays;

import javax.swing.JOptionPane;

public class ArrayDinamico {

	public static void main(String args[]) {
		int j = 1;
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de nomes: "));
		String lista = "";
		int k = 0;
		String nome_completo[] = new String[tamanho];

		for (int i = 0; i < nome_completo.length; i++) {
			nome_completo[i] = JOptionPane.showInputDialog("Seu " + j + "º é: ", nome_completo[i]);
			j++;
		}

		for (String l : nome_completo) {
			lista += "\n - " + nome_completo[k];
			k++;
		}
		JOptionPane.showMessageDialog(null, "Seu Nome Completo é: ");
		JOptionPane.showMessageDialog(null,lista);
	}
}
