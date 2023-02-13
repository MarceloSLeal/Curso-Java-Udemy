package controle.exercicios;

import java.util.Scanner;

public class Nono {

    // Crie um programa que recebe 10 valores e ao final imprima o
    // maior número.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroNovo = 0;
        int numeroMaior = 0;

        System.out.println("Digite 10 números, o programa irá mostrar o maior digitado");

        for (int i = 0; i < 10; i++) {

            numeroNovo = entrada.nextInt();

            if (numeroNovo > numeroMaior) {
                numeroMaior = numeroNovo;
            }

        }

        System.out.println("O maior número digitado foi: " + numeroMaior);


    }

}
