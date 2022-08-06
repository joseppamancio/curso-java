package estudando_strings;

public class ConstrutoresStrings {

	public static void main (String args[]) {
		
		char arraydeChar[] = {'J','O','S','É'};
		int idade = 25;
	
		
		String apelido = new String(arraydeChar,2,2);
		String nome = new String (arraydeChar); 
		String anos =""+idade;
		
		System.out.println(nome);
		System.out.println(apelido);
		System.out.println(anos);
	}
}
