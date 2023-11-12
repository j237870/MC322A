package Pessoa;

public class EstudantePosGraduacao extends Membro{

	@Override
	public int limiteEmprestimo() {
		return 5;
	}

	@Override
	public int prazoEmprestimo() {
		return 20;
	}

	@Override
	public double multaAtraso() {
		return 1.0;
	}

}
