package com.fabrica;

public class Mesa implements Producto{

    @Override
    public void fabricarMueble(){
        System.out.println("Fabricando mesa");
    }
}
