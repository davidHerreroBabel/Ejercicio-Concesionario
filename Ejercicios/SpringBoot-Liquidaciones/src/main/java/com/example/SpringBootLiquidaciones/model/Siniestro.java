package com.example.SpringBootLiquidaciones.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Siniestro {
    private Poliza polizaAsociada;
    private Date fechaDeOcurrencia;
    private String causa;
    private List<Dano> listaDeDaños;
    //TODO BORRAR
    private List<String> listaDeDanos;

    public Dano getDaño(int index){
        return listaDeDaños.get(index);
    }

}
