package controle.exercicios;

import java.util.Scanner;

public class Primeiro {

    //Criar um programa que receba um número e verifique se ele está
    // entre 0 e 10 e é par.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10){
            System.out.println("O número digitado está dentro do range estabelecido entre 0 e 10");

            if (numero % 2 == 0) {
                System.out.println("E o número é par");
            }
        } else {
            System.out.println("O número digitado está fora do range estabelecido");
        }

    }

}
