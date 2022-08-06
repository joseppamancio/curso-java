package arrays;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class BuscaIndice {

	public static void main(String[] args) {
		byte[] vetor = { 1, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		byte valor = Byte.parseByte(JOptionPane.showInputDialog("Digite o valo a ser pesquisado: "));

		int resultado = Arrays.binarySearch(vetor, valor);

		if (resultado > 0)
			JOptionPane.showMessageDialog(null, "Posição Encontrada: " + resultado);
		else
			JOptionPane.showMessageDialog(null, "Posição Não Encontrada");
	}
}
