package tipos_genericos;

public class OperacoesVetor <E> {

	private E[] obj;
	private int posicao;

	public OperacoesVetor(int limite) {
		obj = (E[]) new Object[limite];
	}

	// INSERIR ITEM NO VETOR
	public void inserirItem(E valor) {
		obj[posicao] = valor;
		posicao++;
	}

	// EXCLUIR ULTIMO ITEM
	public E excluirUltimo() {
		--posicao;
		E elemento = obj[posicao];
		obj[posicao] = null;
		return elemento;
	}

	// LIMPAR TUDO
	public void limpar() {
		while (posicao > 0) {
			--posicao;
			obj[posicao] = null;
		}
	}

	// LISTAR
	public String listarTodos() {
		String txt = "";
		for (E elemento : obj) {
			if (elemento == null)
				break;
			txt += elemento + "\n";
		}
		return txt;
	}
	
	//VERIFICA CHEIO
	public boolean cheio() {
		return obj.length == posicao;
	}
	
	//VERIFICA VAZIO
	public boolean vazio() {
		return posicao==0;
	}
	
	//VER O ULTIMO
	public E verUltimo() {
		return obj[posicao-1];
	}
}
