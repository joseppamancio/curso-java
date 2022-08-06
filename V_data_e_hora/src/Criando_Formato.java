import java.text.SimpleDateFormat;
import java.util.Date;

public class Criando_Formato {

	public static void main(String[] args) {
		
		/*
		 * d - DIA
		 * D - DIA DO ANO
		 * M - MÊS
		 * MMM - MÊS ABREVIADO
		 * MMMM - MÊS COMPLETO
		 * y - ANO ABREVIADO
		 * E - NOME DIA DA SEMANA
		 * w - SEMANA DO ANO
		 * G - DESIGNADOR DE ERA (a.C. / d.C.) 
		 * 
		 * H - HORA (0-23)
		 * h - HORA (1-12)
		 * m - MINUTO
		 * s - SEGUNDOS
		 * S - MILISEGUNDOS
		 * k - HORA DO DIA (1 - 24)
		 * K - HORA DO DIA (0 - 11)
		 * a - MARCADOR (AM-PM)
		 * z - FUSO HORARIO (BRT)
		 * Z - FUSO HORARIO (0300)
		 */

		Date dataAtual = new Date();
		dataAtual.getTime();
		
		//CRIANDO UM FORMATO
		System.out.println("SAÍDA FORMATADA");
		SimpleDateFormat sdf = new SimpleDateFormat();

		//ANO
		sdf = new SimpleDateFormat("y");
		System.out.println("O Ano é " + sdf.format(dataAtual) +".");

		//DIA DA SEMANA
		sdf = new SimpleDateFormat("EEEE");
		System.out.println("Hoje é " + sdf.format(dataAtual) +".");	

		//DIAS
		sdf = new SimpleDateFormat("D");
		System.out.println("Se passaram " + sdf.format(dataAtual) + " dias.");
				
		//COMPLETO
		sdf = new SimpleDateFormat("'São José dos Campos,' dd 'de' MMMM 'de' y'.'");
		System.out.println(sdf.format(dataAtual));
	}

}
