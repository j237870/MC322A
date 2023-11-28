package br.unicamp.MC322A.evento.impl;

import br.unicamp.MC322A.agencia.exception.ParametroInvalidoException;
import br.unicamp.MC322A.evento.GerenciadorEvento;
import br.unicamp.MC322A.evento.Ouvinte;

import java.util.HashSet;
import java.util.Set;

public class NovaOfertaGerenciadorEvento implements GerenciadorEvento<NovaOfertaEvento> {
    private final Set<Ouvinte<NovaOfertaEvento>> ouvintes = new HashSet<>();

    @Override
    public void registrarOuvinte(Ouvinte<NovaOfertaEvento> ouvinte) {
        if (ouvinte == null) {
            throw new ParametroInvalidoException("Ouvinte do evento não foi informado");
        }

        this.ouvintes.add(ouvinte);
    }

    @Override
    public void cancelarOuvinte(Ouvinte<NovaOfertaEvento> ouvinte) {
        if (ouvinte == null) {
            throw new ParametroInvalidoException("Ouvinte do evento não foi informado");
        }

        this.ouvintes.remove(ouvinte);
    }

    @Override
    public void publicarEvento(NovaOfertaEvento evento) {
        this.ouvintes.forEach(o -> o.processarEvento(evento));
    }
}
