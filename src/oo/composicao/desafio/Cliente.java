package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    List<Compra> compra =new ArrayList<>();

    void adicionarCompra(Compra compras) {
        this.compra.add(compras);
    }

}
