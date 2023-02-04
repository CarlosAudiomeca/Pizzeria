package com.cjimenezro.pizzeria.domain.models;

import java.util.PrimitiveIterator;

public class PizzaCarbonara extends Pizza{
    private Boolean quesoAzul;
    private Boolean quesoCabra;

    //Funciones

    public Boolean getQuesoAzul() {
        return quesoAzul;
    }

    public void setQuesoAzul(Boolean quesoAzul) {
        this.quesoAzul = quesoAzul;
    }

    public Boolean getQuesoCabra() {
        return quesoCabra;
    }

    public void setQuesoCabra(Boolean quesoCabra) {
        this.quesoCabra = quesoCabra;
    }
}
