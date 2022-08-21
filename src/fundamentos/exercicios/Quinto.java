package fundamentos.exercicios;

import java.util.Scanner;

public class Quinto {

    //Exercício 5 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para calcular a área de um triângulo");

        System.out.println("Digite a base do triângulo");
        double base = entrada.nextDouble();

        System.out.println("Digite a altura do triângulo");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo " + area);

    }

}
