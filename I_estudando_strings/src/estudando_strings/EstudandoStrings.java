package estudando_strings;

public class EstudandoStrings {
	public static void main (String args []) {
		String s1 = new String("    Curso de Java     ");
		String s2 = "jose.amancio@novotempo.com";
		String s3 = "José Paulo;23-05-92;jose.amancio@novotempo.com";
		
		
		// METODO REPLACE
		System.out.println("METODO REPLACE");
		s2.replace("novotempo", "gmail");
		System.out.println(s2);
		System.out.println("");
		
		// METODO TRIM (REMOVENDO ESPAÇOS)
		System.out.println("METODO TRIM - REMOVENDO ESPAÇOS");
		System.out.println(s1.trim());
		System.out.println("");
		
		// METODO SPLIT (QUEBRANDO STRINGS)
		String s4 [] = s3.split(";");
		System.out.println("METODO SPLIT QUEBRANDO STRINGS");
		System.out.println("Nome: "+s4[0]);
		System.out.println("Nascimento: "+s4[1]);
		System.out.println("E-mail: "+s4[2]);
		System.out.println("");
	}

}
