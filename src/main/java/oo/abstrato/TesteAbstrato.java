package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero a1 = new Cachorro();

        System.out.println(a1.mover());
        System.out.println(a1.mamar());
        System.out.println(a1.respirar());

    }

}
