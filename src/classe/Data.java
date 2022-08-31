package classe;

//Desafio para criar um objeto com atributos de data, dia, mês e ano
public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {

        //Para adicionar um 0 a esquerda para os meses menores que 10
        String dataMes = String.format("%0" + 2 + "d", mes);

        return String.format("%d/%s/%d", dia, dataMes, ano);
    }

}
