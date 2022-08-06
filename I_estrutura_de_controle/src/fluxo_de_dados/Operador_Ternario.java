package fluxo_de_dados;

import javax.swing.JOptionPane;

public class Operador_Ternario {
	public static void main(String arg[]) {

		String resultado;
		String resultado2;
		int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com uma nota de 0 à 12: "));

		System.out.println("Tipo normal");
		if (nota >= 7)
			resultado = "Aprovado";
		else
			resultado = "Reprovado";

		System.out.println("Tipo Operador Ternário");
		resultado2 = (nota >= 7) ? "Aprovado" : "Reprovado";

		JOptionPane.showMessageDialog(null, resultado2);

	}
}
