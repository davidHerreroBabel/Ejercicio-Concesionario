package es.babel.repositories;

import es.babel.models.coches.Coche;

import java.util.HashMap;

public class CocheRepository implements ICocheRepository {
    private final HashMap<Coche, Integer> stockCoches = new HashMap<>();

    @Override
    public void anadirCoche(Coche coche) {
        if (stockCoches.containsKey(coche)) {
            Integer cantidad = stockCoches.get(coche);
            stockCoches.put(coche, cantidad + 1);
        }
        else {
            stockCoches.put(coche, 1);
        }
    }

    @Override
    public void eliminarCoche(Coche coche) {
        stockCoches.remove(coche);
    }

    @Override
    public HashMap<Coche, Integer> obtenerCoches() {
        return stockCoches;
    }
}
