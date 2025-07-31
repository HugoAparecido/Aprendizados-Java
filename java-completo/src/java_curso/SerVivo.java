package java_curso;

public abstract class SerVivo {
    protected int idade;

    public abstract void respirar();

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public void dormir() {
        System.out.println("dormindo...");
    }
}
