import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) {

	DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date data1 = new Date();
	Date data2 = new Date();
	
	String str1 = "23/05/1992";
	String str2 = "08/05/1993";
	
	try {
		data1 = dtf.parse(str1);
		data2 = dtf.parse(str2);
		
		if(data1.equals(data2)) {
			System.out.println("As datas são iguais");
			}
		else if(data1.before(data2)) {
			System.out.println("A data "+dtf.format(data1)+" vem antes da data "+dtf.format(data2)+".");
		}
		else {
			System.out.println("A data "+dtf.format(data1)+" vem depois da data "+dtf.format(data2)+".");
		}
	}
	catch(ParseException ex) {
		System.out.println("Erro: "+ex);
	}
}
}
