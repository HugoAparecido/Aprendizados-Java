package com.fernandakipper.javacourse.carro;

public class Gol {
    Carro carro;

    public Gol(Carro carro) {
        this.carro = carro;
        this.carro.teste();
        this.carro.modelo = "Gol";
    }
}
