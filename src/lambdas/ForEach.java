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

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);


    }

}
