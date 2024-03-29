package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        // Offer e Add -> adicionam elementos na fila
        //Diferença é o comportamento ocorre
        // quando a fila está cheia!
        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o pŕoximo elemento
        // da fila (sem remover)

        // Diferença é o comportamento ocorre
        // quando a fila está vazia!
        System.out.println(fila.peek()); //retorna null se a fila estiver vazia
        System.out.println(fila.element()); //lança uma exeção

        System.out.println("---------");


        System.out.println(fila.poll()); //retorna null quando está vazia
        System.out.println(fila.remove()); // lança uma exceção quando está vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains("...");

    }

}
