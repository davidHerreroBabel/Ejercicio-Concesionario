package com.example.SpringBootLiquidaciones.model;

import lombok.Data;

import java.util.Date;

@Data
public class Dano {
    private String motivo;
    private Date antiguedad;
    private ProductWarranty warranty;
}
