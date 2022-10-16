package oo.heranca.desafio01;

public interface Luxo {

    void ligarAr();
    void desligarAr();

    //Exemplo de como um método dentro de uma interface não necessarimente precisa ser
    //implementado
    default int velocidadeDoAr() {
        return 1;
    }

}
