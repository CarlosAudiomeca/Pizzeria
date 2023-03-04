package com.cjimenezro.pizzeria.domain.models;

public class PizzaBarbacoa extends Pizza{
    private Boolean picante;

    //Funciones

    public Boolean getPicante() {
        return picante;
    }

    public void setPicante(Boolean picante) {
        this.picante = picante;
    }
}
