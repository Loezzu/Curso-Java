package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(300);
        Opala opala = new Opala();

        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

        ferrari.acelerar();
        ferrari.acelerar();
        opala.acelerar();
        opala.acelerar();

        System.out.println("1ª volta");
        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

        ferrari.frear();
        opala.frear();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        System.out.println("2ª volta");
        System.out.println("Ferrari => " + ferrari);
        System.out.println("Opala => " + opala);

    }
}
