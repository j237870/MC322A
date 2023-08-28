package Item_Multimidia;

import java.util.List;

import Pessoa.Autor;

public class Ebook {
	private String titulo;
	private List<Autor> listaAutores; //Composição com a classe Autor
	private int anoPublicacao;
	private String url;
	private String assunto;
		
	// Construtor
	public Ebook(String titulo, List<Autor> listaAutores, int anoPublicacao, String url, String assunto) {
		this.titulo = titulo;
		this.listaAutores = listaAutores;
		this.anoPublicacao = anoPublicacao;
		this.url = url;
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
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
