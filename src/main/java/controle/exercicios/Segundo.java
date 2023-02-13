package controle.exercicios;

import java.util.Scanner;

public class Segundo {

    //Criar um programa que informa se o ano atual é um ano bissexto;
    public static void main(String[] args) {

        System.out.println("Programa para informar se o ano digitado é bissexto");
        System.out.println("Digite um ano, apenas números");

        Scanner entrada = new Scanner(System.in);

        int ano = entrada.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano digitado " + ano + " é bissexto");
        } else {
            System.out.println("O ano digitado " + ano + " não é bissexto");
        }

    }

}
