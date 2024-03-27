package es.babel.controllers;

import es.babel.services.CocheService;
import es.babel.services.ICocheService;
import es.babel.utils.InfoPrinter;
import es.babel.utils.InfoReader;

public class CocheController {

    private final ICocheService cocheService = new CocheService();
    private final InfoPrinter infoPrinter = new InfoPrinter();
    private final InfoReader infoReader = new InfoReader();

    public void comprar(String tipoCoche) {
        cocheService.comprarCoche(tipoCoche);
    }

    public void vender(String tipoCoche) {
        cocheService.venderCoche(tipoCoche);
    }

    public void probar() {
        infoPrinter.mostrarOpcionesProbarCoche();
        String opcion = infoReader.leerOpcionesProbarCoche();
        switch (opcion) {
            case "Arrancar" -> arrancar();
            case "Girar" -> girar();
            case "Recorrer" -> recorrerCalle();
            default -> infoPrinter.opcionIncorrecta();
        }
    }

    private void arrancar() {

    }

    private void girar() {

    }

    private void recorrerCalle() {

    }

}
