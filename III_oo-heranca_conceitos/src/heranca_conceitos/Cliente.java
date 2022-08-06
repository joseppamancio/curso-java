package heranca_conceitos;

public class Cliente {
	
	int codigo;
	String nome;
	
	//CONSTRUTOR CLIENTE
	Cliente(int codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
