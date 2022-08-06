package orientacao_a_objetos;

/* PRIVADO - ACESSADO SOMENTE EM SUA PROPRIA CLASSE
 * PROTEGIDO - ACESSADO EM SUA PROPRIA CLASSE E HERDEIROS
 * PUBLICO - ACESSADO DE QUALQUER LUGAR
 * */

class Conta {
	protected int numero;
	protected double saldo;
	Agencia agencia = new Agencia();
	Cliente cli;
	
	//CONSTRUTOR CONTA
	Conta(int cod, String nome){
	cli = new Cliente(cod,nome);
	}	
		
	//GET E SET - PARA ALETERAR VALORES PRIVADOS...GET-IMPRESSÃO, SET-INSERÇAO(RETORNA UM TIPO)
	//NUMERO
	protected int getNum () {
	//QUANDO ESTÁ NA MESMA CLASSE USAR A PALAVRA THIS
		return this.numero;
	}
	protected void setNum (int num) {
		this.numero = num;
	}
	//SALDO
	protected void depositar(double valor) {
		this.saldo += valor;
	}
	protected boolean sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo Insuficiente!");
			return false;
		}
		else {
			this.saldo -= valor;
			System.out.println("Transferido com sucesso!");
			return true;
		}
	}
	protected double getSal() {
		return this.saldo;
	}
	
	//AGENCIA
	Agencia getAge(){
		return this.agencia;
	}
	protected void setAge(Agencia age){
		this.agencia=age;
	}
	
	
	//TRANSFERENCIA
	protected void transf(Conta destino, double valor) {
		//this.saldo = this.saldo - valor; //SAQUE DO VALOR
		//destino.saldo = destino.saldo + valor; //DEPOSITO DO VALOR
		boolean sacou = sacar(valor);
		if ( sacou == true) {
		destino.depositar(valor);
		}
	}
	
	//CONCEITO DE POLIMORFISMO
	public void imprimeCompleto() {
	//ASSINATURA PARA IMPLEMENTAÇAO

	}
}
