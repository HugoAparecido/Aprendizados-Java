package com.fernandakipper.javacourse.pintura;

public interface Pintavel {
    void aplicarTinta();

    String getCor();

    void setCor(String cor);

    String getTipo();

    void setTipo(String tipo);

    String getMarca();

    void setMarca(String marca);

    double getPreco();

    void setPreco(double preco);
}
