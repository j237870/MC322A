package Pessoa;

public class Funcionario {
	private String nome;
	private int registro;
	
	// Construtor
	public Funcionario(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", registro=" + registro + "]";
	}
		
}