package com.fabrica;

public class Main {

	public static void main(String[] args) {

		Factory fabrica;
		fabrica = new FabricarMesa();

		Producto mesa = fabrica.armarMueble();
		mesa.fabricarMueble();

		fabrica = new FabricarSilla();
		Producto silla = fabrica.armarMueble();
		silla.fabricarMueble();
	}
}
