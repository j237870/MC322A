package Item_Multimidia;

import java.util.List;

import Pessoa.Autor;

public class Livro {
	private String titulo;
	private List<Autor> listaAutores; //Composição com a classe Autor
	private int anoPublicacao;
	private String nChamada;
	private int tombo;
	private String assunto;
	
	//Atributo private sem getter
	private boolean disponivel = true;
		
	// Construtor
	public Livro(String titulo, List<Autor> listaAutores, int anoPublicacao, String nChamada, int tombo, String assunto) {
		this.titulo = titulo;
		this.listaAutores = listaAutores;
		this.anoPublicacao = anoPublicacao;
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
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
	
	public void marqueDisponivel() {
		disponivel = true;
	}
	
	public void marqueIndisponivel() {
		disponivel = false;
	}
	
	public boolean checaDisponibilidade() {
		return disponivel;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", listaAutores=" + listaAutores + ", nChamada=" + nChamada + ", tombo="
				+ tombo + ", assunto=" + assunto + "]";
	}	
}
