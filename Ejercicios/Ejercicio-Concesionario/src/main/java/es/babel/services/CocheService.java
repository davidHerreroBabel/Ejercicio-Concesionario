package es.babel.services;

import es.babel.models.coches.Audi;
import es.babel.models.coches.BMW;
import es.babel.models.coches.Coche;
import es.babel.models.coches.Porsche;
import es.babel.models.piezas.Motor;
import es.babel.models.piezas.Pieza;
import es.babel.models.piezas.Rueda;
import es.babel.models.piezas.TuboEscape;
import es.babel.repositories.*;

import java.util.HashMap;

public class CocheService implements ICocheService {

    private final ICocheRepository cocheRepository = new CocheRepository();
    private final IPiezaRepository piezaRepository = new PiezaRepository();

    @Override
    public void comprarCoche(String tipoCoche) {
        Coche coche = obtenerTipoCoche(tipoCoche);
        cocheRepository.anadirCoche(coche);
    }

    @Override
    public void venderCoche(String tipoCoche) {
        Coche coche = obtenerTipoCoche(tipoCoche);
        cocheRepository.eliminarCoche(coche);
    }

    @Override
    public HashMap<Coche, Integer> getCoches() {
        return cocheRepository.obtenerCoches();
    }

    @Override
    public void comprarPieza(String tipoPieza) {
        Pieza pieza = obtenerTipoPieza(tipoPieza);
        piezaRepository.anadirPieza(pieza);
    }

    @Override
    public void venderPieza(String tipoPieza) {
        Pieza pieza = obtenerTipoPieza(tipoPieza);
        piezaRepository.eliminarPieza(pieza);
    }

    @Override
    public HashMap<Pieza, Integer> getPiezas() {
        return piezaRepository.obtenerPiezas();
    }

    private static Coche obtenerTipoCoche(String tipoCoche) {
        if (tipoCoche.equals("BMW")) {
            return new BMW("Hola");
        }
        else if (tipoCoche.equals("Audi")) {
            return new Audi("Hola");
        }
        else {
            return new Porsche("Hola");
        }
    }

    private static Pieza obtenerTipoPieza(String tipoPieza) {
        if (tipoPieza.equals("Motor")) {
            return new Motor("BMW");
        }
        else if (tipoPieza.equals("Rueda")) {
            return new Rueda("Delantera");
        }
        else {
            return new TuboEscape("BMW");
        }
    }

}
