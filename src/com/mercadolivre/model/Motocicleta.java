package com.mercadolivre.model;

public class Motocicleta extends Veiculo{
    private double peso = 300;
    private int rodas = 2;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
