package oo.heranca.teste;

import oo.heranca.desafio01.Civic;
import oo.heranca.desafio01.Ferrari;

public class carroTeste {

    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(400);
        Civic c1 = new Civic();

        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();

        f1.ligarTurbo();
        f1.ligarAr();
        f1.acelerar();
        f1.desligarTurbo();
        f1.desligarAr();

        System.out.println(f1.velocidadeDoAr());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        f1.frear();
        f1.frear();
        System.out.println("Velocidade final Ferrari " + f1.frear());

        c1.frear();
        c1.frear();
        System.out.println("Velocidade final Civic " + c1.frear());

    }

}
