package curso_logica_java;

import javax.swing.JOptionPane;

public class Entrada_JOption {

	public static void main (String [] args) {
		
		String nome;
		int idade;
		float salario;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário: "));
		
		
	}
	
}
