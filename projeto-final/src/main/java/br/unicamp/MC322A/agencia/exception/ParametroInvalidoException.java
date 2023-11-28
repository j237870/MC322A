package br.unicamp.MC322A.agencia.exception;

public class ParametroInvalidoException extends RuntimeException {
    public ParametroInvalidoException() {
    }

    public ParametroInvalidoException(String message) {
        super(message);
    }
}
