package com.example.SpringBootLiquidaciones.model.DTO;

import lombok.Data;

import java.util.List;

@Data
public class SiniestroDTO {
    private String idPoliza;
    private String fecha;
    private String causa;
    private List<String> danos;

}
