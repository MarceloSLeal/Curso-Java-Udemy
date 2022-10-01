package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {

    List<Produto> produto = new ArrayList<>();
    List<Integer> quantidade = new ArrayList<>();

    void adicionarProduto(Produto prod, int quantidade) {
        this.produto.add(prod);
        this.quantidade.add(quantidade);
    }

}
