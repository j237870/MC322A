package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Destino {
    private final String nome;
    private final String descricao;
    private final List<String> imagens;
    private final List<String> atividades;
    private final Categoria categoria;

    public Destino(String nome, String descricao, List<String> imagens, List<String> atividades, Categoria categoria) {
        if (nome == null || nome.isBlank()) {
            throw new CampoInvalidoException("Nome do destino não foi informado");
        }

        if (imagens == null || imagens.isEmpty()) {
            throw new CampoInvalidoException("Nenhuma imagem do destino foi informada");
        }

        if (categoria == null) {
            throw new CampoInvalidoException("Categoria do destino não foi informada");
        }

        this.nome = nome;
        this.descricao = descricao;
        this.imagens = imagens;
        this.atividades = atividades != null ? atividades : new ArrayList<>();
        this.categoria = categoria;
    }

    public Destino(String nome, String descricao, List<String> imagens, Categoria categoria) {
        this(nome, descricao, imagens, null, categoria);
    }

    public void adicionarImagem(String imagem) {
        if (imagem != null && !this.imagens.contains(imagem)) {
            this.imagens.add(imagem);
        }
    }

    public void adicionarAtividade(String atividade) {
        if (atividade != null && !this.atividades.contains(atividade)) {
            this.atividades.add(atividade);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getImagens() {
        return imagens;
    }

    public List<String> getAtividades() {
        return atividades;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(nome, destino.nome) && Objects.equals(descricao, destino.descricao) && categoria == destino.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, categoria);
    }

    @Override
    public String toString() {
        return "Destino{" +
            "nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", imagens=" + imagens +
            ", atividades=" + atividades +
            ", categoria=" + categoria +
            '}';
    }
}
