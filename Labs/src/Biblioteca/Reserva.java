package Biblioteca;

import java.util.Date;

import Item_Multimidia.ItemMultimidia;
import Pessoa.Membro;

public class Reserva {
	private Membro membro;
	private ItemMultimidia item;
	private Date dataReserva;
	
	public Reserva(Membro membro, ItemMultimidia item, Date dataReserva) {
		this.membro = membro;
		this.item = item;
		this.dataReserva = dataReserva;
	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	public ItemMultimidia getItem() {
		return item;
	}

	public void setItem(ItemMultimidia item) {
		this.item = item;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	@Override
	public String toString() {
		return "Reserva [membro=" + membro + ", item=" + item + ", dataReserva=" + dataReserva + "]";
	}
}
