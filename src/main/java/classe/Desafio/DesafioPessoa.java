package classe.Desafio;

import classe.Desafio.DesafioComida;

import java.util.ArrayList;

public class DesafioPessoa {

    String nomePessoa;
    double pesoPessoa;
    double pesoInicial;
    ArrayList <String> pratos = new ArrayList<>();

    DesafioPessoa(String nome, double peso) {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
        this.pesoInicial = peso;
    }

    void comeu(DesafioComida c1) {
        this.pesoPessoa += c1.pesoComida;
        pratos.add(c1.nomeComida); //adicionando um novo ítem no array para cada novo prato
    }

    void conta() {
        System.out.println("--------");
        System.out.printf("Peso inicial do(a) cliente %s %.2f Kg", nomePessoa, pesoInicial);

        System.out.println("\nQuais pratos a pessoa comeu:");

        for (int i = 0; i < pratos.size(); i++) {
            System.out.println(pratos.get(i));
        }

        System.out.printf("Peso final do(a) cliente %s %.2f Kg\n", nomePessoa, pesoPessoa);

    }

}
