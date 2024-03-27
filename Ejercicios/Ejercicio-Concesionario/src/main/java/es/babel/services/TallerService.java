package es.babel.services;

import es.babel.models.coches.Coche;
import es.babel.models.piezas.Pieza;
import es.babel.repositories.*;

import java.util.HashMap;

public class TallerService implements ITallerService {

    private final ICocheRepository cocheRepository = new CocheRepository();
    private final IPiezaRepository piezaRepository = new PiezaRepository();

    @Override
    public HashMap<Coche, Integer> obtenerStockCoches() {
        return cocheRepository.obtenerCoches();
    }

    @Override
    public HashMap<Pieza, Integer> obtenerStockPiezas() {
        return piezaRepository.obtenerPiezas();
    }
}
