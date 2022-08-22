package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        //Domingo -> 1
        //quarta -> 4
        //terça -> 3
        //Desafio de uso do If e Else
        //Digitar os dias da semana e informar o número de cada semana
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite por extenso o nome do dia da semana");
        String dia = entrada.next().toUpperCase();
        int diaNumero = 0;

        if (dia.equals("DOMINGO")) {
            diaNumero = 1;
        } else {
            if (dia.equals("SEGUNDA")) {
                diaNumero = 2;
            } else {
                if (dia.equals("TERÇA")) {
                    diaNumero = 3;
                } else {
                    if (dia.equals("QUARTA")) {
                        diaNumero = 4;
                    } else {
                        if (dia.equals("QUINTA")) {
                            diaNumero = 5;
                        } else {
                            if (dia.equals("SEXTA")) {
                                diaNumero = 6;
                            } else {
                                if (dia.equals("SÁBADO")) {
                                    diaNumero = 7;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("O número do dia na semana " + diaNumero);
        //Uma outra forma de usar os Ifs, mas eu não gosto muito dela :p
        if (dia.equals("DOMINGO"))
            diaNumero = 1;
        else if (dia.equals("SEGUNDA"))
            diaNumero = 2;
        else if (dia.equals("TERÇA"))
            diaNumero = 3;
        else if (dia.equals("QUARTA"))
            diaNumero = 4;
        else if (dia.equals("QUINTA"))
            diaNumero = 5;
        else if (dia.equals("SEXTA"))
            diaNumero = 6;
        else if (dia.equals("SÁBADO"))
            diaNumero = 7;

        System.out.println("O número do dia na semana " + diaNumero);

    }

}
