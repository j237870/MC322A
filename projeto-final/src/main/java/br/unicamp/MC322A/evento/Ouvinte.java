package br.unicamp.MC322A.evento;

public interface Ouvinte<T extends Evento<?>> {
    void processarEvento(T evento);
}
