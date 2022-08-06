package tipos_genericos;

public class Cliente {

	private String codigo;
	private String nome;

	public Cliente (String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String toString() {
		return codigo + " : " + nome;
	}
}
