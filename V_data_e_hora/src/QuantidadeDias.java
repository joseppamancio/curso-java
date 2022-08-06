import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class QuantidadeDias {

	public static void main (String args[]) {
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
	
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		String s1 = "02/07/2018";
		long qtdade1, qtdade2, resultado;
		
		
		try {
			//DEFININDO NATAL
			Date ferias = df.parse(s1);
			c1.setTime(ferias);
			
			//CONTANDO OS DIAS
			qtdade1 = c1.getTimeInMillis();
			qtdade2 = c2.getTimeInMillis();
			//RESULTADO =  RESULTADO /DIA/H/M/S/MM
			resultado = (qtdade1 - qtdade2)/24/60/60/1000;
			
			System.out.println("Faltam "+resultado+" dias para as Férias.");
			
		}
		catch(Exception e){
			
		}
		
	}
}
