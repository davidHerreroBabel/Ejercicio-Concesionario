package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Dano;
import com.example.SpringBootLiquidaciones.model.Siniestro;

public interface ICalculoValService {
    public Double calcularPrimerRiesgo(Siniestro siniestro, Dano daño);
    public Double calcularReposicion(Dano daño);
    public Double calcularValorReal(Dano daño, Siniestro siniestro);
}
