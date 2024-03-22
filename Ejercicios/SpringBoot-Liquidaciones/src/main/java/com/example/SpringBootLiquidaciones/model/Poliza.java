package com.example.SpringBootLiquidaciones.model;

import lombok.Data;

@Data
public class Poliza {
    private Cliente clienteAsociado;
    private Product producto;
    private Integer importeCapitalesContratados;
    private String codigo;

}
