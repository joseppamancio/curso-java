package estrutura_de_dados.Fila;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import estrutura_de_dados.Formulario;

import static javax.swing.JOptionPane.*;


public class FilaString extends Formulario implements ActionListener{
	public static Fila<String> fila;
	
	
	public FilaString(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		
		int lim = Integer.parseInt(txtNumMaximo.getText());
		fila = new Fila<String> (lim);
		
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

	}
	
	
	public static void incluir(String txt) {
		if(fila.cheia()) {
			JOptionPane.showMessageDialog(null, "A lista já está cheia! ","Erro", ERROR_MESSAGE);
			return;	
		}
		fila.inserir(txt);
	}
	
	
	public static String listar() {
		if(fila.vazia())
			return "A lista já está vazia! ";
		else
			return fila.listarTodos();
}
	
	public static void excluir() {
		if(fila.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null, "Item Removido! " + fila.excluir());
}
	
	public static void limpar() {
		if(fila.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			fila.excluir();
}
	
	public static void verUltimo() {
		if(fila.vazia())
			showMessageDialog(null, "A lista já está vazia! ","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null,"Ultimo Elemento "+ fila.ultimo());
}
	
	public static void main(String args[]) {
		new FilaString().setVisible(true);
	}
}
