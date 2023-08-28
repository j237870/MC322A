package Pessoa;

public class Autor {
	private String nome;
	
	// Construtor
	public Autor(String nome) {
		this.nome = nome;
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + "]";
	}
	
	
}
