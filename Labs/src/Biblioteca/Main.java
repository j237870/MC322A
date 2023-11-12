package Biblioteca;

import java.util.Arrays;
import java.util.Date;

import Pessoa.*;
import Item_Multimidia.*;

public class Main {
	public static void main(String[] args) {
		Autor ayres = new Autor("Ayres, Frank");
		Livro trigonometria = new Livro("Trigonometria : plana e esférica", Arrays.asList(ayres), 1958, "514 Ay74t", 1010279669, "Trigonometria");
		Membro joao = new Membro("João Vitor Gomes do Nascimento", 237870);
		Emprestimo emprestimo = new Emprestimo(trigonometria, new Date(2023, 8, 7), new Date(2023, 8, 14), joao);
		Funcionario pereira = new Funcionario("Seu Pereira", 2);
		Biblioteca minhaBiblioteca = new Biblioteca("BAE", 1000, Arrays.asList(pereira));
		minhaBiblioteca.adicionaItemMultimidia(trigonometria);
		minhaBiblioteca.adicionaMembro(joao);
		minhaBiblioteca.fazEmprestimos(emprestimo);
		
		System.out.println(minhaBiblioteca);
	}
}