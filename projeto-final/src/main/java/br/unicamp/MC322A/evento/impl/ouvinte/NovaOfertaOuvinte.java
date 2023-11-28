package br.unicamp.MC322A.evento.impl.ouvinte;

import br.unicamp.MC322A.agencia.Email;
import br.unicamp.MC322A.evento.Ouvinte;
import br.unicamp.MC322A.evento.impl.NovaOfertaEvento;
import br.unicamp.MC322A.login.Usuario;

import java.text.NumberFormat;

public class NovaOfertaOuvinte implements Ouvinte<NovaOfertaEvento> {
    private final Usuario usuario;

    public NovaOfertaOuvinte(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void processarEvento(NovaOfertaEvento evento) {
        String conteudo = "Olá " + usuario.getNome() + "\n" +
            "Temos uma nova oferta pra você!\n" +
            "O pacote de viagens " + evento.getConteudo().getPacote().getNome() +
            " acabou de entrar em promoção! Apenas " +
            NumberFormat.getCurrencyInstance().format(evento.getConteudo().getValor());

        System.out.println("Simulando o envio de email de promoção: \n");
        System.out.println(new Email("sistema-turismo@MC322A.edu", usuario.getEmail(), "Nova oferta!!", conteudo));
    }
}
