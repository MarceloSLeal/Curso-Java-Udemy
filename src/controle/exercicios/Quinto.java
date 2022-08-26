package controle.exercicios;

import java.util.Scanner;

public class Quinto {

    // Refatorar o exercício 04, utilizando a estrutura switch
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para identificar se um número inteiro é um número primo");

        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("não é número primo");
                break;
            case 2:
                System.out.println("é número primo");
                break;
            case 3:
                System.out.println("é número primo");
                break;
            case 4:
                System.out.println("não é número primo");
                break;
            case 5:
                System.out.println("é número primo");
                break;

        }

    }

}
