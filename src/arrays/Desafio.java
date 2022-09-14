package arrays;

import java.util.Scanner;

public class Desafio {

    //Desafio, criar um array com base em um número passado pelo usuário
    //adicionar notas nesse array do começo ao fim dentro de um laço
    //criar outro laço para fazer o cálculo da média, da pra fazer um um único laço mas o desafio pede dois laços \o/
    //no laço de cálculo da média usar foreach
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroNotas;

        System.out.println("Informe a quantidade de notas que serão calculadas");

        numeroNotas = entrada.nextInt();

        double[] arrayNotas = new double[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {

            System.out.println("Informe a " + ( i + 1) + "ª " + "nota");

            double a = entrada.nextDouble();

            arrayNotas[i] = a;
        }

        double somaNotas = 0;
        for (double a: arrayNotas) {
            somaNotas += a;
        }

        double media = somaNotas / numeroNotas;
        System.out.printf("A médias do total de %d notas é %.02f", numeroNotas, media);

    }

}
