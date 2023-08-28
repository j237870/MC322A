package Item_Multimidia;

import java.util.List;

import Pessoa.Autor;

public class Audiolivro {
	private String titulo;
	private List<Autor> listaAutores; //Composição com a classe Autor
	private String narrador;
	private String notacao;
	private String url;
	private String assunto;
	
	// Construtor
	public Audiolivro(String titulo, List<Autor> listaAutores, String narrador, String notacao, String url, String assunto) {
		this.titulo = titulo;
		this.listaAutores = listaAutores;
		this.narrador = narrador;
		this.notacao = notacao;
		this.url =url;
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
	
	public String getNarrador() {
		return narrador;
	}
	
	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}
	
	public String getNotacao() {
		return notacao;
	}
	
	public void setNotacao(String notacao) {
		this.notacao = notacao;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
