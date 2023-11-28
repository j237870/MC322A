package br.unicamp.MC322A.agencia.exception;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException() {
    }

    public NaoEncontradoException(String message) {
        super(message);
    }
}
