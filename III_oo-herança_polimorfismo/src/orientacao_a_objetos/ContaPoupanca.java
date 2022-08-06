package orientacao_a_objetos;

public class ContaPoupanca extends Conta{
	private int diaAniversario;
	
	ContaPoupanca(int cod,String cliente, int dia){
		super(cod,cliente);
		this.diaAniversario=dia;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}
	
	@Override
	public void imprimeCompleto() {
		System.out.println("EXTRATO CONTA POUPANÇA");
		System.out.println("Saldo: R$"+this.getSal());
		System.out.println("Aniverário :"+this.diaAniversario);
		System.out.println("Juros: R$"+(this.getSal() * 0.05));
		System.out.println("Saldo Total: R$"+(this.getSal() * 0.05 + this.getSal()));
		System.out.println("");
	}
}
