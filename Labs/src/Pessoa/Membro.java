package Pessoa;

import java.util.Date;

public abstract class Membro {
	private String nome;
	private int numeroIdentificacao;
	private String endereco;
	private String contato;
	private Date dataRegistro;
	
	public abstract int limiteEmprestimo();
	
	public abstract int prazoEmprestimo();
	
	public abstract double multaAtraso();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}
	
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
}
