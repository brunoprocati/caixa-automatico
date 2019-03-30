package br.com.atm.app;


import java.util.List;

import javax.swing.JOptionPane;

import com.atm.model.Pessoa;

import br.com.atm.dao.PessoaDAO;

public class PessoaApp {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		String cpf = JOptionPane.showInputDialog("Informe seu CPF");
		Pessoa pessoa = new Pessoa(nome,cpf,null);
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.incluir(pessoa);
		
		List<Pessoa> lista=pessoaDAO.listar();
		for (Pessoa pessoaLista:lista) {
			System.out.println(pessoaLista.getNomeDoCliente());
		}
		String novoNome=JOptionPane.showInputDialog("Informe seu novo nome");
		pessoa.setNomeDoCliente(novoNome);
		pessoaDAO.atualizar(pessoa);
		
		lista=pessoaDAO.listar();
		for (Pessoa pessoaLista:lista) {
			System.out.println(pessoaLista.getNomeDoCliente());
		}
	}

}
