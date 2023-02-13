package fundamentos.exercicios;

import java.util.Scanner;

public class Quarto {

    //Exercício 4 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para exibir o valor ao quadrado e ao cubo do que o usuário digitar");

        System.out.println("Digite um valor numérico");
        double valor = entrada.nextDouble();

        System.out.println("Valor ao quadrado " + Math.pow(valor, 2));
        System.out.println("Valor ao cubo " + Math.pow(valor, 3));

    }

}
