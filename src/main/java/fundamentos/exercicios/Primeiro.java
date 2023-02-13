package fundamentos.exercicios;

import java.util.Scanner;

public class Primeiro {

    //Exercício 1 do capítulo de fundamentos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para converter uma temperatura Fahrenheit em Celcius");

        System.out.println("Didite o valor da temperatura");
        double temp = entrada.nextDouble();

        double tempFinal = (temp - 32) * (5.0 / 9.0);

        System.out.println("Temperatura em Celcius " + tempFinal);

    }

}
