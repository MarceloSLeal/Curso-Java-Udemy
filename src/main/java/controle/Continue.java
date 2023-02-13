package controle;

public class Continue {

    //comando continue para interromper o laço que estiver rodando
    // e pular para o pŕoximo
    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println(i);
        }

    }

}
