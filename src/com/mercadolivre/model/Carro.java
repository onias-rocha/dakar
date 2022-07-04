package com.mercadolivre.model;

public class Carro extends Veiculo {
    private double peso = 1000;
    private int rodas = 4;

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int getRodas() {
        return rodas;
    }

    @Override
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
