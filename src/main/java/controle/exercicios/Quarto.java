package controle.exercicios;

import java.util.Scanner;

public class Quarto {

    // Criar um programa que receba um número e diga se ele é um
    // número primo.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para identificar se um número inteiro é um número primo");

        int numero = entrada.nextInt();

        if (numero % 2 != 0) {

            if (numero == 1) {
                System.out.println("não é número primo");
            } else {
                System.out.println("é número primo");
            }

        } else {

            if (numero == 2) {
                System.out.println("é número primo");
            } else {
                System.out.println("não é número primo");
            }

        }
    }

}
