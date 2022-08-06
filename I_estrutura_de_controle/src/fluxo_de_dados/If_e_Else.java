package fluxo_de_dados;

import javax.swing.JOptionPane;

public class If_e_Else {

	public static void main(String arg[]) {

		JOptionPane.showMessageDialog(null, "Digite um número para obter o mês correspondente");
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um número de 1 à 12: "));

		if (num == 1)
			JOptionPane.showMessageDialog(null, "janeiro");
		else if (num == 2)
			JOptionPane.showMessageDialog(null, "fevereiro");
		else if (num == 3)
			JOptionPane.showMessageDialog(null, "março");
		else if (num == 4)
			JOptionPane.showMessageDialog(null, "abril");
		else if (num == 5)
			JOptionPane.showMessageDialog(null, "maio");
		else if (num == 6)
			JOptionPane.showMessageDialog(null, "junho");
		else if (num == 7)
			JOptionPane.showMessageDialog(null, "julho");
		else if (num == 8)
			JOptionPane.showMessageDialog(null, "agosto");
		else if (num == 9)
			JOptionPane.showMessageDialog(null, "setembro");
		else if (num == 10)
			JOptionPane.showMessageDialog(null, "outubro");
		else if (num == 11)
			JOptionPane.showMessageDialog(null, "novembro");
		else if (num == 12)
			JOptionPane.showMessageDialog(null, "dezembro");
		
		else
			JOptionPane.showMessageDialog(null, "Valor Inválido");

	}
}
