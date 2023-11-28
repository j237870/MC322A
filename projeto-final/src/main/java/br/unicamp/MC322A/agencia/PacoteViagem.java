package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.List;
import java.util.Objects;

public class PacoteViagem {
    private Long id;
    private final String nome;
    private final List<Destino> destinos;
    private final List<Disponibilidade> disponibilidades;
    private final double valor;

    public PacoteViagem(String nome, List<Destino> destinos, List<Disponibilidade> disponibilidades, double valor) {
        if (nome == null || nome.isBlank()) {
            throw new CampoInvalidoException("O nome do pacote não foi informado");
        }

        if (destinos == null || destinos.isEmpty()) {
            throw new CampoInvalidoException("É necessário informar ao menos um destino para o pacote");
        }

        if (disponibilidades == null || disponibilidades.isEmpty()) {
            throw new CampoInvalidoException("É necessário informar ao menos uma disponibilidade para o pacote");
        }

        if (valor < 0.1) {
            throw new CampoInvalidoException("O pacote deve possuir um valor de venda");
        }

        this.nome = nome;
        this.destinos = destinos;
        this.disponibilidades = disponibilidades;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public List<Disponibilidade> getDisponibilidades() {
        return disponibilidades;
    }

    public double getValor() {
        return valor;
    }

    public void adicionarDestino(Destino destino) {
        if (destino != null) {
            this.destinos.add(destino);
        }
    }

    public void adicionarDisponibilidade(Disponibilidade disponibilidade) {
        if (disponibilidade != null) {
            this.disponibilidades.add(disponibilidade);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacoteViagem that = (PacoteViagem) o;
        return Double.compare(valor, that.valor) == 0 && Objects.equals(nome, that.nome) && Objects.equals(destinos, that.destinos) && Objects.equals(disponibilidades, that.disponibilidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, destinos, disponibilidades, valor);
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
            "nome='" + nome + '\'' +
            ", destinos=" + destinos +
            ", disponibilidades=" + disponibilidades +
            ", valor=" + valor +
            '}';
    }
}
