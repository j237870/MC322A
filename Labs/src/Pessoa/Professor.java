package Pessoa;

public class Professor extends Membro{

	@Override
	public int limiteEmprestimo() {
		return 7;
	}

	@Override
	public int prazoEmprestimo() {
		return 30;
	}

	@Override
	public double multaAtraso() {
		return 0.5;
	}
		
}
