package oo.heranca.desafio01;

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
