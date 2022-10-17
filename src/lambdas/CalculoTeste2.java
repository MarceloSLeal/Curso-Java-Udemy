package lambdas;

public class CalculoTeste2 {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(2, 3));

        System.out.println(calculo.executar2());

    }
}
