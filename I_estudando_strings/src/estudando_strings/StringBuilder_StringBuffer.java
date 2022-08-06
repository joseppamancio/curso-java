package estudando_strings;

/*O STRINGBUILDER E STRINGBUFFER ARMAZENA VALORES
 * DE FORMA QUE NÃO SÃO CRIADOS NOVOS OBJETOS
 * E SIM UTILIZADOS O MESMO ENDEREÇO - CONCEITO DE MUTAÇÃO */


public class StringBuilder_StringBuffer {
	public static void main (String args []) {

		StringBuilder sb = new StringBuilder();
		
		String nome = "Paulo";
		char letra1 = 'Z';
		char letra2 = 'É';
		
		// INSERT - ARMAZENANDO NA POSIÇÃO 0 (OU QUALQUER)  DO OBJETO
		sb.insert(0, nome);
		sb.insert(0, " ");
		sb.insert(0, letra2);
		sb.insert(0, letra1);
		
		System.out.println(sb.toString());
		
		// APPEND - ARMAZENANDO NA ULTIMA POSIÇÃO
		sb.append(" ");
		sb.append(letra1);
		sb.append(letra2);
		sb.append(" ");
		sb.append(nome);
		
		System.out.println(sb.toString());
		
		
		sb.append(sb);
		System.out.println(sb.toString());
	}

}
