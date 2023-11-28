package br.unicamp.MC322A.evento;

public abstract class Evento<T> {
    private final String nome;
    private final T conteudo;

    public Evento(String nome, T conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public T getConteudo() {
        return conteudo;
    }

    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public abstract String toString();
}
