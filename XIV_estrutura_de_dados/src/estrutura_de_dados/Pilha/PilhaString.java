package estrutura_de_dados.Pilha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import estrutura_de_dados.Formulario;

import static javax.swing.JOptionPane.*;


public class PilhaString extends Formulario implements ActionListener{
	public static Pilha<String> pilha;
	
	
	public PilhaString(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		
		int lim = Integer.parseInt(txtNumMaximo.getText());
		pilha = new Pilha<String> (lim);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btnIncluir) {
			incluir(txtValor.getText());
			txtValor.setText("");
		}
		if(obj==btnListar)
			taTexto.setText(listar());
		
		if(obj==btnExcluir)
			excluir();

		if(obj==btnLimpar)
			limpar();
		
		if(obj==btnUltimo)
			verUltimo();
		
	taTexto.setText(listar());	
	//
	}
	
	
	public static void incluir(String txt) {
		if(pilha.cheia()) {
			JOptionPane.showMessageDialog(null, "A lista já está cheia! ","Erro", ERROR_MESSAGE);
			return;	
		}
		pilha.inserir(txt);
	}
	
	
	public static String listar() {
		if(pilha.vazia())
			return "A lista já está vazia! ";
		else
			return pilha.listarTodos();
}
	
	public static void excluir() {
		if(pilha.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null, "Item Removido! " + pilha.excluir());
}
	
	public static void limpar() {
		if(pilha.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			pilha.excluir();
}
	
	public static void verUltimo() {
		if(pilha.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null,"Ultimo Elemento "+ pilha.ultimo());
}
	
	public static void main(String args[]) {
		new PilhaString().setVisible(true);
	}
}
