package br.unicamp.MC322A.agencia.suporte;

import java.util.HashMap;
import java.util.Map;

public class Infra {
    private static Map classes = new HashMap<>();

    private Infra() {}

    public static <T> void registrarClasse(Class<T> classe, T obj) {
        try {
            classes.put(classe.getName(), obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T getInstancia(Class<T> classe) {
        return (T) classes.get(classe.getName());
    }
}
