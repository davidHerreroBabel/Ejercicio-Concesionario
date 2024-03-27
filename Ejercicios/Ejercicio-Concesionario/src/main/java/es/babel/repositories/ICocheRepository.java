package es.babel.repositories;

import es.babel.models.coches.Coche;

import java.util.HashMap;

public interface ICocheRepository {

    void anadirCoche(Coche coche);

    void eliminarCoche(Coche coche);

    HashMap<Coche, Integer> obtenerCoches();

}
