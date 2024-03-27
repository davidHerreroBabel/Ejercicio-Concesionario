package es.babel.repositories;

import es.babel.models.piezas.Pieza;

import java.util.HashMap;

public interface IPiezaRepository {
    void anadirPieza(Pieza pieza);

    void eliminarPieza(Pieza pieza);

    HashMap<Pieza, Integer> obtenerPiezas();
}
