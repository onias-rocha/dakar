package com.mercadolivre.model;

public class ViaturaMoto extends Veiculo{

    public void socorrer(Motocicleta moto){
        System.out.println("Socorro Moto " + moto.getPlaca());
    }
}
