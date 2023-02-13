package oo.composicao;

import java.util.*;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionaItem(String nome, int quantidade, double preco) {
        itens.add(new Item(nome, quantidade, preco));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total+= item.quantidade * item.preco;
        }

        return total;
    }

}
