package Item_Multimidia;

public class Livro extends ItemMultimidia{
	private String isbn;
	private String edicao;
	private int numeroTotalCopias;
	private int numeroDisponivelCopias;
	private String localizacao;
	private String estadoConservacao;
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public int getNumeroTotalCopias() {
		return numeroTotalCopias;
	}
	
	public void setNumeroTotalCopias(int numeroTotalCopias) {
		this.numeroTotalCopias = numeroTotalCopias;
	}
	
	public int getNumeroDisponivelCopias() {
		return numeroDisponivelCopias;
	}
	
	public void setNumeroDisponivelCopias(int numeroDisponivelCopias) {
		this.numeroDisponivelCopias = numeroDisponivelCopias;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String getEstadoConservacao() {
		return estadoConservacao;
	}
	
	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
}
