/*O METODO TO STRING RETORNA UMA SAIDA DE TEXTO
 * NÃO PRECISANDO ACRESCENTAR MAIS NADA AO OBJETO
 * PARA QUE ELE IMPRIMA UMA SAIDA DE TEXTO
 * OBSERVE NA SAIDA "RECIBO"
*/

public class Funcionario {
	private String nome;
	private double salario;
		
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "O salário de "+ nome +" é : R$"+ salario;
	}

	//METODO AUTOMATICO - GENERATE HASH CODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	/*@Override
	public boolean equals(Object obj) {
		Funcionario func = (Funcionario)obj;
		if(this.nome == func.nome)
			return true;
		else
			return false;
	}
*/
	
	
}
