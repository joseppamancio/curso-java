import javax.swing.JOptionPane;

public class DescobrindoExcecoes {

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
			catch(Exception erro){
				JOptionPane.showMessageDialog(null, "Houve um erro: " + erro.getMessage());
				erro.getStackTrace();
				JOptionPane.showMessageDialog(null,"INFO: "+erro);
				continua=false;
			}
		}while(continua);
	}

}
