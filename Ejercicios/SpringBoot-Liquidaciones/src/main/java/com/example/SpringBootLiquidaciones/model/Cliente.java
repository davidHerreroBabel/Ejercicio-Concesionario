package com.example.SpringBootLiquidaciones.model;

import lombok.Data;

@Data
public class Cliente {
    private String nombre;
    private String contraseña;
    private String direcion;
    private String nif;
    private String contacto;
    private Poliza poliza;

}
