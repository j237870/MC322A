package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Item_Multimidia.ItemMultimidia;
import Pessoa.Funcionario;
import Pessoa.Membro;

public class Biblioteca {
	private String nome;
	private List<ItemMultimidia> listaItems; //Agregação com a classe Livro
	private List<Funcionario> listaFuncionarios; //Composição com a classe Funcionario
	private List<Membro> listaMembros = new ArrayList<Membro>(); //Composição com a classe Membro
	private List<Emprestimo> listaEmprestimos; //Composição com a classe Emprestimo
	private List<Reserva> listaReservas;
	
	// Construtor
	public Biblioteca(String nome, List<Funcionario> listaFuncionarios) {
		this.nome = nome;
		this.listaFuncionarios = listaFuncionarios;
		listaItems = new ArrayList<ItemMultimidia>();
		listaEmprestimos = new ArrayList<Emprestimo>();
		listaReservas = new ArrayList<Reserva>();
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<ItemMultimidia> getListaLivros() {
		return listaItems;
	}
	
	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}
	
	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public List<Membro> getListaMembros() {
		return listaMembros;
	}
	
	private long getEmprestimosDoMembro(Membro membro) {
		return this.listaEmprestimos
				.stream()
				.filter(e -> e.getMembro().equals(membro))
				.count();
	}
	
	private Date getDataDevolucaoMaisRecente(ItemMultimidia item) {
		return this.listaEmprestimos
				.stream()
				.filter(i -> i.getItem().equals(item))
				.map(Emprestimo::getDataPrevista)
				.min(Date::compareTo)
				.orElse(new Date());
	}
		
	public void fazEmprestimos(Membro membro, ItemMultimidia item) {
		if(item.getNumeroDisponivelCopias() == 0) {
			this.fazReserva(membro, item);
			return;
		}
		
		if(getEmprestimosDoMembro(membro) >= membro.limiteEmprestimo()) {
			System.err.println("Limite de empréstimo atingido para o membro" + membro.getNome());
			return;
		}
		
		this.listaEmprestimos.add(new Emprestimo(item, new Date(), membro));
	}
	
	public void fazReserva(Membro membro, ItemMultimidia item) {
		Date dataReserva = new Date();
		
		if(item.getNumeroDisponivelCopias() == 0) {
			dataReserva = this.getDataDevolucaoMaisRecente(item);
		}
		
		this.listaReservas.add(new Reserva(membro, item, dataReserva));
	}
	
	public void adicionaItemMultimidia(ItemMultimidia item) {
		listaItems.add(item);
	}
	
	public void adicionaMembro(Membro membro) {
		listaMembros.add(membro);
	}

}
