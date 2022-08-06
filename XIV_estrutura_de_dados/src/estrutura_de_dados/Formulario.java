package estrutura_de_dados;

import java.awt.*;
import javax.swing.*;

public class Formulario extends JFrame {

	private JPanel pnNorte, pnCentro, pnSul;
	public JTextArea taTexto;
	public JTextField txtValor, txtNumMaximo;
	protected JButton btnIncluir;
	protected JButton btnExcluir;
	protected JButton btnLimpar;
	protected JButton btnListar;
	protected JButton btnUltimo;
		
	public Formulario() {
		super ("Formulário Padrão");
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container tela = getContentPane();
		tela.setLayout(new BorderLayout());
	
		txtValor = new JTextField();
		pnNorte = new JPanel();
		pnNorte.add(txtValor);
		pnNorte.setLayout(new GridLayout(1,1));
		
		taTexto = new JTextArea();
		pnCentro = new JPanel();
		pnCentro.add(new JScrollPane(taTexto));
		pnCentro.setLayout(new GridLayout(1,1));
			
		btnIncluir = new JButton("Inserir");
		btnExcluir = new JButton("Excluir");
		btnLimpar = new JButton("Limpar");
		btnListar = new JButton("Listar");
		btnUltimo = new JButton("Ultimo");
		
		txtNumMaximo = new JTextField("5");
		pnSul = new JPanel ();
		pnSul.setLayout(new GridLayout(3,2));
		pnSul.add(btnIncluir);
		pnSul.add(btnExcluir);
		pnSul.add(btnLimpar);
		pnSul.add(btnListar);
		pnSul.add(btnUltimo);
		pnSul.add(txtNumMaximo);
		
		tela.add(pnNorte, BorderLayout.NORTH);
		tela.add(pnCentro, BorderLayout.CENTER);
		tela.add(pnSul, BorderLayout.SOUTH);
	}
	
}
