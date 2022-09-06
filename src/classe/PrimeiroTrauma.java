package classe;

public class PrimeiroTrauma {

    int a = 3; // não pode mexer aqui!
    static int b = 4; // criando uma variável static para ser acessível dentro do método main
    // que é static, para acessar a variável a tive que Instanciar a classe "PrimeiroTrauma"

    //Desafio para fazer essa declaração de variável ser acessível dentro do método main
    public static void main(String[] args) {

        PrimeiroTrauma t1 = new PrimeiroTrauma();
        System.out.println(t1.a);

        System.out.println(b);

    }

}
