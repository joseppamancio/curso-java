package estudando_strings;

public class ComparandoStrings {

	public static void main(String args[]) {
		String s1 = new String("Curso de Java");
		String s2 = "Java";
		String s3 = "java";
		String s4 = "José";

		// COMPARANDO ENDEREÇO
		System.out.println("COMPARANDO ENDEREÇO");
		if (s1 == "Curso de Java")
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");

		// COMPARANDO CONTEUDO
		System.out.println("COMPARANDO CONTEUDO");
		if (s1.equals("Curso de Java"))
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");

		// COMPARANDO CONTEUDO COM SENSITIVE CASE
		System.out.println("COMPARANDO CONTEUDO COM SENSITIVE CASE");
		if (s1.equals(s2))
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");

		// COMPARANDO ENDEREÇO IGNORANDO SENSITIVE CASE
		System.out.println("COMPARANDO CONTEUDO IGNORANDO SENSITIVE CASE");
		if (s2.equalsIgnoreCase(s3))
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");

		// METODO COMPARE TO
		System.out.println("COMPARE TO");
		System.out.println("s1 < s2: " + s1.compareTo(s2));
		System.out.println("s1 > s2: " + s2.compareTo(s1));
		System.out.println("s1 = s1: " + s1.compareTo(s1));
		System.out.println("s1 = 'Curso de Java': " + s1.compareTo("Curso de Java"));
		System.out.println("Java < java: " + s2.compareTo(s3));
		System.out.println("");

		// METODO COMPARE TO IGNORE CASE
		System.out.println("COMPARE TO IGNORE CASE");
		System.out.println("Java < java: " + s2.compareToIgnoreCase(s3));
		System.out.println("");

		
		
		// METODO REGIONMATCHES - TODA STRING
		System.out.println("METODO REGION MATCHES");
		
		// COMEÇO STRING ORIGEM, STRING DESTINO, INDICE STRING COMPARAÇAO, QUANTIDADE CARACTERES
		if (s2.regionMatches(0, s4, 0, 3))
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");
		
		
		
		// METODO REGIONMATCHES IGNORE CASE - TODA STRING
		System.out.println("METODO REGION MATCHES SENSITIVE CASE");
		
		// TRUE, COMEÇO STRING ORIGEM, STRING DESTINO, INDICE STRING COMPARAÇAO, QUANTIDADE CARACTERES
		if (s2.regionMatches(true, 0, s3, 0, 3))
			System.out.println("Strings Iguais");
		else
			System.out.println("Strings Diferentes");
		System.out.println("");
		
		
		//STARTSWITH E ENDSWITH - COMEÇA COM... TERMINA COM...
		System.out.println("STARTSWITH E ENDSWITH - COMEÇA COM... TERMINA COM...");
		if (s1.startsWith("Curso")){
			System.out.println("Localizou");
		}
		else 
			System.out.println("Não Localizou");
		
		if (s1.endsWith("Java")) {
			System.out.println("Localizou");
		}
		else 
			System.out.println("Não Localizou");
		System.out.println("");
		
		
		//VALIDANDO E-MAIL
		// TERMINADOS COM NOVOTEMPO.COM E COM MÁXIMO E 12 CARACTERES
		System.out.println("VALIDANDO E-MAIL: TERMINADOS COM NOVOTEMPO.COM E COM MÁXIMO E 12 CARACTERES");
		String s5 = "jose.amancio@novotempo.com";
				
		if (s5.endsWith("@novotempo.com")) {
			System.out.println("E-mail válido");
		}
		else 
			System.out.println("E-mail inválido");
		
		
		int limitechar = s5.indexOf("@");
		if(limitechar>12) {
			System.out.println("Você excedeu onúmero de carácteres");
		}
		else
			System.out.println("Limite OK");
		System.out.println("");
		
				
		//NICK DE E-MAIL - SUBSTRING
		String s6 = s5.substring(0, s5.indexOf("@"));
		System.out.println("IMPRIMINDO O NICKNAME");
		System.out.println("O nickname é: " + s6);
		
	}
}

