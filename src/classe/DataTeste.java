package classe;

//Desafio para estanciar o objeto Data
public class DataTeste {

    public static void main(String[] args){

        Data dat1 = new Data();
        Data dat2 = new Data();

        dat1.dia = 10;
        dat1.mes = 6;
        dat1.ano = 2010;

        dat2.dia = 22;
        dat2.mes = 2;
        dat2.ano = 2022;

        System.out.println(dat1.obterDataFormatada());
        System.out.println(dat2.obterDataFormatada());
    }

}
