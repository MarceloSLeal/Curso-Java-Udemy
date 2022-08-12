package fundamentos;

public class DesafioAritmeticos {

    // desafio resolvendo uma fórmula usando operadores aritméticos
    public static void main(String[] args) {

        double expr1 = Math.pow( (( 3 + 2 ) * 6), 2) / ( 3 * 2);

        double expr2 = Math.pow( (1 - 5) * (2 - 7) / 2, 2);

        double expr3 = expr1 - expr2;

        double expr4 = Math.pow(expr3, 3) / Math.pow(10, 3);

        System.out.println(expr1);
        System.out.println(expr2);
        System.out.println(expr3);
        System.out.println(expr4);

    }

}
