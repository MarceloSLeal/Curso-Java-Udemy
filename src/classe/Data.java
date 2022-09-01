package classe;

//Desafio para criar um objeto com atributos de data, dia, mês e ano
public class Data {

    int dia;
    int mes;
    int ano;

    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {

        //Para adicionar um 0 a esquerda para os meses e dias menores que 10
        String dataMes = String.format("%0" + 2 + "d", mes);
        String dataDia = String.format("%0" + 2 + "d", dia);

        return String.format("%s/%s/%d", dataDia, dataMes, ano);
    }

}
