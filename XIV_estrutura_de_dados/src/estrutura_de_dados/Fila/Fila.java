package estrutura_de_dados.Fila;

public class Fila<E> {
	private E[] F;
	private int fim, inicio, qtde;

	public Fila(int limite) {
		F = (E[]) new Object[limite];
		fim = -1;
		inicio = 0;
		qtde = 0;
	}

	public void inserir(E objeto) {
		// if(fim>P.length-1) {
		// fim = 0;
		if (fim == F.length - 1) {
			fim = -1;
			++qtde;
		} else {
			++fim;
			F[fim] = objeto;
			++qtde;
		}
	}

	public E excluir() {
		E elemento = F[inicio];
		F[inicio] = null;
		++inicio;

		if (inicio == F.length)
			inicio = 0;
		
		--qtde;
		
		if(qtde == 0) {
			inicio=0;
			fim=-1;
		}
		
		return elemento; // SÓ RETORNA O ELEMENTO PARA PODER EXIBI-LO
	}

	public boolean vazia() {
		if (qtde == 0)
			return true;
		else
			return false;
	}

	public boolean cheia() {
		if (qtde == F.length - 1)
			return true;
		else
			return false;
	}

	public E ultimo() {
		return F[fim];
	}

	public E primeiro() {
		return F[inicio];
	}

	private int tamanhoFila() {
		return qtde;
	}

	public String listarTodos() {
		int primeiro = inicio;
		String txt = "";
			for (int i = 0; i < qtde; i++) {
				txt += F[primeiro] + "\n";
				primeiro++;
				
				if(primeiro==F.length)
					primeiro=0;
		}
		return txt;
	}

}
