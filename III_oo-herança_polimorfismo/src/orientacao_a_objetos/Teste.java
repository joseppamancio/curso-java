package orientacao_a_objetos;

public class Teste {

	public static void main(String args []) {

		Conta c1 = new Conta(0,"José Paulo");
		Conta c2 = new Conta(1,"Homem-Aranha");
		
		//RELACIONANDO OS DOIS OBJETOS
		Agencia age = c1.agencia;
		
		c1.setNum(589);
		c1.depositar(840.53);
		age.agencia = 104;
		
		//METODOS DA CLASSA CONTA
		c1.depositar(60.00);
		c1.sacar(0.53);
		
		System.out.println("Nome do Cliente: "+c1.cli.nome);
		System.out.println("Agência: "+c1.agencia.agencia);
		System.out.println("O saldo é: R$ "+c1.getSal());
		System.out.println("");

		
		//TRANSFERÊNCIA DE CONTA
		System.out.println("TRANSFERÊNCIA");
		System.out.println("SALDO INICIAL:");
		System.out.println("Saldo da Conta 1: "+c1.getSal());
		System.out.println("Saldo da Conta 2: "+c2.getSal());
		System.out.println("");
		
		c1.depositar(100);
		System.out.println("SALDO DEPOIS DO DEPÓSITO");
		System.out.println("Saldo da Conta 1: "+c1.getSal());
		System.out.println("Saldo da Conta 2: "+c2.getSal());
		System.out.println("");
		
		System.out.println("SALDO DEPOIS DA TRANSFERÊNCIA");
		c1.transf(c2, 500);
		System.out.println("Saldo da Conta 1: "+c1.getSal());
		System.out.println("Saldo da Conta 2: "+c2.getSal());
		System.out.println("");
		
		
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
