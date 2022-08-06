import javax.swing.JOptionPane;

public class CaractereInvalidoException extends NumberFormatException{

	public CaractereInvalidoException() {
		super();
		JOptionPane.showMessageDialog(null, "O valor do divisor precisa ser numérico.");
	}
	public CaractereInvalidoException(String s) {
		super(s);
		JOptionPane.showMessageDialog(null, "O valor do divisor precisa ser numérico.");
		}

}