package com.cjimenezro.pizzeria.domain.models;

public class Pizza {
    private String id;
    private String nombre;
    private String salsa;
    private String extras;
    private Horno horno;

    //Funciones

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public Horno getHorno() {
        return horno;
    }

    public void setHorno(Horno horno) {
        this.horno = horno;
    }
}
