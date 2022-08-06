import java.text.DateFormat;
import java.util.Date;

public class FormatandoData {
	
	public static void main (String args []) {
		
	//FORMATAÇÃO DE DATA
	System.out.println("FORMATAÇÃO DE DATA");
	Date dataAtual = new Date();
	System.out.println("Data Atual: "+dataAtual);

	// DD/MM/AAAA
	DateFormat df = DateFormat.getDateInstance();
	System.out.println("Padrão: "+ df.format(dataAtual));
	
	// DD/MM/AA
	df = DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println("Curto: "+ df.format(dataAtual));
	
	// POR EXTENSO
	df = DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println("Longo: "+ df.format(dataAtual));
	
	// POR EXTENSO
	df = DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println("Completo: "+ df.format(dataAtual));

	
	//GET INSTANCE
	df = DateFormat.getInstance();
	System.out.println("getInstance: "+ df.format(dataAtual));


		}
	}
