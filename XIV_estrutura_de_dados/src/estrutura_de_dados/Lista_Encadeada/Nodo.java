package estrutura_de_dados.Lista_Encadeada;

public class Nodo<E> {
	private Nodo proximo;
	private E objeto;

	public Nodo(Nodo proximo, E objeto) {
		this.proximo = proximo;
		this.objeto = objeto;
	}

	public Nodo(E elemento) {
		this.objeto = objeto;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public E getObjeto() {
		return objeto;
	}
}
