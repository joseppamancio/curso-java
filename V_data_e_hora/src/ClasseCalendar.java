import java.util.Calendar;
import java.util.Locale;

public class ClasseCalendar {
	
	public static void main (String args []) {

		/*A MANEIRA MAIS FACIL E PRATICA
		DE SE TRABALHAR COM DATA E HORA*/
		
		Calendar calendario = Calendar.getInstance();
		System.out.println("Data e Hora Atuais: " +calendario.getTime());
		System.out.println("Data e Hora em Milissegundos: "+calendario.getTimeInMillis());

		
		//DIA DO MÊS
		System.out.println("Dia do Mês: "+ calendario.get(Calendar.DAY_OF_MONTH));
		//NOME DO MÊS
		System.out.println("Nome do Mês: "+ calendario.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.getDefault()));
		//MÊS
		System.out.println("Mês: "+ calendario.get(Calendar.MONTH));
		//ANO
		System.out.println("Ano: "+calendario.get(Calendar.YEAR));
		//INSERINDO O ANO
		calendario.set(Calendar.YEAR, 2019);
		System.out.println("Ano que vem :"+calendario.get(Calendar.YEAR));
	}
}