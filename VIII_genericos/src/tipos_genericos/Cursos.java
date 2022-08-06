package tipos_genericos;
import java.text.NumberFormat;

public class Cursos {
	private String titulo;
	private double preco;

	public Cursos (String titulo, double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String toString() {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		return titulo + " = " + n.format(preco);
		
	}
}
