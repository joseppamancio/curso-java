package estrutura_de_dados.Lista_Duplamente_Encadeada;

public class ListaDuplamenteEncadeada<E> {

	private NodoDuplo primeiro;
	private NodoDuplo ultimo;
	int totalObj;

	// INSERIR NO COMEÇO
	public void inserirComeco(E objeto) {
		if (totalObj == 0) {
			NodoDuplo novoNodo = new NodoDuplo(objeto);
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			NodoDuplo novoNodo = new NodoDuplo(primeiro, objeto); // NodoDuplo = NodoDuplo/PRIMEIRO
			primeiro.setAnterior(novoNodo);
			primeiro = novoNodo; // PRIMEIRO SE TORNA O NOVO NÓ

		}
		totalObj++;
	}

	// INSERIR NO FINAL
	public void inserirFinal(E objeto) {
		if (totalObj == 0) {
			inserirComeco(objeto);
		}
		else {
			NodoDuplo novoNodo = new NodoDuplo(objeto);
			ultimo.setProximo(novoNodo);
			novoNodo.setAnterior(ultimo);
			ultimo = novoNodo;
			totalObj++;
		}
	}

	// INSERIR NUMA POSICAO
	public void inserir(int posicao, E objeto) {
		// SE POSICAO FOR '0' INSERE NO COMECO
		if (posicao == 0) {
			inserirComeco(objeto);
		}
		// POSICAO FOR MAX. INSERE NO FINAL
		else if (posicao == totalObj) {
			inserirFinal(objeto);

			// PEGA REFERENCIA DO APONTAMENTO DO ULTIMO NÓ 'PROXIMO'
		} else {
			NodoDuplo anterior = pegaNodoDuplo(posicao-1);
			NodoDuplo proximo = anterior.getProximo();
			NodoDuplo novoNodo = new NodoDuplo(anterior.getProximo(), objeto);
			novoNodo.setAnterior(anterior);
			anterior.setProximo(novoNodo);
			proximo.setAnterior(novoNodo);
			totalObj++;
		}
	}

	// VERIFICA SE POSICAO ESTÁ PREENCHIDA
	public boolean posicaoPreenchida(int posicao) {
		if ((posicao >= 0) && (posicao < totalObj))
			return true;
		else
			return false;
	}

	// PEGA O NÓ COM POSICAO DESEJADA
	public NodoDuplo pegaNodoDuplo(int posicao) {
		if (!posicaoPreenchida(posicao)) {
			throw new IllegalArgumentException("Esta posição não é válida");
		}
		NodoDuplo atual = primeiro;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	// RETORNA OBJETO NA POSICAO DESEJADA
	public E verObj(int posicao) {
		// VERIFICA POSICAO
		if (!posicaoPreenchida(posicao)) {
			throw new IllegalArgumentException("Esta posição não está preenchida");
		}
		return (E) pegaNodoDuplo(posicao).getObjeto();
	}

	public int tamanhoLista() {
		return totalObj;
	}

	// REMOVER DO COMEÇO
	public void removerComeco() {
		if (!posicaoPreenchida(0)) {
			throw new IllegalArgumentException("Esta posição não está preenchida");
		}
		primeiro = primeiro.getProximo();
		totalObj--;
	}

	// REMOVER DO FIM
	public void removerFim() {
		if (!posicaoPreenchida(0)) {
			throw new IllegalArgumentException("Esta posição não está preenchida");
		}

		if (totalObj == 1) {
			removerComeco();
		} else {
			NodoDuplo penultimo = ultimo.getAnterior();
			penultimo.setProximo(null);
			ultimo = penultimo;
			totalObj--;
		}
	}

	// REMOVER DE UMA POSIÇÃO
	public void remover(int posicao) {
		if (!posicaoPreenchida(0)) {
			throw new IllegalArgumentException("Esta posição não está preenchida");
		}
		if (posicao == 0) {
			removerComeco();
		} else if (posicao == totalObj - 1) {
			removerFim();
		} else {
			NodoDuplo anterior = pegaNodoDuplo(posicao - 1);
			NodoDuplo atual = anterior.getProximo();
			NodoDuplo proximo = atual.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			totalObj--;
		}
	}
}