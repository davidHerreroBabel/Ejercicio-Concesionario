package es.babel.controllers;

import es.babel.models.coches.Coche;
import es.babel.models.piezas.Pieza;
import es.babel.services.CocheService;
import es.babel.services.ICocheService;

import java.util.Map;


public class TallerController {

    private final ICocheService cocheService = new CocheService();

    public Map<Coche, Integer> obtenerStockCoches() {
        return cocheService.getCoches();
    }

    public Map<Pieza, Integer> obtenerStockPiezas() {
        return cocheService.getPiezas();
    }

}
