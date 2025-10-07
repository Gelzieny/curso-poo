import Animal.Cachorro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rodrigo";
        cachorro.cor = "Vermelho";
        cachorro.altura = 25;
        cachorro.peso = 120;
        cachorro.tamanhoDoRabo = 10;


        cachorro.latir();
        System.out.println(cachorro.pegar());
        System.out.println("O carro está " + cachorro.interagir("nada"));
    }
}