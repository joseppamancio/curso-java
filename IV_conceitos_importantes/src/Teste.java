/*O METODO TO STRING RETORNA UMA SAIDA DE TEXTO
 * NÃO PRECISANDO ACRESCENTAR MAIS NADA AO OBJETO
 * PARA QUE ELE IMPRIMA UMA SAIDA DE TEXTO
 * OBSERVE NA SAIDA "RECIBO"
*/

public class Teste {

	public static void main(String[] args) {
	
		//CRIANDO OBJETOS
		Funcionario recibo = new Funcionario();
		Funcionario recibo2 = new Funcionario();
		
		//SETANDO VALORES
		recibo.setNome("José");
		recibo.setSalario(2200);
		recibo2.setNome("Paulo");
		recibo2.setSalario(2200);
		
		//SAIDA COM TOSTRING()
		System.out.println("SAÍDA COM toString()");
		System.out.println(recibo);
		System.out.println("");
	
		//COMPARANDO OBJETOS
		System.out.println("COMPARANDO OBJETOS");
		if(recibo.equals(recibo2)==true)
			System.out.println("Nomes Iguais");
		else
			System.out.println("Nomes Diferentes");
	}
}
