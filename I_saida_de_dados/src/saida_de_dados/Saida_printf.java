package saida_de_dados;

public class Saida_printf {
	
	public static void main (String arg []) {
		
		String nome = "José Paulo";
		int idade = 25;
		float salario = 2077.00f;
		char sexo = 'M';
		
		
	// TIPO 1 - SAIDA NORMAL
		System.out.println("SAÍDA DE DADOS NORMAL");
		System.out.println("Nome " + nome + "\nIdade: " + idade + "\nSalário: " + salario + "\nSexo: " + sexo);
		
	// TIPO 2 - SAIDA FORMATADA
		System.out.println("\nSAÍDA DE DADOS FORMATADA");
		System.out.printf("Nome: %s\nIdade: %d\nSalário: %f\nSexo: %b",nome,idade,salario,sexo);	
		
	}

}
