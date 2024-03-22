package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Dano;
import com.example.SpringBootLiquidaciones.model.Siniestro;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class CalculoValService implements ICalculoValService {


    public CalculoValService(){
    }

    @Override
    public Double calcularPrimerRiesgo(Siniestro siniestro, Dano daño) {
        Double capitalInsured = daño.getWarranty().getCapitalInsured();

        Double liquidacionASumar = Math.min(capitalInsured, siniestro.getPolizaAsociada().getImporteCapitalesContratados());
        return liquidacionASumar;
    }

    @Override
    public Double calcularReposicion(Dano daño) {
        return daño.getWarranty().getCapitalInsured();
    }

    @Override
    public Double calcularValorReal(Dano daño, Siniestro siniestro) {
        double capitalInsured = daño.getWarranty().getCapitalInsured();
        double depreciacion = 100/7;

        Calendar calFecha1 = Calendar.getInstance();
        calFecha1.setTime(daño.getAntiguedad());
        Calendar calFecha2 = Calendar.getInstance();
        calFecha2.setTime(siniestro.getFechaDeOcurrencia());

        double antiguedad = calFecha2.get(Calendar.YEAR) - calFecha1.get(Calendar.YEAR);

        double valResidual = capitalInsured * 0.1;
        double total = capitalInsured * antiguedad * depreciacion;

        return Math.max(valResidual,total);
    }
}
