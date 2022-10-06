package oo.heranca.desafio01;

public class Carro {

    int velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 5;
    }

    int frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
        return velocidadeAtual;
    }

}
