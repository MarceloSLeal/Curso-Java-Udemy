package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        //trabalho na terça (V ou F)
        //trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = true;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Tv de 50 polegadas");
        System.out.println(trabalho1 && trabalho2);

        System.out.println("Tv de 32 polegadas");
        System.out.println(trabalho1 ^ trabalho2);

        System.out.println("Tomar sorvete");
        System.out.println(trabalho1 || trabalho2);

        System.out.println("Mais saudável? " + !comprouSorvete);

    }

}
