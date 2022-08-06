import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class UsandoLocais {

	public static void main(String[] args) {
		
	// INGLÊS ESTADOS UNIDOS
	Locale local = new Locale("en","US");
	Locale local1 = Locale.CANADA;
		
	//IMPRIMINDO
	System.out.println("Local padrão: "+local.getDisplayName());
	System.out.println("País: "+local.getDisplayCountry());
	System.out.println();
		
	System.out.println("Local padrão: "+local1.getDisplayName());
	System.out.println("País: "+local1.getDisplayCountry());
	System.out.println();
		
	//TIMEZONE
	System.out.println("FUSO DE -02h:00m");
	//FUSO DE 2 HORAS (-2H *60m *60s *1000mm)
	String[] fusos = TimeZone.getAvailableIDs(-2*60*60*1000);
		
		for (int i=0;i<fusos.length;i++) {
			System.out.println(fusos[i]);
		}
			System.out.println();
		
	//IMPRIMINDO TIMEZONE
	System.out.println("IMPRIMINDO TIMEZONE: ");
	TimeZone timez = TimeZone.getDefault();
	
	System.out.println("Fuso Horário Atual: "+timez.getDisplayName());
	System.out.println("Em inglês: "+timez.getDisplayName(Locale.CANADA));
	System.out.println("Estilo Longo: "+timez.getDisplayName(true, TimeZone.LONG));
	System.out.println("Estilo Curto: "+timez.getDisplayName(true, TimeZone.SHORT));
	System.out.println("Horas Acrescidas: "+timez.getDSTSavings()/1000/60/60);
	System.out.println("Horário de Verão: "+timez.inDaylightTime(new Date()));
	}
}
