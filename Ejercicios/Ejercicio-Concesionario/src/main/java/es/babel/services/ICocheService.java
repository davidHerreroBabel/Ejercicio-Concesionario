package es.babel.services;

import es.babel.models.coches.Coche;
import es.babel.models.piezas.Pieza;

import java.util.HashMap;

public interface ICocheService {


    void comprarCoche(String tipoCoche);

    void venderCoche(String tipoCoche);

    HashMap<Coche, Integer> getCoches();

    void comprarPieza(String tipoPieza);

    void venderPieza(String tipoPieza);

    HashMap<Pieza, Integer> getPiezas();
}
