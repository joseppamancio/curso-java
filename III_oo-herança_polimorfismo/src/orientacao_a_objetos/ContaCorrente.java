package orientacao_a_objetos;

public class ContaCorrente extends Conta{
	
	private int diasUsados=13;
	private double limite;
	
	ContaCorrente(int cod, String cliente, double limite){
		super(cod,cliente);
		this.limite=limite;
	}

	public int getDiasUsados() {
		return diasUsados;
	}

	public void setDiasUsados(int diasUsados) {
		this.diasUsados = diasUsados;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void imprimeCompleto() {
		double juros = this.getSal() * (0.02*this.getDiasUsados());
		double total = this.getSal()+this.getLimite()-juros;
		
		System.out.println("EXTRATO CONTA CORRENTE");
		System.out.println("Saldo: R$"+this.getSal());
		System.out.println("Limite :"+this.getLimite());
		System.out.println("Juros: R$"+juros);
		System.out.println("Saldo Total: R$"+ total);
		System.out.println("");
	}

}
