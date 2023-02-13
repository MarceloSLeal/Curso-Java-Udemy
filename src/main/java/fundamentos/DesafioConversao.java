package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    //Desafio para inserir três valores de salário pelo terminal, converter em double e exibir a média
    //a conversão deve aceitar separação por vírgula ou ponto
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        String valor1 =  entrada.nextLine().replace(",", ".");

        System.out.println("Segundo valor: ");
        String valor2 = entrada.nextLine().replace(",", ".");

        System.out.println("Terceiro valor: ");
        String valor3 = entrada.nextLine().replace(",", ".");

        double val1 = Double.parseDouble(valor1);
        double val2 = Double.parseDouble(valor2);
        double val3 = Double.parseDouble(valor3);

        double resultado = (val1 + val2 + val3) / 3;

        System.out.println("Valor médio entre os três valores: " + String.format("%.2f", resultado));

    }

}
