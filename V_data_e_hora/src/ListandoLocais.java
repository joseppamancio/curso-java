import java.util.Locale;

public class ListandoLocais {

	public static void main(String[] args) {
		
		//LISTANDO IDIOMAS
		String idiomas [] = Locale.getISOLanguages();
		
		System.out.println("Idiomas Disponíveis:");
		
		//IMPRIMINDO IDIOMAS
		for(int i=1;i<idiomas.length;i++) {
		System.out.print(idiomas[i-1]+"  ");
		
		
		//IMPRIMIR 20 POR LINHA
		if(i%10==0) {
			System.out.println();
		 }
		}
		
		System.out.println("");
		System.out.println("");
		
		
		
		//LISTANDO PAÍSES
		String paises [] = Locale.getISOCountries();
		
		System.out.println("Países Disponíveis:");
		
		//IMPRIMINDO PAÍSES
		for(int j=1;j<paises.length;j++) {
		System.out.print(paises[j-1]+"  ");
		
		
		//IMPRIMIR 20 POR LINHA
		if(j%10==0) {
			System.out.println();
		}
	}
  }
}

