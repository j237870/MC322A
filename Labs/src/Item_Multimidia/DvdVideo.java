package Item_Multimidia;

import java.util.List;

public class DvdVideo extends ItemMultimidia{
	private List<String> elenco;
	private int duracao;
	private int numeroTotalCopias;
	private int numeroDisponivelCopias;
	private String legendasDisponiveis;
	private String audiosDisponiveis;
	private String estadoConservacao;
	
	public List<String> getElenco() {
		return elenco;
	}
	
	public void setElenco(List<String> elenco) {
		this.elenco = elenco;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
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
	
	public String getLegendasDisponiveis() {
		return legendasDisponiveis;
	}
	
	public void setLegendasDisponiveis(String legendasDisponiveis) {
		this.legendasDisponiveis = legendasDisponiveis;
	}
	
	public String getAudiosDisponiveis() {
		return audiosDisponiveis;
	}
	
	public void setAudiosDisponiveis(String audiosDisponiveis) {
		this.audiosDisponiveis = audiosDisponiveis;
	}
	
	public String getEstadoConservacao() {
		return estadoConservacao;
	}
	
	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
}
