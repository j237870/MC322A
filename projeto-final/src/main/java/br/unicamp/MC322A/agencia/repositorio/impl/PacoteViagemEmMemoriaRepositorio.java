package br.unicamp.MC322A.agencia.repositorio.impl;

import br.unicamp.MC322A.agencia.PacoteViagem;
import br.unicamp.MC322A.agencia.exception.NaoEncontradoException;
import br.unicamp.MC322A.agencia.exception.ParametroInvalidoException;
import br.unicamp.MC322A.agencia.repositorio.Repositorio;
import br.unicamp.MC322A.login.Usuario;

import java.util.*;

public class PacoteViagemEmMemoriaRepositorio implements Repositorio<PacoteViagem> {
    private Map<Long, PacoteViagem> pacotes = new HashMap<>();
    private Random random = new Random();

    @Override
    public PacoteViagem salvar(PacoteViagem pacote) {
        if (pacote == null) {
            throw new ParametroInvalidoException("Usuário não informado");
        }

        if (pacote.getId() != null) {
            this.pacotes.put(pacote.getId(), pacote);

        } else {
            Long id = this.getIdDisponivel();
            pacote.setId(id);
            this.pacotes.put(id, pacote);
        }

        return pacote;
    }

    private Long getIdDisponivel() {
        Long id = null;
        do {
            id = random.nextLong();
        } while(this.pacotes.containsKey(id));

        return id;
    }

    @Override
    public PacoteViagem buscarPorId(Long id) {
        return this.pacotes.get(id);
    }

    @Override
    public List<PacoteViagem> listar() {
        return new ArrayList<>(this.pacotes.values());
    }

    @Override
    public void apagar(Long id) {
        this.pacotes.remove(id);
    }
}
