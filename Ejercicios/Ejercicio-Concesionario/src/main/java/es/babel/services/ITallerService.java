package es.babel.services;

import es.babel.models.coches.Coche;
import es.babel.models.piezas.Pieza;

import java.util.HashMap;

public interface ITallerService {

    HashMap<Coche, Integer> obtenerStockCoches();

     HashMap<Pieza, Integer> obtenerStockPiezas();

}
