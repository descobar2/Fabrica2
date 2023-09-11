package com.fabrica;

public class FabricarSilla extends Factory {

    @Override
    public Producto armarMueble(){
           
        return new Silla();
    }
}

