package fundamentos;

public class Aritmeticos {

    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.printf("%.2f\n", x + y);
        System.out.printf("%.2f\n", x - y);
        System.out.printf("%.2f\n", x * y);
        System.out.printf("%.2f\n", x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.printf("%.2f", a / (double) b);

        //Operador módulo, retorna o resto da divisão
        System.out.println(a % b);
        System.out.println(8 % 3);

    }

}
