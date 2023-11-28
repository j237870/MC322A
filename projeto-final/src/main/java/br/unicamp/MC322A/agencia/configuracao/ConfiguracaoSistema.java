package br.unicamp.MC322A.agencia.configuracao;

import br.unicamp.MC322A.agencia.*;
import br.unicamp.MC322A.agencia.repositorio.impl.PacoteViagemEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.repositorio.impl.UsuarioEmMemoriaRepositorio;
import br.unicamp.MC322A.agencia.suporte.Infra;
import br.unicamp.MC322A.login.Usuario;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static br.unicamp.MC322A.agencia.suporte.Infra.registrarClasse;

public class ConfiguracaoSistema {
    private ConfiguracaoSistema() {}


    public static void configurar() {
        configurar(false);
    }
    public static void configurar(boolean incluirDadosExemplo) {
        UsuarioEmMemoriaRepositorio userRepo = new UsuarioEmMemoriaRepositorio();
        registrarClasse(UsuarioEmMemoriaRepositorio.class, userRepo);

        PacoteViagemEmMemoriaRepositorio pacoteRepo = new PacoteViagemEmMemoriaRepositorio();
        registrarClasse(PacoteViagemEmMemoriaRepositorio.class, pacoteRepo);

        if (incluirDadosExemplo) {
            userRepo.salvar(Usuario.criarUsuarioAdministrador(1L, "adm", "Usuario Administrador", "administrador@email.com"));
            userRepo.salvar(Usuario.criarUsuarioComum(2L, "user", "Usuario Comun", "comum@email.com.br"));

            pacoteRepo.salvar(new PacoteViagem("Sul do Brasil",
                List.of(new Destino("Santa Catarina",
                    "Região super top",
                    Arrays.asList("Imagem 1", "Imagem 2"),
                    Arrays.asList("Rapel", "Lancha"),
                    Categoria.AVENTURA)),
                List.of(new Disponibilidade(new Periodo(LocalDateTime.now().plusDays(3L), LocalDateTime.now().plusDays(5L)), 5)),
                799.0));
        }
    }
}
