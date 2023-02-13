package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("Desafio calculadora");
        System.out.println("Digite os dois primeiros números e o símbolo da operação");
        System.out.println("Em seguida receba o resultado");
        System.out.println("---------------------------------------------------------");

        System.out.println("Digite o primeiro valor");
        double valor1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = entrada.nextDouble();
        System.out.println("Digite a operação, apenas símbolos: + - * / % ");
        String op = entrada.next().trim().toLowerCase();

        double resultado = "+".equals(op) ? (valor1 + valor2) :
                           "-".equals(op) ? (valor1 - valor2) :
                           "*".equals(op) ? (valor1 * valor2) :
                           "/".equals(op) ? (valor1 / valor2) :
                           "%".equals(op) ? (valor1 % valor2) : 0;

        System.out.println("Resultado " + valor1 + " " + op + " " + valor2 + " = " + resultado);

        entrada.close();

    }

}
