package java_curso;

public class Sandero implements Carro {
    final int limiteDeVelocidade = 150;
    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando");
        }
        System.out.println("Velocidade atual " + this.velocidadeAtual);
    }

    @Override
    public void frear() {

    }

    @Override
    public void parar() {

    }
}
