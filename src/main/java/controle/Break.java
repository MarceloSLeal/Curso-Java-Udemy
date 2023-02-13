package controle;

public class Break {

    public static void main(String[] args) {

        //comando break usado para interromper um laço
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Fim!");

    }

}
