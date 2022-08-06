package estrutura_de_dados.Lista;

public class Lista<E> {
	private E[] L = (E[]) new Object[5];
	private int totalObj = 0;

	// INSERIR
	public void inserir(E objeto) {
		dobrarTamanho();
		L[totalObj] = objeto;
		totalObj++;
	}

	// INSERIR EM POSICAO DESEJADA
	public void inserir(int posicao, E objeto) {
		dobrarTamanho();
		// VERIFICA POSICA VALIDA
		if (!posicaoPreenchida(posicao))
			throw new IllegalArgumentException("Esta posição não é válida");

		// DECREMENTANDO E DESLOCANDO PARA DIREITA
		for (int i = totalObj - 1; i >= posicao; i--) {
			L[i + 1] = L[i];
		}
		L[posicao] = objeto;
		totalObj++;
	}

	// RETORNA TAMANHO DA LISTA
	public int tamanhoLista() {
		return totalObj;
	}

	// RETORNA OBJETO NA POSICAO DESEJADA
	public E retornarObj(int posicao) {
		// VERIFICA POSICAO
		if (!posicaoPreenchida(posicao))
			throw new IllegalArgumentException("Esta posição não está preenchida");
		return L[posicao];
	}

	// VERIFICA SE POSICAO ESTÁ PREENCHIDA
	private boolean posicaoPreenchida(int posicao) {
		if ((posicao >= 0) && (posicao < totalObj))
			return true;
		else
			return false;
	}

	// EXCLUIR
	public void excluir(int posicao) {
		if (!posicaoPreenchida(posicao))
			throw new IllegalArgumentException("Esta posição não é válida");

		// DECREMENTANDO E DESLOCANDO PARA ESQUERDA
		for (int i = posicao; i < totalObj - 1; i++) {
			L[i] = L[i + 1];
		}
		totalObj--;
	}

	public void dobrarTamanho() {
		if (totalObj == L.length) {
			E[] novo = (E[]) new Object[L.length * 2];
			for (int i = 0; i < L.length; i++) {
				novo[i] = L[i];
			}
			L = novo;
		}
	}
}
