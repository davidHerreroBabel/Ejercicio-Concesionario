package es.babel.controllers;

import es.babel.utils.InfoPrinter;
import es.babel.utils.InfoReader;

public class ConcesionarioController {
    private final InfoPrinter infoPrinter = new InfoPrinter();
    private final InfoReader infoReader =  new InfoReader();
    private final CocheController cocheController = new CocheController();
    private final TallerController tallerController = new TallerController();
    private boolean finalizarPrograma = false;

    public void run() {
        while (!finalizarPrograma) {
            infoPrinter.mostrarOpcionesConcesionario();
            String opcion = infoReader.leerOpcionesConcesionario();
            tratarOpcion(opcion);
        }
    }

    private void tratarOpcion(String opcion) {
        switch (opcion) {
            case "Comprar" -> cocheController.comprar("Audi");
            case "Vender" -> cocheController.vender("Audi");
            case "Stock coches" -> {
                tallerController.obtenerStockCoches();
                //infoPrinter.mostrarValor();
            }
            case "Stock piezas" -> {
                tallerController.obtenerStockPiezas();
                //infoPrinter.mostrarValor();
            }
            case "Probar" -> cocheController.probar();
            case "Salir" -> finalizarPrograma = true;
            default -> infoPrinter.opcionIncorrecta();
        }
    }

}
