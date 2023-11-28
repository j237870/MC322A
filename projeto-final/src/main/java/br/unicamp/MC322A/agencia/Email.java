package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Email {
    private final String de;
    private final List<String> para;
    private final String assunto;
    private final String conteudo;

    public Email(String de, List<String> para, String assunto, String conteudo) {
        if (de == null) {
            throw new CampoInvalidoException("Campo 'de' não informado");
        }

        if (para == null || para.isEmpty()) {
            throw new CampoInvalidoException("Campo 'para' não informado");
        }

        this.de = de;
        this.para = para;
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public Email(String de, String para, String assunto, String conteudo) {
        this(de, Collections.singletonList(para), assunto, conteudo);
    }

    public String getDe() {
        return de;
    }

    public List<String> getPara() {
        return para;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(de, email.de) && Objects.equals(para, email.para) && Objects.equals(assunto, email.assunto) && Objects.equals(conteudo, email.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(de, para, assunto, conteudo);
    }

    @Override
    public String toString() {
        return "Email{" +
            "de='" + de + '\'' +
            ", para=" + para +
            ", assunto='" + assunto + '\'' +
            ", conteudo='" + conteudo + '\'' +
            '}';
    }
}
