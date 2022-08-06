package tipos_genericos;

import javax.swing.JOptionPane;

public class AulaGenericos {

	public static void main (String [] args) {
		//TIPO DE VETOR PRECISA COMEÇAR COM MAIUSCULO
		String [] ArrayDeString = {"José","Paulo","Joyce"};
		Character[] ArrayDeCharactare = {'A','B','C','D'};
		Integer[] ArrayDeInteiros = {1,2,3,4,5};
		Double [] ArrayDeDouble = {1.5,2.9,3.7,5.2,6.4};

		
		ImprimeArray(ArrayDeString);
		ImprimeArrayObject(ArrayDeCharactare);
		ImprimeArray(ArrayDeInteiros);
		ImprimeArrayObject(ArrayDeDouble);
		
	}
		
	//GENERICO - NO CASO 'E'
	public static <E> void ImprimeArray(E[] entrada) {
		String msg = "Lista: ";

		for (E valor : entrada)
			msg += "\n - " + valor;

		JOptionPane.showMessageDialog(null, msg);
	}
	
	//GENERICO - NO CASO 'OBJECT'
	public static <Object> void ImprimeArrayObject(Object[] entrada) {
		String msg = "Lista: ";

		for (Object valor : entrada)
			msg += "\n - " + valor;

		JOptionPane.showMessageDialog(null, msg);
	}
	
	//CONVENCIONAL
	public static void ImprimeArray(String[] entrada) {
		String msg = "Lista de Nomes: ";

		//PERCORRE NOME E ARMAZENA EM VALOR  - for (INT i=0; i<nome.length;i++)
		for (String valor : entrada)
			msg += "\n - " + valor;

		JOptionPane.showMessageDialog(null, msg);
	}
}
