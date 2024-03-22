package com.example.SpringBootLiquidaciones.controller;

import com.example.SpringBootLiquidaciones.model.DTO.SiniestroDTO;
import com.example.SpringBootLiquidaciones.service.ISiniestrosService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/siniestro")
public class SiniestroController {

    private ISiniestrosService siniestrosService;

    public SiniestroController(ISiniestrosService siniestrosService){
        this.siniestrosService = siniestrosService;
    }

    @PostMapping(value = "/alta")
    public boolean altaSiniestro(@RequestBody SiniestroDTO siniestroDTO) {
        return siniestrosService.validarDatos(siniestroDTO.getDanos(), siniestroDTO.getCausa(),
                siniestroDTO.getFecha(), siniestroDTO.getIdPoliza());

    }

}
