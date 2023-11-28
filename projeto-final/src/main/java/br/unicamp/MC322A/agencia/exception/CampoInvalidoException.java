package br.unicamp.MC322A.agencia.exception;

public class CampoInvalidoException extends RuntimeException {
    public CampoInvalidoException() {
    }

    public CampoInvalidoException(String message) {
        super(message);
    }
}
