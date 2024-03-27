package es.babel.utils;

public class InfoPrinter {

    public void mostrarOpcionesConcesionario() {
        System.out.println(
                "Seleccione la opción que desea realizar: \n" +
                "[1] Comprar un coches \n" +
                "[2] Vender un coches \n" +
                "[3] Ver stock de coches \n" +
                "[4] Ver stock de piezas \n" +
                "[5] Probar un coches \n" +
                "[6] Salir"
        );
    }

    public void mostrarOpcionesProbarCoche() {
        System.out.println(
                "Seleccione la opción que desea realizar: \n" +
                "[1] Arrancar \n" +
                "[2] Girar \n" +
                "[3] Recorrer una calle \n" +
                "[4] Salir"
        );
    }

    public void opcionIncorrecta() {
        System.out.println("Esta opción no existe. Vuelva a introducirla.");
    }

}
