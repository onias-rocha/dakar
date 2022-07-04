package com.mercadolivre.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Corrida {
    private double distancia;
    private double premio;
    private String nome;
    private int numVeicPermitidos;
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<ViaturaMoto> salvaVidasMoto = new ArrayList<>();
    private List<ViaturaAuto> salvaVidasAuto = new ArrayList<>();


    //de classe

    public void addCarro(Carro carro){
        veiculos.add(carro);
    }

    public void addMoto(Motocicleta moto){
        veiculos.add(moto);
    }

    public void deleteVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa){
        Veiculo paraDeletar = null;

        for(int i =0; i<veiculos.size(); i++){
            if(veiculos.get(i).getPlaca().equals(placa)){
                paraDeletar = veiculos.get(i);
            }
        }

        if(paraDeletar!=null){
            this.deleteVeiculo(paraDeletar);
        } else {
            System.out.println("O veículo não foi encontrado");
        }
    }

    public Veiculo defineVencedor(){
        Veiculo vencedor = null;
        Double highscore = Double.MIN_VALUE;
        Double currentScore = 0.0;
        for(Veiculo veiculo: veiculos){
            currentScore = veiculo.getVelocidade() * (veiculo.getAceleracao() / 2) / (veiculo.getAnguloDeGiro()*(veiculo.getPeso() - veiculo.getRodas()*100));
            if(currentScore>highscore){
                highscore = currentScore;
                vencedor = veiculo;
            }
        }
        return vencedor;
    }

    public void addViaturaMoto(ViaturaMoto viatura){
        salvaVidasMoto.add(viatura);
    }

    public void addViaturaAuto(ViaturaAuto viatura){
        salvaVidasAuto.add(viatura);
    }



    //getters e setters


    public List<ViaturaMoto> getSalvaVidasMoto() {
        return salvaVidasMoto;
    }

    public void setSalvaVidasMoto(List<ViaturaMoto> salvaVidasMoto) {
        this.salvaVidasMoto = salvaVidasMoto;
    }

    public List<ViaturaAuto> getSalvaVidasAuto() {
        return salvaVidasAuto;
    }

    public void setSalvaVidasAuto(List<ViaturaAuto> salvaVidasAuto) {
        this.salvaVidasAuto = salvaVidasAuto;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVeicPermitidos() {
        return numVeicPermitidos;
    }

    public void setNumVeicPermitidos(int numVeicPermitidos) {
        this.numVeicPermitidos = numVeicPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
