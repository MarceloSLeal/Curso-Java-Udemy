package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("fim")) {

            System.out.println("Enquanto não for digitada a palavra 'fim' o programa continuará rodando");
            System.out.println("Digite alguma coisa");

            valor = entrada.nextLine();

        }

        entrada.close();
    }

}
