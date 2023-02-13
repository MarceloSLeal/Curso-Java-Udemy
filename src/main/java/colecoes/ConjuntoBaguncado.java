package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double o hashset converte tipos primitivos para classes automáticamente
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho da coleção " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho da coleção " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

//        conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Vai manter no conjunto apenas os elementos iguais entre as duas coleções
        System.out.println(conjunto);

        conjunto.clear(); //limpar os elementos
        System.out.println(conjunto);

    }

}
