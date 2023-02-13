package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        //Desafio usando o While
        //Calcular a média das notas que forem inseridas no console
        //somar todas as notas em uma variável
        //armazenar em uma variável quantas notas foram inseridas
        //para encerrar o laço o uruário vai digitar o valor -1
        //só valem notas válidas, entre 0 e 10

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double notasTotal = 0;
        int quantAlunos = 0;

        while (nota != -1) {

            System.out.println("Programa para calcular a média de notas");
            System.out.println("Insira uma nota válida entre 0 e 10");
            System.out.println("Para encerrar digite -1");

            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notasTotal += nota;
                quantAlunos ++;
            } else {
                System.out.println("nota inválida para calcular");

                if (nota == -1){
                    System.out.println("Encerrando e exibindo a média");
                }
            }

        }

        double media = notasTotal / quantAlunos;

        System.out.printf("Nota média de um total de %d alunos: %.2f", quantAlunos, media);

    }

}
