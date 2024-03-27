package es.babel;

import es.babel.controllers.ConcesionarioController;

public class Main {

	private static final ConcesionarioController concesionarioController = new ConcesionarioController();

	public static void main(String[] args) {
		concesionarioController.run();
	}

}
