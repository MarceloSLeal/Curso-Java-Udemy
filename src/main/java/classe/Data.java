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
//        this(1, 1, 1970); //opção de chamar outro construtor dentro de um constutor, só da pra fazer isso dentro de um construtor.
    }

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {

        //Para adicionar um 0 a esquerda para os meses e dias menores que 10
        String dataMes = String.format("%0" + 2 + "d", mes);
        String dataDia = String.format("%0" + 2 + "d", dia);

        return String.format("%s/%s/%d", dataDia, dataMes, ano);
    }

}
