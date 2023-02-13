package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        System.out.println("Produto " + p1.nome);
        System.out.println("Preço " + p1.preco);
        System.out.println("Desconto " + Produto.desconto);

        double precoFinal1 = p1.precoComDesconto();
        System.out.printf("Preço com desconto: R$%.2f", precoFinal1);

        Produto.desconto = 0.50;
        precoFinal1 = p1.precoComDesconto();
        System.out.printf("\nPreço com desconto de natal : R$%.2f", precoFinal1);

    }

}
