package classe;

import java.util.Arrays;

//Desafio para estanciar o objeto Data
public class DataTeste {

    public static void main(String[] args){

        Data dat1 = new Data();
        Data dat2 = new Data();

        dat1.dia = 10;
        dat1.mes = 10;
        dat1.ano = 2010;

        dat2.dia = 22;
        dat2.mes = 02;
        dat2.ano = 2022;

        System.out.printf("Primeira data: %d/%d/%d\n", dat1.dia, dat1.mes, dat1.ano);
        System.out.printf("Segunda data: %d/%d/%d", dat2.dia, dat2.mes, dat2.ano);

    }

}
