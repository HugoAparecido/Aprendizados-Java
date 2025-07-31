package com.fernandakipper.javacourse.carro;

public class Carro {
    protected String modelo;
    String cor;
    int ano;
    String placa;

    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }

    protected void teste() {
        System.out.println("Teste");
    }
}
