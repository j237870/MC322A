package br.unicamp.MC322A.agencia;

import br.unicamp.MC322A.agencia.exception.CampoInvalidoException;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Periodo {
    private final LocalDateTime dataSaida;
    private final LocalDateTime dataRetorno;

    public Periodo(LocalDateTime dataSaida, LocalDateTime dataRetorno) {
        if (!isPeriodoValido(dataSaida, dataRetorno)) {
            throw new CampoInvalidoException("Data de saída não deve ser posterior a data de retorno");
        }

        this.dataSaida = dataSaida;
        this.dataRetorno = dataRetorno;
    }

    public Periodo(String dataSaida, String dataRetorno) {
        this(LocalDateTime.parse(dataSaida, DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            LocalDateTime.parse(dataRetorno, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public static boolean isPeriodoValido(LocalDateTime d1, LocalDateTime d2) {
        return d1.isBefore(d2) || d1.isEqual(d2);
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public LocalDateTime getDataRetorno() {
        return dataRetorno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Periodo periodo = (Periodo) o;
        return Objects.equals(dataSaida, periodo.dataSaida) && Objects.equals(dataRetorno, periodo.dataRetorno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSaida, dataRetorno);
    }

    @Override
    public String toString() {
        return "Periodo{" +
            "dataSaida=" + dataSaida +
            ", dataRetorno=" + dataRetorno +
            '}';
    }
}
