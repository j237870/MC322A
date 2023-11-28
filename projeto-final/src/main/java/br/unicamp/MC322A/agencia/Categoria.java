package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.ParametroInvalidoException;

public enum Categoria {
    AVENTURA,
    CULTURA,
    RELAXAMENTO;

    public static Categoria porCodigo(int categoriaDestino) {
        if (categoriaDestino == 1) {
            return AVENTURA;
        } else if (categoriaDestino == 2) {
            return CULTURA;
        } else if (categoriaDestino == 3) {
            return RELAXAMENTO;
        } else {
            throw new ParametroInvalidoException("Código da categoria inválido");
        }
    }
}
