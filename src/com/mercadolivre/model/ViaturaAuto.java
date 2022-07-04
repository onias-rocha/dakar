package com.mercadolivre.model;

public class ViaturaAuto extends Veiculo{
    public void socorrer(Carro carro){
        System.out.println("Socorro Carro " + carro.getPlaca());
    }
}
