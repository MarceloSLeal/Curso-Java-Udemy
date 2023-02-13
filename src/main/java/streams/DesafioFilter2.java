package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter2 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 2000.0, 0.2, 0);
        Produto p2 = new Produto("AirFryer", 300.0, 0.1, 0);
        Produto p3 = new Produto("Caneca", 50.0, 0.30, 0);
        Produto p4 = new Produto("Livro", 80.0, 0.15, 0);
        Produto p5 = new Produto("Perfume", 150.0, 0.2, 0);

        List<Produto> lista = Arrays.asList(p1, p2, p3, p4, p5);

        UnaryOperator<Produto> calculaDesconto = c -> {
            c.preco = c.preco * (1 - c.desconto);
          return c;
        };
        UnaryOperator<Produto> calculaFrete = c -> {
            c.frete = c.preco >= 1000 ? 50 : 20;
            return c;
        };
        Predicate<Produto> maiorDesconto = m -> m.desconto >= 0.2;
        Predicate<Produto> menorFrete = m -> m.frete <= 20;
        Consumer<Produto> print = p -> System.out.println("Nome " + p.nome
                + " Preço " + p.preco + " Frete " + p.frete);

        lista.stream()
                .map(calculaDesconto)
                .map(calculaFrete)
                .filter(maiorDesconto)
                .filter(menorFrete)
                .forEach(print);
    }
}
