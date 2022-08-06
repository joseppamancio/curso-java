package tipos_genericos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;


public class FormularioString extends Formulario implements ActionListener{
	public static OperacoesVetor<String> cadastro;
	
	
	public FormularioString(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		
		int lim = Integer.parseInt(txtNumMaximo.getText());
		cadastro = new OperacoesVetor<String> (lim);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btnIncluir)
			incluir(txtValor.getText());
		
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
		if(cadastro.cheio()) {
			JOptionPane.showMessageDialog(null, "A lista já está cheia!","Erro", ERROR_MESSAGE);
			return;	
		}
		cadastro.inserirItem(txt);
	}
	
	
	
	public static String listar() {
		if(cadastro.vazio())
			return "A lista já está vazia!";
		else
			return cadastro.listarTodos();
}
	
	public static void excluir() {
		if(cadastro.vazio())
			showMessageDialog(null, "A lista já está vazia!","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null, "Item Removido!" + cadastro.excluirUltimo());
}
	
	public static void limpar() {
		if(cadastro.vazio())
			showMessageDialog(null, "A lista já está vazia!","Erro", ERROR_MESSAGE);
		else
			cadastro.limpar();
}
	
	public static void verUltimo() {
		if(cadastro.vazio())
			showMessageDialog(null, "A lista já está vazia!","Erro", ERROR_MESSAGE);
		else
			showMessageDialog(null,"Ultimo Elemento"+ cadastro.verUltimo());
}
	
	public static void main(String args[]) {
		new FormularioString().setVisible(true);
	}
}
