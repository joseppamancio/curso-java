package estrutura_de_dados.Lista_Encadeada;

public class ListaEncadeada<E> {

	private Nodo primeiro;
	private Nodo ultimo;
	private int totalObj;

	// INSERIR NO COMEÇO
	public void inserirComeco(E objeto) {
		Nodo novoNodo = new Nodo(primeiro, objeto); // NODO = NODO/PRIMEIRO
		primeiro = novoNodo; // PRIMEIRO SE TORNA O NOVO NÓ

		if (totalObj == 0)
			ultimo = primeiro;

		totalObj++;
	}

	// INSERIR NO FINAL
	public void inserirFinal(E objeto) {
		if (totalObj == 0)
			inserirComeco(objeto);

		else {
			Nodo novoNodo = new Nodo(objeto);
			ultimo.setProximo(novoNodo);
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
		}else {
			Nodo anterior = pegaNodo(posicao - 1);
			Nodo novoNodo = new Nodo(anterior.getProximo(), objeto);
			anterior.setProximo(novoNodo);
			totalObj++;
		}
	}

	// VERIFICA SE POSICAO ESTÁ PREENCHIDA
	private boolean posicaoPreenchida(int posicao) {
		if ((posicao >= 0) && (posicao < totalObj))
			return true;
		else
			return false;
	}

	// PEGA O NÓ COM POSICAO DESEJADA
	private Nodo pegaNodo(int posicao) {
		if (!posicaoPreenchida(posicao)) {
			throw new IllegalArgumentException("Esta posição não é válida");
		}
		Nodo atual = primeiro;
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
		return (E) pegaNodo(posicao).getObjeto();
	}

	public int tamanhoLista() {
		return totalObj;
	}
	
	public void removerComeco(){
		if (!posicaoPreenchida(0))
			throw new IllegalArgumentException("Esta posição não está preenchida");

		primeiro = primeiro.getProximo();
		totalObj--;
	}
}
