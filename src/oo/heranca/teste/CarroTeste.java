package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Opala;

public class CarroTeste {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(400);
        Opala opala = new Opala();

        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();
        ferrari.acelerar();
        ferrari.frear();

        opala.acelerar();
        opala.acelerar();

        System.out.println("1ª volta");
        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

        ferrari.acelerar();
        ferrari.frear();

        opala.frear();
        opala.acelerar();

        System.out.println("2ª volta");
        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

    }
}
