package Item_Multimidia;

import java.util.List;

public class CdAudio extends ItemMultimidia{
	private List<String> listaFaixas;
	private int duracaoTotal;
	private int numeroTotalCopias;
	private int numeroDisponivelCopias;
	private String estadoConservacao;
	
	public List<String> getListaFaixas() {
		return listaFaixas;
	}
	
	public void setListaFaixas(List<String> listaFaixas) {
		this.listaFaixas = listaFaixas;
	}
	
	public int getDuracaoTotal() {
		return duracaoTotal;
	}
	
	public void setDuracaoTotal(int duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
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
	
	public String getEstadoConservacao() {
		return estadoConservacao;
	}
	
	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
}
