package com.cjimenezro.pizzeria.presentation;

import com.cjimenezro.pizzeria.domain.models.Horno;
import com.cjimenezro.pizzeria.domain.models.PizzaBarbacoa;
import com.cjimenezro.pizzeria.domain.models.PizzaCampera;
import com.cjimenezro.pizzeria.domain.models.PizzaCarbonara;

public class Main {
    public static void main(String[] args) {

        Horno horno1 = new Horno();
        horno1.setId("1");
        horno1.setNombre("El caliente");
        horno1.setMarca("Bosch");
        horno1.setTempMax("900ºC");

        Horno horno2 = new Horno();
        horno2.setId("2");
        horno2.setNombre("El Sol");
        horno2.setMarca("balay");
        horno2.setTempMax("5505ºC");

        PizzaBarbacoa pizzaBarbacoa = new PizzaBarbacoa();
        pizzaBarbacoa.setId("1");
        pizzaBarbacoa.setNombre("Paco");
        pizzaBarbacoa.setSalsa("tomate");
        pizzaBarbacoa.setExtras("queso");
        pizzaBarbacoa.setPicante(true);
        pizzaBarbacoa.setHorno(horno1);

        PizzaCarbonara pizzaCarbonara = new PizzaCarbonara();
        pizzaCarbonara.setId("1");
        pizzaCarbonara.setNombre("Eustakia");
        pizzaCarbonara.setSalsa("brava");
        pizzaCarbonara.setExtras("queso");
        pizzaCarbonara.setQuesoAzul(true);
        pizzaCarbonara.setQuesoCabra(false);
        pizzaCarbonara.setHorno(horno2);

        PizzaCampera pizzaCampera = new PizzaCampera();
        pizzaCampera.setId("1");
        pizzaCampera.setNombre("Luis");
        pizzaCampera.setSalsa("rosa");
        pizzaCampera.setExtras("queso");
        pizzaCampera.setCarne(true);
        pizzaCampera.setHorno(horno1);


    }
}