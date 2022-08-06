import java.util.Date;

public class Principal {

	public static void main (String args []) {
		
		Date dt = new Date();
	
		//PADRÃO AMERICANO
		System.out.println("PADRÃO AMERICANO");
		System.out.println("A hora atual é: "+dt);
		System.out.println();
		
		//CONVERTIDO EM MILISEGUNDOS
		System.out.println("CONVERTIDO EM MILISEGUNDOS");
		System.out.println("Valor da data em milisegundos: " +dt.getTime());
		System.out.println();
		
		//TEMPO INICIAL
		dt.setTime(0);
		System.out.println("TEMPO INICIAL");
		System.out.println("Data Inicial: "+ dt);
		
		//SOMANDO +10 DIAS
		//T_ATUAL + 10(DIAS) * 24(H) * 60(M) + 60(S) + 1000(MLS)
		dt.setTime(dt.getTime() + 10 * 24 * 60 * 60 *1000);
		System.out.println("Mais 10 Dias: "+dt);
		System.out.println();
		

		
		
	}
}
