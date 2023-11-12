package Item_Multimidia;

public class Outro extends ItemMultimidia{
	private String tipoRecurso;
	private String formato;
	private int numeroTotalCopias;
	private int numeroDisponivelCopias;
	private String localizacao;
	private String estadoConservacao;
	
	public String getTipoRecurso() {
		return tipoRecurso;
	}
	
	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
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
