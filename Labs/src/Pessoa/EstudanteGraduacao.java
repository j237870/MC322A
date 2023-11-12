package Pessoa;

public class EstudanteGraduacao extends Membro{

	@Override
	public int limiteEmprestimo() {
		return 3;
	}

	@Override
	public int prazoEmprestimo() {
		return 15;
	}

	@Override
	public double multaAtraso() {
		return 1.0;
	}
	
}
