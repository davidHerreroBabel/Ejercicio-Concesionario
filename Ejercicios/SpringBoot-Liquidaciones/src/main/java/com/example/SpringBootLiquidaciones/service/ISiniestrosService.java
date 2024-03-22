package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Dano;

import java.util.List;

public interface ISiniestrosService {

    public void generarSiniestro();

    public boolean validarDatos(List<String> danos, String causaSiniestro, String fecha, String codigoPoliza);

}
