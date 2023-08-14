package Classes;

import java.util.List;

public class Livro {
	private String titulo;
	private List<Autor> listaAutores;
	private String nChamada;
	private int tombo;
	private String assunto;
		
	// Construtor
	public Livro(String titulo, List<Autor> listaAutores, String nChamada, int tombo, String assunto) {
		this.titulo = titulo;
		this.listaAutores = listaAutores;
		this.nChamada = nChamada;
		this.tombo = tombo;
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

	public String getnChamada() {
		return nChamada;
	}

	public void setnChamada(String nChamada) {
		this.nChamada = nChamada;
	}

	public int getTombo() {
		return tombo;
	}

	public void setTombo(int tombo) {
		this.tombo = tombo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", listaAutores=" + listaAutores + ", nChamada=" + nChamada + ", tombo="
				+ tombo + ", assunto=" + assunto + "]";
	}
	
	
		
}
