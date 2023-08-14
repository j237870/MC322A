package Classes;

import java.util.Date;

public class Emprestimo {
	private Livro livro;
	private Date dataSaida;
	private Date dataPrevista;
	private Membro membro;
	
	// Construtor	
	public Emprestimo(Livro livro, Date dataSaida, Date dataPrevista, Membro membro) {
		this.livro = livro;
		this.dataSaida = dataSaida;
		this.dataPrevista = dataPrevista;
		this.membro = membro;
	}
	
	// Getters e setters
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Date getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public Membro getMembro() {
		return membro;
	}
	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	@Override
	public String toString() {
		return "Emprestimo [livro=" + livro + ", dataSaida=" + dataSaida + ", dataPrevista=" + dataPrevista
				+ ", membro=" + membro + "]";
	}
	
	
}
