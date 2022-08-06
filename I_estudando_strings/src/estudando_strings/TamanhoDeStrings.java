package estudando_strings;

public class TamanhoDeStrings {

	public static void main (String args []) {
		
		//ATRIBUIÇÕES
		String nome = "José Paulo ";
		String sobrenome = "Pereira Amâncio";
		String nome_completo = nome+sobrenome;
		char [] ultimo_nome = new char [7];
		
		//IMPRESSÕES
		System.out.println(nome);	
		System.out.println(sobrenome);
		System.out.println("Nome Completo: "+nome+sobrenome);
		System.out.println("");
		
		//IMPRESSÃO COM CONSTRUTORES
		System.out.println(nome_completo.length());
		System.out.println(nome_completo.charAt(6));
		System.out.println("");
		
		//IMPRESSÃO POR CARACTERE
		for (int i=0;i<nome_completo.length();i++) {
			System.out.println(nome_completo.charAt(i));
		}
	    System.out.println("");
	    
	    System.out.println("Maisculo: "+nome_completo.toUpperCase());
	    System.out.println("Maisculo: "+nome_completo.toLowerCase());
	    System.out.println("");
	    
	    //IMPRESSÃO EM ARRAY
	    //INICIO,FIM, VARIAVEL DESTINO,INICIO DE ARMAZENAMENTO
	    nome_completo.getChars(19, 26, ultimo_nome,0);
	    
	    for(char ch:ultimo_nome)
	    	System.out.println(ch);
	}  
}
