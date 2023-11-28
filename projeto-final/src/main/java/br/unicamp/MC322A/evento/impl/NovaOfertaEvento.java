package br.unicamp.MC322A.evento.impl;

import br.unicamp.MC322A.agencia.Oferta;
import br.unicamp.MC322A.evento.Evento;

import java.util.Objects;

public class NovaOfertaEvento extends Evento<Oferta> {
    public NovaOfertaEvento(String nome, Oferta conteudo) {
        super(nome, conteudo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NovaOfertaEvento evento = (NovaOfertaEvento) o;
        return Objects.equals(getNome(), evento.getNome()) && Objects.equals(getConteudo(), evento.getConteudo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudo());
    }

    @Override
    public String toString() {
        return "NovaOfertaEvento{"+
            "nome=" + getNome() +
            ", conteudo=" + getConteudo() +
            '}';
    }
}
