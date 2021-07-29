package model;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

public class TDDPedidosModel {
    private LocalDate inicio;
    private LocalDate termino;
    private Integer totalizador;

    public TDDPedidosModel(LocalDate inicio, LocalDate termino, Integer totalizador) {
        this.inicio = inicio;
        this.termino = termino;
        this.totalizador = totalizador;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Integer getTotalizador() {
        return totalizador;
    }

    public void setTotalizador(Integer totalizador) {
        this.totalizador = totalizador;
    }
}
