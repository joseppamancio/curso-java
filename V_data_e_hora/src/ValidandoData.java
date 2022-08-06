import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidandoData {

	//VALIDANDO DATAS DE ENTRADA
	public static void main(String[] args) {
		
		String str = "31/02/2009";
		String str2 = "30/03/2009";
		String str3 = "31/02/2009";
		
		DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dtf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("IMPRIMINDO DATAS SEM VALIDAÇÃO:");
		
		try {
		//DATA NÃO EXISTENTE - TOLERÂNCIA AUTOMATICA
		System.out.println(dtf.format(dtf.parse(str)));
				
		//DATA EXISTENTE - NÃO ALTERADA
		System.out.println(dtf.format(dtf.parse(str2)));
		
		
		}catch(ParseException ex){
			System.out.println(ex);
		}
		System.out.println("");
		
			
		
		
		//VALIDANDO DATAS ERRADAS !!!
		
		
		System.out.println("VALIDANDO SE A DATA É VÁLIDA:");
		//VALIDANDO A DATA
		dtf2.setLenient(false);
		
		try {

			//DATA EXISTENTE - NÃO ALTERADA
			System.out.println(dtf2.format(dtf2.parse(str3)));
			
			}catch(ParseException ex){
				System.out.println(ex);
			}
	}
}
