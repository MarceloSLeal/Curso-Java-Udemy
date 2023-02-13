package fundamentos.exercicios;

import java.util.Scanner;

public class Segundo {

    //Exercício 2 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para converter temperatura em Celcius para Fahrenheit");

        System.out.println("Digite uma temperatura em Celcius");
        double temp = entrada.nextDouble();

        double tempFinal = (temp * (9.0 / 5.0) + 32);

        System.out.println("Temperatura em Fahrenheit " + tempFinal);

    }

}
