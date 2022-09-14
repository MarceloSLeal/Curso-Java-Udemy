package classe.Desafio;

public class DesafioJantar {

    public static void main(String[] args) {

        DesafioPessoa p1 = new DesafioPessoa("João", 80);
        DesafioPessoa p2 = new DesafioPessoa("Maria", 55);

        DesafioComida c1 = new DesafioComida("Porção de Feijão", 0.1);
        DesafioComida c2 = new DesafioComida("Porção de arroz", 0.1);
        DesafioComida c3 = new DesafioComida("Feijoada", 0.3);
        DesafioComida c4 = new DesafioComida("Lasanha", 0.3);
        DesafioComida c5 = new DesafioComida("Salada", 0.1);
        DesafioComida c6 = new DesafioComida("Pizza", 0.5);
        DesafioComida c7 = new DesafioComida("Bife carne", 0.3);
        DesafioComida c8 = new DesafioComida("Frango parmegiana", 0.3);

        p1.comeu(c1);
        p1.comeu(c2);
        p1.comeu(c4);
        p1.comeu(c5);
        p1.conta();

        p2.comeu(c1);
        p2.comeu(c2);
        p2.comeu(c3);
        p2.comeu(c6);
        p2.conta();

    }

}
