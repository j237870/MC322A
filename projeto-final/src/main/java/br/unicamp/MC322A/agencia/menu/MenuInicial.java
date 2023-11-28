package br.unicamp.MC322A.agencia.menu;

import br.unicamp.MC322A.agencia.exception.FluxoException;
import br.unicamp.MC322A.agencia.repositorio.impl.PacoteViagemEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.repositorio.impl.UsuarioEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.suporte.Infra;
import br.unicamp.MC322A.login.Sessao;

import java.util.Scanner;

import static br.unicamp.MC322A.App.mostrarOpcao;
import static br.unicamp.MC322A.App.prompt;

public class MenuInicial {
    private final Scanner input;
    private final UsuarioEmMemoriaRepositorio usuarioRepo;
    private final PacoteViagemEmMemoriaRepositorio pacoteRepo;

    private final MenuGerenciarPacotes menuGerenciarPacotes;

    public MenuInicial(Scanner input, UsuarioEmMemoriaRepositorio usuarioRepo) {
        this.input = input;
        this.usuarioRepo = usuarioRepo;
        this.menuGerenciarPacotes = new MenuGerenciarPacotes(this.input);
        this.pacoteRepo = Infra.getInstancia(PacoteViagemEmMemoriaRepositorio.class);
    }

    public void mostrar() {
        String op = "";
        do {
            if (Sessao.temUsuarioLogado()) {
                mostrarOpcao(" [G] - Gerenciar pacotes", true);
                mostrarOpcao(" [P] - Pacotes de Viagem", false);
                mostrarOpcao(" [O] - Ofertas", false);
                mostrarOpcao(" [S] - Sair", false);
                prompt("\n Informe sua opção: ");
                op = input.nextLine();

                switch (op.toUpperCase()) {
                    case "G":
                        menuGerenciarPacotes.mostrar();
                        break;
                    case "P":
                        listarPacotes();
                        break;
                    case "O":
                        System.out.println("Ver ofertas");
                        break;
                    case "S":
                        System.out.println("Até logo " + Sessao.getUsuarioLogado().getNome());
                        Sessao.logout();
                        break;
                    default:
                        System.out.println("Opção inválida [" + op + "]");
                        op = "";
                }
            } else {
                try {
                    fazerLogin();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!op.equalsIgnoreCase("S"));
    }

    private void fazerLogin() {
        prompt("Login: ");
        String login = input.nextLine();
        if (login == null) {
            throw new FluxoException("Necessário informar o login");
        }

        Sessao.login(usuarioRepo.getByLogin(login));
        System.out.println("Seja muito bem vindo " + Sessao.getUsuarioLogado().getNome() + "\n");
    }

    private void listarPacotes() {
        this.pacoteRepo.listar().forEach(p -> {
            System.out.println(p);
            System.out.println();
        });
    }
}
