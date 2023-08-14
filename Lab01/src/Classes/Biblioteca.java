package Classes;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	private List<Livro> listaLivros;
	private List<Funcionario> listaFuncionarios;
	private List<Membro> listaMembros;
	private List<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>();
	
	// Construtor
	public Biblioteca(List<Livro> listaLivros, List<Funcionario> listaFuncionarios, List<Membro> listaMembros) {
		this.listaLivros = listaLivros;
		this.listaFuncionarios = listaFuncionarios;
		this.listaMembros = listaMembros;
	}
	
	// Getters e setters
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
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
	public void setListaMembros(List<Membro> listaMembros) {
		this.listaMembros = listaMembros;
	}
	
	
	public void fazEmprestimos(Emprestimo emprestimo) {
		this.listaEmprestimos.add(emprestimo);
	}

	@Override
	public String toString() {
		return "Biblioteca [listaLivros=" + listaLivros + ", listaFuncionarios=" + listaFuncionarios + ", listaMembros="
				+ listaMembros + ", listaEmprestimos=" + listaEmprestimos + "]";
	}
	
	
	
}
