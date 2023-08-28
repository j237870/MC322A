package Item_Multimidia;

import java.util.List;

import Pessoa.Autor;

public class Dissertacao {
	private String titulo;
	private List<Autor> listaAutores; //Composição com a classe Autor
	private String orientador;
	private String notacao;
	private String assunto;
	
	//Atributo private sem getter
	private boolean disponivel = true;
	
	// Construtor
	public Dissertacao(String titulo, List<Autor> listaAutores, String orientador, String notacao, String assunto) {
		this.titulo = titulo;
		this.listaAutores = listaAutores;
		this.orientador = orientador;
		this.notacao = notacao;
		this.assunto = assunto;
	}
	
	// Getters e setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public List<Autor> getListaAutores() {
		return listaAutores;
	}
	
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	public String getOrientador() {
		return orientador;
	}
	
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	
	public String getNotacao() {
		return notacao;
	}
	
	public void setNotacao(String notacao) {
		this.notacao = notacao;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public void marqueDisponivel() {
		disponivel = true;
	}
	
	public void marqueIndisponivel() {
		disponivel = false;
	}
	
	public boolean checaDisponibilidade() {
		return disponivel;
	}
}
