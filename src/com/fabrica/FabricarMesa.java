package com.fabrica;

public class FabricarMesa extends Factory{

	@Override
	public Producto armarMueble(){
		
		return new Mesa();
	}

}
