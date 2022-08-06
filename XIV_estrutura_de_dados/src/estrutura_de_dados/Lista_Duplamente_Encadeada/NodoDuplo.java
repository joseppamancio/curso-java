package estrutura_de_dados.Lista_Duplamente_Encadeada;

public class NodoDuplo<E> {
	private NodoDuplo proximo;
	private E objeto;
	private NodoDuplo anterior;

	public NodoDuplo(NodoDuplo proximo, E objeto) {
		this.proximo = proximo;
		this.objeto = objeto;
	}

	public NodoDuplo(E elemento) {
		this.objeto = objeto;
	}

	public NodoDuplo getProximo() {
		return proximo;
	}

	public void setProximo(NodoDuplo proximo) {
		this.proximo = proximo;
	}

	public E getObjeto() {
		return objeto;
	}
	
	public NodoDuplo getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NodoDuplo anterior) {
		this.anterior = anterior;
	}
}
