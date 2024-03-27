package es.babel.repositories;

import es.babel.models.piezas.Pieza;

import java.util.HashMap;

public class PiezaRepository implements IPiezaRepository {
    private final HashMap<Pieza, Integer> piezasTaller = new HashMap<>();

    @Override
    public void anadirPieza(Pieza pieza) {
        if (piezasTaller.containsKey(pieza)) {
            Integer cantidad = piezasTaller.get(pieza);
            piezasTaller.put(pieza, cantidad + 1);
        }
        else {
            piezasTaller.put(pieza, 1);
        }
    }

    @Override
    public void eliminarPieza(Pieza pieza) {
        piezasTaller.remove(pieza);
    }

    @Override
    public HashMap<Pieza, Integer> obtenerPiezas() {
        return piezasTaller;
    }

}
