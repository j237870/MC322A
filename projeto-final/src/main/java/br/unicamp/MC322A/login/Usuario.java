package br.unicamp.MC322A.login;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private Long id;
    private final String login;
    private final String nome;
    private final String email;
    private final boolean administrador;

    private Usuario(Long id, String login, String nome, String email, boolean administrador) {
        List<String> camposNaoInformados = new ArrayList<>();
        if (login == null) {
            camposNaoInformados.add("login");
        }

        if (nome == null) {
            camposNaoInformados.add("nome");
        }

        if (email == null) {
            camposNaoInformados.add("email");
        }

        if (!camposNaoInformados.isEmpty()) {
            throw new CampoInvalidoException("Os campos " + camposNaoInformados + " não foram informados");
        }

        this.id = id;
        this.login = login;
        this.nome = nome;
        this.email = email;
        this.administrador = administrador;
    }

    public static Usuario criarUsuarioComum(Long id, String login, String nome, String email) {
        return new Usuario(id, login, nome, email, false);
    }

    public static Usuario criarUsuarioAdministrador(Long id, String login, String nome, String email) {
        return new Usuario(id, login, nome, email, true);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return administrador == usuario.administrador
            && Objects.equals(login, usuario.login)
            && Objects.equals(nome, usuario.nome)
            && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, nome, email, administrador);
    }

    @Override
    public String toString() {
        return "Usuario{" +
            "id=" + id +
            ", login='" + login + '\'' +
            ", nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", administrador=" + administrador +
            '}';
    }
}
