package br.unicamp.MC322A.agencia.repositorio.impl;

import br.unicamp.MC322A.agencia.exception.NaoEncontradoException;
import br.unicamp.MC322A.agencia.exception.ParametroInvalidoException;
import br.unicamp.MC322A.agencia.repositorio.Repositorio;
import br.unicamp.MC322A.login.Usuario;

import java.util.*;

public class UsuarioEmMemoriaRepositorio implements Repositorio<Usuario> {
    private Map<Long, Usuario> usuarios = new HashMap<>();
    private Random random = new Random();

    @Override
    public Usuario salvar(Usuario usuario) {
        if (usuario == null) {
            throw new ParametroInvalidoException("Usuário não informado");
        }

        if (usuario.getId() != null) {
            this.usuarios.put(usuario.getId(), usuario);

        } else {
            Long id = this.getIdDisponivel();
            usuario.setId(id);
            this.usuarios.put(id, usuario);
        }

        return usuario;
    }

    private Long getIdDisponivel() {
        Long id = null;
        do {
            id = random.nextLong();
        } while(this.usuarios.containsKey(id));

        return id;
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return this.usuarios.get(id);
    }

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(this.usuarios.values());
    }

    @Override
    public void apagar(Long id) {
        this.usuarios.remove(id);
    }

    public Usuario getByLogin(String login) {
        return
            this.usuarios
                .values()
                .stream()
                .filter(u -> u.getLogin().equals(login))
                .findAny()
                .orElseThrow(() -> new NaoEncontradoException("Usuário " + login + " não encontrado"));
    }
}
