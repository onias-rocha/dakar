package com.mercadolivre;

import com.mercadolivre.model.*;

public class Main {

    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.setAceleracao(100);
        celta.setPlaca("NPO6969");
        celta.setAnguloDeGiro(60.0);
        celta.setVelocidade(10.0);

        Carro ferrari = new Carro();
        ferrari.setAceleracao(900);
        ferrari.setPlaca("NPO1408");
        ferrari.setAnguloDeGiro(20.0);
        ferrari.setVelocidade(1000.0);

        Motocicleta cb120 = new Motocicleta();
        cb120.setAceleracao(20);
        cb120.setPlaca("NPC5888");
        cb120.setAnguloDeGiro(1.0);
        cb120.setVelocidade(1.0);

        ViaturaAuto hilux = new ViaturaAuto();
        ViaturaMoto cb500 = new ViaturaMoto();

        Corrida dakar = new Corrida();

        dakar.addCarro(celta);
        dakar.addCarro(ferrari);
        dakar.addMoto(cb120);
        dakar.addViaturaMoto(cb500);
        dakar.addViaturaAuto(hilux);

        Veiculo vencedor = dakar.defineVencedor();

        System.out.println("A placa do vencedor é: " + vencedor.getPlaca());

        dakar.getSalvaVidasAuto().get(0).socorrer(ferrari);

        dakar.getSalvaVidasMoto().get(0).socorrer(cb120);

    }
}
