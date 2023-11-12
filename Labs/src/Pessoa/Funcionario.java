package Pessoa;

public class Funcionario extends Membro{

	@Override
	public int limiteEmprestimo() {
		return 4;
	}

	@Override
	public int prazoEmprestimo() {
		return 20;
	}

	@Override
	public double multaAtraso() {
		return 0.75;
	}
		
}