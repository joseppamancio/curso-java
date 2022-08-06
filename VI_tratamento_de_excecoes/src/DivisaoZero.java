import javax.swing.JOptionPane;

public class DivisaoZero {

	public static int divisao (int numerador, int divisor) throws ArithmeticException{
		return numerador/divisor;
	}
	
	public static void main(String[] args) {
		int num,div;
		boolean continua = true;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o NÚMERO A SER DIVIDIDO: "));
				
		do {
			try {
				div = Integer.parseInt(JOptionPane.showInputDialog("Entre com um NÚMERO DIVISOR: "));
				JOptionPane.showMessageDialog(null, "O resultado da divisão é " + divisao(num,div));
				continua=false;
			}
			catch(ArithmeticException erro){
				JOptionPane.showMessageDialog(null, "O valor do divisor não pode ser 0 ");
			}
			catch(NumberFormatException erro){
				JOptionPane.showMessageDialog(null, "O valor do divisor precisa ser numérico.");
			}
			finally{
				JOptionPane.showMessageDialog(null, "Valor calculado com Sucesso! ");
			}
				}while(continua);
	}

}
