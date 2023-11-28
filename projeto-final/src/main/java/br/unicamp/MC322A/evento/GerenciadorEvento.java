package br.unicamp.MC322A.evento;

public interface GerenciadorEvento<T extends Evento<?>> {
    void registrarOuvinte(Ouvinte<T> ouvinte);
    void cancelarOuvinte(Ouvinte<T> ouvinte);
    void publicarEvento(T evento);
}
