package es.babel.utils;

import java.util.Scanner;

public class InfoReader {

    private final Scanner scanner = new Scanner(System.in);

    public String leerOpcionesConcesionario() {
        String opcion = scanner.nextLine();
        switch (opcion) {
            case "1" -> {
                return "Comprar";
            }
            case "2" -> {
                return "Vender";
            }
            case "3" -> {
                return "Stock coches";
            }
            case "4" -> {
                return "Stock piezas";
            }
            case "5" -> {
                return "Probar";
            }
            case "6" -> {
                return "Salir";
            }
            default -> {
                return "Esta opción no existe. Vuelva a introducirla.";
            }
        }
    }

    public String leerOpcionesProbarCoche() {
        String opcion = scanner.nextLine();
        switch (opcion) {
            case "1" -> {
                return "Arrancar";
            }
            case "2" -> {
                return "Girar";
            }
            case "3" -> {
                return "Recorrer";
            }
            case "4" -> {
                return "Salir";
            }
            default -> {
                return "Esta opción no existe. Vuelva a introducirla.";
            }
        }
    }

}
