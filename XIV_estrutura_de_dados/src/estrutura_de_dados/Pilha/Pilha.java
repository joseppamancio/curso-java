package estrutura_de_dados.Pilha;

public class Pilha <E>{
	private E[] P;
	private int topo;
	
	public Pilha (int limite) {
		P = (E[]) new Object [limite];
		topo = -1;
	}
	
	public void inserir(E objeto){
		++topo;
		P[topo]=objeto;
	}
	public E excluir() {
		E elemento = P[topo];
		P[topo]=null;
		--topo;	
		return elemento; //SÓ RETORNA O ELEMENTO PARA PODER EXIBI-LO
	}
	public boolean vazia() {
		if(topo==-1)
			return true;
		else
			return false;
	}
	public boolean cheia() {
		if(topo==P.length-1)
			return true;
		else
			return false; 
	}
	public E ultimo() {
		return P[topo];
	}

	public String listarTodos() {
		String txt = "";
		for (E elemento : P) {
			if (elemento == null)
				break;
			txt += elemento + "\n";
		}
		return txt;
	}

}
