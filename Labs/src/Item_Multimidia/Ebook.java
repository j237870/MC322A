package Item_Multimidia;

import java.util.Date;

public class Ebook extends ItemMultimidia{
	private String formato;
	private int numeroTotalLicencas;
	private String url;
	private String requisitosLeitura;
	private Date dataDisponibilidade;
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public int getNumeroTotalLicencas() {
		return numeroTotalLicencas;
	}
	
	public void setNumeroTotalLicencas(int numeroTotalLicencas) {
		this.numeroTotalLicencas = numeroTotalLicencas;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getRequisitosLeitura() {
		return requisitosLeitura;
	}
	
	public void setRequisitosLeitura(String requisitosLeitura) {
		this.requisitosLeitura = requisitosLeitura;
	}
	
	public Date getDataDisponibilidade() {
		return dataDisponibilidade;
	}
	
	public void setDataDisponibilidade(Date dataDisponibilidade) {
		this.dataDisponibilidade = dataDisponibilidade;
	}

	@Override
	public int getNumeroDisponivelCopias() {
		throw new UnsupportedOperationException("Esse formato não aceita empréstimos ou reservas");
	}
}
