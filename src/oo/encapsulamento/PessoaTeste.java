package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Marcelo", "Leal", -41);
        p1.setIdade(200);

        System.out.println(p1.getNomeCompleto());
        System.out.println(p1.getIdade());

        System.out.println(p1);

    }

}
