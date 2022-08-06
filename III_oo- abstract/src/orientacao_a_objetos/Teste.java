package orientacao_a_objetos;

public class Teste {

	public static void main(String args []) {
	
		//TESTANDO CONTAS POUPANÇA E CORRENTE
		Cliente cli01 = new Cliente(000, "Manoel");
		Cliente cli02 = new Cliente(000, "Jailton");
		
		ContaPoupanca cp = new ContaPoupanca (cli01.codigo,cli01.nome,28);
		cp.depositar(1000.00);
		
		ContaCorrente cc = new ContaCorrente (cli02.codigo,cli02.nome,2000.00);
		cc.depositar(500);
		
		cp.imprimeCompleto();
		cc.imprimeCompleto();
		
	}
}
