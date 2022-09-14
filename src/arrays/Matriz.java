package arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de alunos");
        int numeroAlunos = entrada.nextInt();

        System.out.println("Informe o número de notas");
        int numeroNotas = entrada.nextInt();

        double[][] classeA = new double[numeroAlunos][numeroNotas];
        double[] mediaAlunosClasseA = new double[numeroAlunos];

        for(int i = 0; i < classeA.length; i++) {

            for (int j = 0; j < classeA[i].length; j ++) {

                System.out.println("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno");

                classeA[i][j] = entrada.nextDouble();
            }
        }

        //calculando a média individual de cada aluno
        double media = 0;
        int cont = 0;
        for (int i = 0; i < classeA.length; i++) {

            cont = 0;
            media = 0;
            for (int j = 0; j < classeA[i].length; j++) {

                media += classeA[i][j];
                cont ++;
            }

            mediaAlunosClasseA[i] = media / cont;
        }

        //exibindo a média individual de cada aluno
        for (int i = 0; i < mediaAlunosClasseA.length; i++) {

            System.out.println("Média das notas do " + (i + 1) + "º aluno = " + mediaAlunosClasseA[i]);
        }

        //calculando a média geral da turma
        media = 0;
        cont = 0;
        for (int i = 0; i < numeroAlunos; i++) {

            for (int j = 0; j < numeroNotas; j++) {

                media += classeA[i][j];
                cont ++;
            }
        }

        System.out.println("Média das notas da classe = " + (media / cont));


    }

}
