package classe;

//Desafio para estanciar o objeto Data
public class DataTeste {

    public static void main(String[] args){

        Data dat1 = new Data();
        Data dat2 = new Data(15, 10, 1980);

        System.out.println(dat1.obterDataFormatada());
        System.out.println(dat2.obterDataFormatada());

    }

}
