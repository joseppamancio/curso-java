package estrutura_de_dados.Lista_Duplamente_Encadeada;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import estrutura_de_dados.Cliente;

import javax.swing.JOptionPane;

public class FormularioListaDuplamenteEncadeada extends JFrame implements ActionListener {
	public static ListaDuplamenteEncadeada<Cliente> cadastro;

	private JPanel pnNorte, pnCentro, pnSul;
	public JTextArea taTexto;
	public JTextField txtValor, txtNumMaximo;
	protected JButton btnIncluir;
	protected JButton btnIncluirPos;
	protected JButton btnMostrarPos;
	protected JButton btnRemoverPos;
	protected JButton btnTamanho;

	public FormularioListaDuplamenteEncadeada() {
		super("Formulario Lista Encadeada");
		setSize(250, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container tela = getContentPane();
		tela.setLayout(new BorderLayout());

		txtValor = new JTextField();
		pnNorte = new JPanel();
		pnNorte.add(txtValor);
		pnNorte.setLayout(new GridLayout(1, 1));

		taTexto = new JTextArea();
		pnCentro = new JPanel();
		pnCentro.add(new JScrollPane(taTexto));
		pnCentro.setLayout(new GridLayout(1, 1));

		btnIncluir = new JButton("Adicionar no Fim");
		btnIncluirPos = new JButton("Adicionar numa Posicao");
		btnMostrarPos = new JButton("Mostar numa posicao");
		btnRemoverPos = new JButton("Remover numa posicao");
		btnTamanho = new JButton("Tamanho da lista");

		txtNumMaximo = new JTextField("5");

		pnSul = new JPanel();
		pnSul.setLayout(new GridLayout(7, 1, 2, 2));
		pnSul.add(btnIncluir);
		pnSul.add(btnIncluirPos);
		pnSul.add(btnMostrarPos);
		pnSul.add(btnRemoverPos);
		pnSul.add(btnTamanho);
		pnSul.add(txtNumMaximo);

		tela.add(pnNorte, BorderLayout.NORTH);
		tela.add(pnCentro, BorderLayout.CENTER);
		tela.add(pnSul, BorderLayout.SOUTH);

		btnIncluir.addActionListener(this);
		btnIncluirPos.addActionListener(this);
		btnMostrarPos.addActionListener(this);
		btnRemoverPos.addActionListener(this);
		btnTamanho.addActionListener(this);

		cadastro = new ListaDuplamenteEncadeada<Cliente>();

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btnIncluir) {
			cadastro.inserirFinal(new Cliente(txtValor.getText()));
			txtValor.setText("");
			txtValor.requestFocus();
		}
		
		if (obj == btnIncluirPos) {
			cadastro.inserir(Integer.parseInt(txtNumMaximo.getText()), new Cliente(txtValor.getText()));
			txtValor.setText("");
			txtValor.requestFocus();
		}
		
		if(obj==btnMostrarPos)
			JOptionPane.showMessageDialog(null,cadastro.verObj(Integer.parseInt(txtNumMaximo.getText())));
		
		 if(obj==btnRemoverPos) 
			 cadastro.removerComeco();
		 
		 if(obj==btnTamanho) 
			 JOptionPane.showMessageDialog(null,cadastro.tamanhoLista());
		  
		taTexto.setText(listar());
	}

	public String listar() {
		int total = cadastro.tamanhoLista();
		String msg = "";
		for(int i= 0; i < total; i++) 
			msg += cadastro.verObj(i).toString() + "\n";
		return msg;
	}

	public static void main(String args[]) {
		new FormularioListaDuplamenteEncadeada().setVisible(true);
	}

}
