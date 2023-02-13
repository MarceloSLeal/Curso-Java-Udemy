package lambdas;

import java.util.function.Function;

public class Desafio {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
        1. A partir do produto calcular o preço real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
        3. Frete: >= 3000 (100)/ < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoReal = a -> a.preco * (1 - a.desconto);
        Function<Double, Double> impostoMunicipal = a -> a >= 2500 ? a * 1.085 : a;
        Function<Double, Double> frete = a -> a >= 3000 ? a + 100 : a + 50;
        Function<Double, Double> arredondar = a -> Double.parseDouble(String.format("%.2f", a).replace(",", "."));
        Function<Double, String> formatar = a -> ("R$" + a).replace(".", ",");

        System.out.println(precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p));
    }
}
