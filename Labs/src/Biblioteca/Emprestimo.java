package Biblioteca;

import java.util.Date;

import Item_Multimidia.*;
import Pessoa.*;

public class Emprestimo {
	private ItemMultimidia item;
	private Date dataSaida;
	private Date dataPrevista;
	private Membro membro;
	
	public Emprestimo(ItemMultimidia item, Date dataSaida, Membro membro) {
		this.item = item;
		this.dataSaida = dataSaida;
		this.membro = membro;
		this.dataPrevista = new Date(dataSaida.getYear(), dataSaida.getMonth(), dataSaida.getDate() + membro.prazoEmprestimo());
	}

	public ItemMultimidia getItem() {
		return item;
	}
	
	public void setItem(ItemMultimidia item) {
		this.item = item;
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
	
	public Membro getMembro() {
		return membro;
	}
	
	public void setMembro(Membro membro) {
		this.membro = membro;
	}	
}

