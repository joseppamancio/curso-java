package heranca_conceitos;

/* PRIVADO - ACESSADO SOMENTE EM SUA PROPRIA CLASSE
 * PROTEGIDO - ACESSADO EM SUA PROPRIA CLASSE E HERDEIROS
 * PUBLICO - ACESSADO DE QUALQUER LUGAR
 * */

class Conta {
	private int numero;
	private double saldo;
	private double limite;
	Agencia agencia = new Agencia();
	Cliente cli;
	
	//CONSTRUTOR CONTA
	Conta(int cod, String nome){
	cli = new Cliente(cod,nome);
	}	
		
	//GET E SET - PARA ALETERAR VALORES PRIVADOS...GET-IMPRESSÃO, SET-INSERÇAO(RETORNA UM TIPO)
	//NUMERO
	int getNum () {
	//QUANDO ESTÁ NA MESMA CLASSE USAR A PALAVRA THIS
		return this.numero;
	}
	void setNum (int num) {
		this.numero = num;
	}
	//LIMITE
	double getLim () {
		return this.limite;
	}
	void setLim(double num) {
		this.limite = num;
	}
	//SALDO
	void depositar(double valor) {
		this.saldo += valor;
	}
	boolean sacar(double valor) {
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
	double getSal() {
		return this.saldo;
	}
	
	//AGENCIA
	Agencia getAge(){
		return this.agencia;
	}
	void setAge(Agencia age){
		this.agencia=age;
	}
	
	
	//TRANSFERENCIA
	void transf(Conta destino, double valor) {
		//this.saldo = this.saldo - valor; //SAQUE DO VALOR
		//destino.saldo = destino.saldo + valor; //DEPOSITO DO VALOR
		boolean sacou = sacar(valor);
		if ( sacou == true) {
		destino.depositar(valor);
		}
	}
}
