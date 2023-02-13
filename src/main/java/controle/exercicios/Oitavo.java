package controle.exercicios;

import java.util.Scanner;

public class Oitavo {

    // Criar um programa que receba uma palavra e imprime no console
    // letra por letra.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase");
        String palavra = entrada.nextLine();

        for (int i = 0; i < palavra.length(); i++) {

            System.out.println(palavra.charAt(i));

        }

    }

}
