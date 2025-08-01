package com.fernandakipper.javacourse.carro;

import com.fernandakipper.javacourse.pintura.Pintavel;

public class Carro implements Pintavel {
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

    @Override
    public void aplicarTinta() {

    }

    @Override
    public String getCor() {
        return "";
    }

    @Override
    public void setCor(String cor) {

    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public void setTipo(String tipo) {

    }

    @Override
    public String getMarca() {
        return "";
    }

    @Override
    public void setMarca(String marca) {

    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public void setPreco(double preco) {

    }
}
