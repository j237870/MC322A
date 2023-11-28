package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.Objects;

public class Disponibilidade {
    private final Periodo periodo;
    private final int vagas;

    public Disponibilidade(Periodo periodo, int vagas) {
        if (periodo == null) {
            throw new CampoInvalidoException("É necessário informar o período");
        }

        if (vagas < 0) {
            throw new CampoInvalidoException("O número de vagas não pode ser negativo");
        }

        this.periodo = periodo;
        this.vagas = vagas;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public int getVagas() {
        return vagas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disponibilidade that = (Disponibilidade) o;
        return vagas == that.vagas && Objects.equals(periodo, that.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodo, vagas);
    }

    @Override
    public String toString() {
        return "Disponibilidade{" +
            "periodo=" + periodo +
            ", vagas=" + vagas +
            '}';
    }
}
