package controle.exercicios;

import java.util.Scanner;

public class Terceiro {

    /* Criar um programa que receba duas notas parciais, calcular a
    média final. Se a nota do aluno for mario ou igual a 7.0 imprime no
    console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0
    imprime no console "Recuperação", caso contrário imprime no
    console "Reprovado".
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroNotas = 0;
        double notasSomadas = 0;
        double media = 0;

        while (numeroNotas < 2) {

            System.out.println("Digite uma nota " + String.valueOf(numeroNotas +1) + " de 2");
            double nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notasSomadas += nota;
                numeroNotas++;
            } else {
                System.out.println("Nota " + nota + " inválida");
            }
        }

        media = notasSomadas / numeroNotas;
        System.out.printf("A média das notas é %.2f\n", media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7 && media > 4) {
            System.out.println("Recuperação");
        } else System.out.println("Reprovado");

    }

}
