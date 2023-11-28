package br.unicamp.MC322A.agencia.repositorio;

import java.util.List;

public interface Repositorio<T> {
    T salvar(T item);
    T buscarPorId(Long id);
    List<T> listar();
    void apagar(Long id);
}
