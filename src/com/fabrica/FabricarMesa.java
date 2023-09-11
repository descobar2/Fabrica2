package com.fabrica;

public class FabricarMesa extends Fabrica{

	@Override
	public void FabricarMueble() {
		// TODO Auto-generated method stub
		return new Mesa();
	}

}
