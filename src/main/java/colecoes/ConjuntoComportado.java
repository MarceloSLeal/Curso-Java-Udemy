package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> lista = new HashSet<String>(); // nesse métodos os ítens são inseridos de forma desordenada
        Set<String> lista = new TreeSet<>(); // nesse método os itens são inseridos e exibidos de forma ordenada
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        for (String i : lista) {
            System.out.println(i);
        }

        Iterator<String> conteudo = lista.iterator();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(conteudo.next());
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (Integer n: nums) {
            System.out.println(n);
        }

    }

}
