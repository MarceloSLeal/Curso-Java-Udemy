package controle.exercicios;

import java.util.Scanner;

public class Setimo {

    /* Criar um programa que enquanto estiver recebendo números
    positivos, imprime no console a soma dos números inseridos, caso
    receba um número negativo, encerre o programa. Tente utilizar a
    estrutura do while.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int numeroTotal = 0;

        do {

            System.out.println("Digite um número inteiro positivo para ir somando");
            System.out.println("Digite um número negativo para encerrar o programa");

            numero = entrada.nextInt();

            if (numero >= 0) {
                numeroTotal += numero;
            }

            System.out.println("Total : " + numeroTotal);

        } while (numero >= 0) ;





    }

}
