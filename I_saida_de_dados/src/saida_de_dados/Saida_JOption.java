package saida_de_dados;

import javax.swing.JOptionPane;

public class Saida_JOption {
	
	public static void main (String arg []) {
		
		String nome = "José Paulo";
		int idade = 25;
		float salario = 2077.00f;
		char sexo = 'M';
		
		JOptionPane.showMessageDialog(null,"Nome " + nome + "\nIdade: " + idade + "\nSalário: " + salario + "\nSexo: " + sexo);
		
	}
}
