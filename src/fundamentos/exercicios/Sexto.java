package fundamentos.exercicios;

import java.util.Scanner;

public class Sexto {

    //Exercício 6 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para resolver a equação de Bhaskara");
        System.out.println("Dada a seguinte fórmula delta = b2 - 4.a.c");
        System.out.println("Informe os valores de a, b e c");

        System.out.println("Valor de a");
        double a = entrada.nextDouble();

        System.out.println("Valor de b");
        double b = entrada.nextDouble();

        System.out.println("Valor de c");
        double c = entrada.nextDouble();

        double x = 0;

        double resultado = (Math.pow(b, 2)) - 4 * (a * c);

        System.out.println("Resultado " + resultado);
    }

}
