import java.text.DateFormat;
import java.util.Date;

public class FormatandoHora {

		public static void main (String args []) {
				
		//FORMATAÇÃO DE DATA
		System.out.println("FORMATAÇÃO DE DATA");
		Date dataAtual = new Date();
		System.out.println("Data Atual: "+dataAtual);

		// DD/MM/AAAA
		DateFormat df = DateFormat.getTimeInstance();
		System.out.println("Padrão: "+ df.format(dataAtual));
		
		// DD/MM/AA
		df = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println("Curto: "+ df.format(dataAtual));
		
		// POR EXTENSO
		df = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println("Longo: "+ df.format(dataAtual));
		
		// POR EXTENSO
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("Completo: "+ df.format(dataAtual));

		//GET INSTANCE
		df = DateFormat.getInstance();
		System.out.println("getInstance: "+ df.format(dataAtual));
	}

}
