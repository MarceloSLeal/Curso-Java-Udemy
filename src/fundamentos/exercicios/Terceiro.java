package fundamentos.exercicios;

import java.util.Scanner;

public class Terceiro {

    //Exercício 3 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Progra para colcular o IMC corporal");

        System.out.println("Digite o peso em kg");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura em metros");
        double altura = entrada.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.println("Cáculo do IMC " + imc);

    }

}
