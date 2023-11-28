package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.Objects;

public class Oferta {
    private final PacoteViagem pacote;
    private final double valor;
    private final Periodo vigencia;


    public Oferta(PacoteViagem pacote, double valor, Periodo vigencia) {
        if (pacote == null) {
            throw new CampoInvalidoException("Pacote não foi informado");
        }

        if (valor < 0.1) {
            throw new CampoInvalidoException("Valor precisa ser de pelo menos 0.1 centavos");
        }

        if (vigencia == null) {
            throw new CampoInvalidoException("Vigência da oferta não foi informada");
        }

        this.pacote = pacote;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public double getValor() {
        return valor;
    }

    public Periodo getVigencia() {
        return vigencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return Double.compare(valor, oferta.valor) == 0 && Objects.equals(pacote, oferta.pacote) && Objects.equals(vigencia, oferta.vigencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacote, valor, vigencia);
    }

    @Override
    public String toString() {
        return "Oferta{" +
            "pacote=" + pacote +
            ", valor=" + valor +
            ", vigencia=" + vigencia +
            '}';
    }
}
