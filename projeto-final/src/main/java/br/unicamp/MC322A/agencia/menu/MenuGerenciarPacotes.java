package br.unicamp.MC322A.agencia.menu;

import br.unicamp.MC322A.agencia.*;
import br.unicamp.MC322A.agencia.repositorio.impl.PacoteViagemEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.suporte.Infra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static br.unicamp.MC322A.App.*;

public class MenuGerenciarPacotes {
    private final Scanner input;

    private final PacoteViagemEmMemoriaRepositorio pacoteRepo;

    public MenuGerenciarPacotes(Scanner input) {
        this.input = input;
        this.pacoteRepo = Infra.getInstancia(PacoteViagemEmMemoriaRepositorio.class);
    }

    public void mostrar() {
        limparTela();
        String op = "";
        do {
            mostrarOpcao(" [I] Incluir pacote", true);
            mostrarOpcao(" [A] Alterar pacote", true);
            mostrarOpcao(" [R] Remover pacote", true);
            mostrarOpcao(" [V] Voltar", false);
            System.out.println("\n Informe sua opção: ");
            op = input.nextLine();

            switch (op.toUpperCase()) {
                case "I":
                    incluirPacote();
                    limparTela();
                    System.out.println("Pacote salvo com sucesso!");
                    break;
                case "A":
                    System.out.println("Alterando pacote");
                    break;
                case "R":
                    System.out.println("Removendo pacote");
                    break;
                case "V":
                    limparTela();
                    break;
                default:
                    System.out.println("Opção inválida [" + op + "]");
                    op = "";
            }
        } while (!op.equalsIgnoreCase("V"));
    }

    private void incluirPacote() {
        limparTela();
        System.out.println(" -- NOVO PACOTE --\n\n");

        prompt("* Nome do pacote: ");
        String nomePacote = input.nextLine();

        prompt("* Valor: ");
        double valorPacote = input.nextDouble();

        prompt("Quantos destinos nesse pacote: ");
        int totalDestinos = input.nextInt();

        List<Destino> destinos = new ArrayList<>(totalDestinos);
        for(int i = 0; i < totalDestinos; i++) {
            prompt("* Nome do " + (i+1) + "º destino: ");
            String nomeDestino = input.nextLine();

            prompt("* Descrição do " + (i+1) + "º destino: ");
            String descricaoDestino = input.nextLine();

            prompt("* Imagens do " + (i+1) + "º destino (informe separados por |): ");
            String imagensDestino = input.nextLine();

            prompt("Atividdes no " + (i+1) + "º destino (informe separados por |): ");
            String atividadesDestino = input.nextLine();

            prompt("* Qual categoria do " + (i+1) + "º Destino: [1] AVENTURA | [2] CULTURA | [3] RELAXAMENTO: ");
            int categoriaDestino = input.nextInt();

            destinos.add(new Destino(nomeDestino,
                descricaoDestino,
                Arrays.asList(imagensDestino.split("[|]")),
                Arrays.asList(atividadesDestino.split("[|]")),
                Categoria.porCodigo(categoriaDestino)));
        }

        prompt("Quantas viagens estão programadas: ");
        int totalDisponibiliddes = input.nextInt();
        List<Disponibilidade> disponibilidades = new ArrayList<>();
        for (int i = 0; i < totalDisponibiliddes; i++) {
            prompt("Informe a data de saída do " + (i+1) + "º período (DD/MM/AAAA): ");
            String dataSaida = input.nextLine();

            prompt("Informe a hora de saída do " + (i+1) + "º período (HH:MM:SS): ");
            String horaSaida = input.nextLine();

            prompt("Informe a data de retorno do " + (i+1) + "º período (DD/MM/AAAA): ");
            String dataRetorno = input.nextLine();

            prompt("Informe a hora do retorno do " + (i+1) + "º período (HH:MM:SS): ");
            String horaRetorno = input.nextLine();

            prompt("Quantas vagas para o " + (i+1) + "º período: ");
            int vagas = input.nextInt();

            String dataHoraSaida = dataSaida + "T" + horaSaida;
            String dataHoraRetorno = dataRetorno + "T" + horaRetorno;
            disponibilidades.add(new Disponibilidade(new Periodo(dataHoraSaida, dataHoraRetorno), vagas));
        }

        this.pacoteRepo.salvar(new PacoteViagem(nomePacote, destinos, disponibilidades, valorPacote));
    }
}
