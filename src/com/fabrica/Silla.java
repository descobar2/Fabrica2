package com.fabrica;

    public class Silla implements Producto{
        
        @Override
        public void fabricarMueble(){
            System.out.println("Fabricando silla");
        }
}
