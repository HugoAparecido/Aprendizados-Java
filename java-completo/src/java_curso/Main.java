package java_curso;

// public -> acessíveeel de todo lugar
// default -> quando eu não defino, ele segue esse daqui
// private -> acessível somente dentro da classe que foi definido
// protected -> acessível por todo mundo que está no mesmo pacote

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        Carro meuCarroFurado = null;

        // NullPointerException
        // ArrayOutOfBoundsException
        // RuntimeException
        // IOException
        // ArithmeticException

        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception){
            System.out.println("vende carro furado");
        }
    }
}