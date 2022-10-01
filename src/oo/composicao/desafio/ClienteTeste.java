package oo.composicao.desafio;

import org.w3c.dom.ls.LSOutput;

public class ClienteTeste {

    public static void main(String[] args) {

        Produto prod1 = new Produto("Álcool em gel", 15.5);
        Produto prod2 = new Produto("Açucar", 6.10);
        Produto prod3 = new Produto("Fone Ouvido", 50);
        Produto prod4 = new Produto("Livro", 40);

        Item item1 = new Item();
        Item item2 = new Item();

        item1.adicionarProduto(prod1, 10);
        item1.adicionarProduto(prod2, 5);
        item1.adicionarProduto(prod3, 2);
        item1.adicionarProduto(prod4, 1);

        item2.adicionarProduto(prod3, 2);

        Compra compra1 = new Compra();

        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);

        Cliente cliente1 = new Cliente();

        cliente1.adicionarCompra(compra1);

        System.out.println("Valor total dos produtos " +
                cliente1.compra.get(0).calculaTotalCompra());

        cliente1.compra.get(0).calculaPorItem();

    }
}
