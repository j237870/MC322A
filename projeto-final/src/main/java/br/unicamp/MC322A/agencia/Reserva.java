package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;
import br.unicamp.MC322A.login.Usuario;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reserva {
    private final Usuario usuario;
    private final PacoteViagem pacote;
    private final LocalDateTime data;
    private final int quantidadeVagas;

    public Reserva(Usuario usuario, PacoteViagem pacote, LocalDateTime data, int quantidadeVagas) {
        if (usuario == null) {
            throw new CampoInvalidoException("Usuário da reserva não informado");
        }

        if (pacote == null) {
            throw new CampoInvalidoException("Pacote não foi informado");
        }

        if (data == null) {
            throw new CampoInvalidoException("Data de saída não foi informada");
        }

        if (quantidadeVagas < 1) {
            throw new CampoInvalidoException("O número de vagas deve ser de pelo menos 1 (uma)");
        }

        this.usuario = usuario;
        this.pacote = pacote;
        this.data = data;
        this.quantidadeVagas = quantidadeVagas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public LocalDateTime getData() {
        return data;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return quantidadeVagas == reserva.quantidadeVagas
            && Objects.equals(usuario, reserva.usuario)
            && Objects.equals(pacote, reserva.pacote)
            && Objects.equals(data, reserva.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, pacote, data, quantidadeVagas);
    }

    @Override
    public String toString() {
        return "Reserva{" +
            "usuario=" + usuario +
            ", pacote=" + pacote +
            ", data=" + data +
            ", quantidadeVagas=" + quantidadeVagas +
            '}';
    }
}
