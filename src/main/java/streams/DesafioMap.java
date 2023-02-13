package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    /* Desafio
    1 - Número para String binário... 6 -> "110"
    2 - Inverter a String... "110" -> "011"
    3 - Converter de volta para inteiro -> "011" -> 3
     */

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<String> printString = System.out::println;
        Consumer<Integer> printInt = System.out::println;

        UnaryOperator<String> inverteString = inverter ->
                new StringBuilder(inverter).reverse().toString();

        Function<String, Integer> converteInt = c -> Integer.parseInt(c, 2);

        nums.stream()
                .forEach(printInt);

        System.out.println("");

        nums.stream()
                .map(Integer::toBinaryString)
//                .map(inverteString)
                .forEach(printString);

        System.out.println("");

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverteString)
                .forEach(printString);

        System.out.println("");

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverteString)
                .map(converteInt)
                .forEach(printInt);

    }

}
