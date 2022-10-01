package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> item = new ArrayList<>();

    void adicionarItem(Item itens) {
        this.item.add(itens);
    }

    double calculaTotalCompra () {

        double total = 0;

        for (int i = 0; i < item.size(); i++) {

            for (int j = 0; j < item.get(i).quantidade.size(); j++) {

                total += item.get(i).produto.get(j).preco *
                        item.get(i).quantidade.get(j);

            }
        }
        return total;
    }

    void calculaPorItem() {
        double parcial;

        for (int i = 0; i < item.size(); i++) {

            parcial =0;
            for (int j = 0; j < item.get(i).quantidade.size(); j++) {

                parcial += item.get(i).produto.get(j).preco *
                        item.get(i).quantidade.get(j);

            }
            System.out.println("Valor total da compra do item " + (i + 1) + " " + parcial);
        }

    }

}
