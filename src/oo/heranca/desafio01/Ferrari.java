package oo.heranca.desafio01;

public class Ferrari extends Carro{

    public Ferrari(){
        this(300);
    }

     public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 400;
    }

//    @Override
//    void acelerar() {
//        this.velocidadeAtual += 15;
//    }

}
