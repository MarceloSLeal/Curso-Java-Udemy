package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Sexto {

    /* Jogo da adivinhação: Tentar adivinhar um número entre 0 -100.
    Armazene um número aleatório em uma variável. O jogador tem 10
    tentativas para adivinhar o número gerado. Ao final de cada
    tentativa, imprima a quantidade de tentativas restantes e imprima
    se o número inserido é maior ou menor do que o número
    armazenado.
     */
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroTentativa = 0;
        int quantidadeTentativas = 0;
        boolean acertou  = false;

        int numeroAleatorio = gerador.nextInt(101);

        System.out.println("Tente adivinhar o número gerado aleatóriamente entre 0 e 100");
        System.out.println("Você tem 10 tentativas para acertar, valendo!");

        while (quantidadeTentativas < 10) {

            System.out.println("Tentativa número " + Integer.toString(quantidadeTentativas +1));
            numeroTentativa = entrada.nextInt();

            if (numeroTentativa >= 0 && numeroTentativa <= 100) {

                quantidadeTentativas++;

                if (numeroTentativa > numeroAleatorio) {
                    System.out.println("O número inserido é maior que o número aleatório");
                }
                if (numeroTentativa < numeroAleatorio) {
                    System.out.println("O número inserido é menor que o número aleatório");
                }
                if (numeroTentativa == numeroAleatorio) {
                    System.out.println("Você acertou o número aleatório! :)");
                    acertou = true;
                    break;
                }

            } else {
                System.out.println("Somente números entre 0 e 100");
            }

        }

        if (acertou == false) {
            System.out.println("você não conseguiu acertar o número! :(");
        }

        entrada.close();
    }

}
