package br.unicamp.MC322A;

import br.unicamp.MC322A.agencia.configuracao.ConfiguracaoSistema;
import br.unicamp.MC322A.agencia.exception.FluxoException;
import br.unicamp.MC322A.agencia.menu.MenuInicial;
import br.unicamp.MC322A.agencia.repositorio.impl.UsuarioEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.suporte.Infra;
import br.unicamp.MC322A.login.Sessao;

import java.util.Scanner;

public class App {
    private final MenuInicial menuInicial;

    public App() {
        UsuarioEmMemoriaRepositorio usuarioRepo = Infra.getInstancia(UsuarioEmMemoriaRepositorio.class);
        this.menuInicial = new MenuInicial(new Scanner(System.in), usuarioRepo);
    }

    public static void main(String[] args) {
        ConfiguracaoSistema.configurar(true);
        new App().montarMenuInicial();
    }

    private void montarMenuInicial() {
        limparTela();
        this.menuInicial.mostrar();
    }

    public static void mostrarOpcao(String texto, boolean apenasAdmnistrador) {
        if(apenasAdmnistrador && !Sessao.usuarioLogadoEhAdministrador()) {
            return;
        }

        System.out.println(texto);
    }

    public static void prompt(String texto) {
        System.out.print(texto);
    }
    public static void limparTela() {
        for(int i = 0; i < 50; i++) System.out.println();
    }
}
