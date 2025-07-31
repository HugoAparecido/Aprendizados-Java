package com.fernandakipper.javacourse.pessoa;

import com.fernandakipper.javacourse.carro.Carro;

public class Gol extends Carro {
    public Gol(String modelo, String cor, int ano, String placa) {
        super(modelo, cor, ano, placa);
        this.modelo = modelo;
    }

    @Override
    public void ligar() {
        System.out.println("Gol ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Gol desligado");
    }
}
