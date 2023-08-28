package Biblioteca;

import java.util.List;

import Item_Multimidia.Livro;
import Pessoa.Funcionario;
import Pessoa.Membro;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private List<Livro> listaLivros; //Agregação com a classe Livro
	private List<Funcionario> listaFuncionarios; //Composição com a classe Funcionario
	private List<Membro> listaMembros = new ArrayList<Membro>(); //Composição com a classe Membro
	private List<Emprestimo> listaEmprestimos; //Composição com a classe Emprestimo
	private int maxLivros;
	
	// Construtor
	public Biblioteca(String nome, int maxLivros, List<Funcionario> listaFuncionarios) {
		this.nome = nome;
		this.maxLivros = maxLivros;
		this.listaFuncionarios = listaFuncionarios;
		listaLivros = new ArrayList<Livro>(maxLivros);
		listaEmprestimos = new ArrayList<Emprestimo>(maxLivros);
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	
	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}
	
	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public List<Membro> getListaMembros() {
		return listaMembros;
	}
		
	public void fazEmprestimos(Emprestimo emprestimo) {
		this.listaEmprestimos.add(emprestimo);
	}
	
	public void adicionaLivro(Livro livro) {
		if(listaLivros.size() < maxLivros)
			listaLivros.add(livro);
		else
			System.out.println("A biblioteca está cheia.");
	}
	
	public void adicionaMembro(Membro membro) {
		listaMembros.add(membro);
	}

	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", listaLivros=" + listaLivros + ", listaFuncionarios=" + listaFuncionarios
				+ ", listaMembros=" + listaMembros + ", listaEmprestimos=" + listaEmprestimos + ", maxLivros="
				+ maxLivros + "]";
	}

}
