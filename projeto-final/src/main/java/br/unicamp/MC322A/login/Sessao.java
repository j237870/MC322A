package br.unicamp.MC322A.login;

public class Sessao {
    private static Usuario usuarioLogado;

    private Sessao() {
    }

    public static void login(Usuario usuario) {
        usuarioLogado = usuario;
    }

    public static void logout() {
        usuarioLogado = null;
    }

    public static boolean temUsuarioLogado() {
        return usuarioLogado != null;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static boolean usuarioLogadoEhAdministrador() {
        return temUsuarioLogado() && usuarioLogado.isAdministrador();
    }
}
