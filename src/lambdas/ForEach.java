package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01");
        aprovados.forEach( n -> System.out.println(n + " !!!"));

        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02");
        aprovados.forEach( n -> meuImprimir(n));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(ForEach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }

}
